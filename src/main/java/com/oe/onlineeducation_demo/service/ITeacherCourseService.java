package com.oe.onlineeducation_demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oe.onlineeducation_demo.entity.Teacher_Course;
import com.oe.onlineeducation_demo.vo.CourseVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author momoko
 * @since 2022-06-29
 */
public interface ITeacherCourseService extends IService<Teacher_Course> {
    int addCourse(CourseVo course);//新增课程
    int deleteCourse(Integer course_id);//删除课程
    int deleteTC(Integer tc_id);//删除教师-课程关系
    int updateCourse(CourseVo course);//更新课程
    int CNumforT(Integer user_id);//根据教师id查询负责课程数
    String showAllC(Integer user_id);//根据教师id查询其负责的所有课程
    String showStuPrc(Integer course_id);//根据课程id查询学习该课程学生的进度
    String showStuGrd(Integer course_id);//根据课程id查询学生成绩
    void ExcInGrd();//老师导入学生成绩表
}
