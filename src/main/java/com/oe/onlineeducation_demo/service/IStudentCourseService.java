package com.oe.onlineeducation_demo.service;

import com.oe.onlineeducation_demo.entity.Course;
import com.oe.onlineeducation_demo.entity.StudentCourse;
import com.baomidou.mybatisplus.extension.service.IService;
import com.oe.onlineeducation_demo.mapper.ChapterMaterialMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author momoko
 * @since 2022-06-29
 */
public interface IStudentCourseService extends IService<StudentCourse> {
    String showCourse(Integer type);//显示所有课程
    int addCourse(Integer stu_id,Integer c_id);//学生添加课程
    void updateSC(Integer stu_id,Integer c_id,Integer process);//更新学习进度
    String showSCSingle(Integer sc_id);//显示学生学习某课程的所有信息
    String findSCAll(Integer stu_id);//显示指定学生所选所有课程
    int deleteSC(Integer sc_id);//从学生的课程库中删除课程
    String showDetail(Integer course_id);//根据课程id显示课程细节
    String showCourseKey(String keyword);//根据关键词查询课程
    String showCourseOn(Date date);//查询开课状态的课程
    String showCoursePre(Date date);//查询未开课状态的课程
    String showCourseAft(Date date);//查询已结课状态的课程
}
