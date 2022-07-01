package com.oe.onlineeducation_demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.Gson;
import com.oe.onlineeducation_demo.entity.Course;
import com.oe.onlineeducation_demo.entity.StudentCourse;
import com.oe.onlineeducation_demo.mapper.CourseMapper;
import com.oe.onlineeducation_demo.mapper.StudentCourseMapper;
import com.oe.onlineeducation_demo.service.IStudentCourseService;
import com.oe.onlineeducation_demo.util.ReadPic;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author momoko
 * @since 2022-06-29
 */
@Service
public class StudentCourseServiceImpl extends ServiceImpl<StudentCourseMapper, StudentCourse> implements IStudentCourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private StudentCourseMapper scmapper;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Gson gson=new Gson();

    @Override
    public String showCourse(Integer type) {
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.eq("type",type);
        List<Course> courses= courseMapper.selectList(wrapper);
        return gson.toJson(courses);
    }

    @Override
    public int addCourse(Integer stu_id, Integer c_id) {
        StudentCourse sc=new StudentCourse();
        sc.setStuId(stu_id);
        sc.setCourseId(c_id);
        sc.setProcess(0);
        sc.setScore(0);
        scmapper.insert(sc);
        String sql="select count(*) from student_course where stu_id="+stu_id+" and course_id='"+c_id+"'";
        int suc= jdbcTemplate.queryForObject(sql,Integer.class);
        if(suc==1)
            return 800;
        return 808;
    }

    @Override
    public void updateSC(Integer stu_id, Integer c_id, Integer process) {
        QueryWrapper wrapper=new QueryWrapper();
        Map<String,Object> map=new HashMap<>();
        map.put("stu_id",stu_id);
        map.put("course_id",c_id);
        wrapper.allEq(map);
        StudentCourse sc=scmapper.selectOne(wrapper);
        sc.setProcess(process);
        scmapper.updateById(sc);
    }

    @Override
    public String showSCSingle(Integer sc_id) {
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.eq("sc_id",sc_id);
        StudentCourse sc=scmapper.selectOne(wrapper);
        return gson.toJson(sc);
    }

    @Override
    public String findSCAll(Integer stu_id) {
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.eq("stu_id",stu_id);
        List<StudentCourse> studentCourses=scmapper.selectList(wrapper);
        return gson.toJson(studentCourses);
    }

    @Override
    public int deleteSC(Integer sc_id) {
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.eq("sc_id",sc_id);
        scmapper.delete(wrapper);
        String sql="select deleted from student_course where sc_id="+sc_id;
        int success=jdbcTemplate.queryForObject(sql,Integer.class);
        if(success==1)
            return 800;
        return 808;
    }

    @Override
    public String showDetail(Integer course_id) {
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.eq("course_id",course_id);
        Course course=courseMapper.selectOne(wrapper);
        course.setImage(ReadPic.getBaseImg(course.getImage()));
        return gson.toJson(course);
    }

    @Override
    public String showCourseKey(String keyword) {
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.like("course_name",keyword);
        List<Course> courses= courseMapper.selectList(wrapper);
        return gson.toJson(courses);
    }

    @Override
    public String showCourseOn(Date date) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String format=sdf.format(date);
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.ge("end",format);
        wrapper.le("start",format);
        List<Course> courses=courseMapper.selectList(wrapper);
        return gson.toJson(courses);
    }

    @Override
    public String showCoursePre(Date date) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String format=sdf.format(date);
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.ge("start",format);
        List<Course> courses=courseMapper.selectList(wrapper);
        return gson.toJson(courses);
    }

    @Override
    public String showCourseAft(Date date) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String format=sdf.format(date);
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.le("end",format);
        List<Course> courses=courseMapper.selectList(wrapper);
        return gson.toJson(courses);
    }

}
