package com.oe.onlineeducation_demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.Gson;
import com.oe.onlineeducation_demo.entity.Course;
import com.oe.onlineeducation_demo.entity.Teacher_Course;
import com.oe.onlineeducation_demo.mapper.CourseMapper;
import com.oe.onlineeducation_demo.mapper.TeacherCourseMapper;
import com.oe.onlineeducation_demo.service.ITeacherCourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oe.onlineeducation_demo.vo.CourseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
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
public class TeacherCourseServiceImpl extends ServiceImpl<TeacherCourseMapper, Teacher_Course> implements ITeacherCourseService {
    @Autowired
    private CourseMapper cMapper;

    @Autowired
    private TeacherCourseMapper tMapper;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Gson gson=new Gson();

    @Override
    public int addCourse(CourseVo course) {
        String checkS="select count(*) from course where course_name='"+course.getCourseName()+"'";
        int check=jdbcTemplate.queryForObject(checkS,Integer.class);
        if(check==1)
            return 808;

        Course c=new Course();
        c.setCourseName(course.getCourseName());
        c.setEnd(course.getEnd());
        c.setStart(course.getStart());
        c.setIntro(course.getIntro());
        c.setStatus(0);
        c.setType(course.getType());
        c.setStudentNum(0);

        String format = c.getCourseName();
        // File folder = new File(realPath + format);
        File folder=new File("D:/图片/course_im");
        if (!folder.isDirectory())
        {
            if (!folder.mkdirs())
            {
                return 808;
            }
        }
        String oldName=course.getImage().getOriginalFilename();
        assert oldName !=null;
        String newName=format+oldName.substring(oldName.lastIndexOf("."));
        try
        {
            course.getImage().transferTo(new File(folder, newName));
            //以上都是普通代码, 这里的/files/ 对应的就是你在WebMvcConfig设置的地址映射
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        String path="D:/图片/course_im/"+newName;
        c.setImage(path);
        cMapper.insert(c);
        String sql="select count(*) from course where course_name='"+c.getCourseName()+"'";
        int success=jdbcTemplate.queryForObject(sql,Integer.class);
        if(success==1)
            return 800;
        return 808;
    }

    @Override
    public int deleteCourse(Integer course_id) {
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.eq("course_id",course_id);
        cMapper.delete(wrapper);
        Map<String,Object> map=new HashMap<>();
        
    }

    @Override
    public int deleteTC(Integer tc_id) {
        return 0;
    }

    @Override
    public int updateCourse(CourseVo course) {
        return 0;
    }

    @Override
    public int CNumforT(Integer user_id) {
        return 0;
    }

    @Override
    public String showAllC(Integer user_id) {
        return null;
    }

    @Override
    public String showStuPrc(Integer course_id) {
        return null;
    }

    @Override
    public String showStuGrd(Integer course_id) {
        return null;
    }

    @Override
    public void ExcInGrd() {

    }

}
