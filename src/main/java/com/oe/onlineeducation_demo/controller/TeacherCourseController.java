package com.oe.onlineeducation_demo.controller;


import com.oe.onlineeducation_demo.service.ITeacherCourseService;
import com.oe.onlineeducation_demo.vo.CourseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author momoko
 * @since 2022-06-29
 */
@RestController
@RequestMapping("/teacherCourse")
public class TeacherCourseController {
    @Autowired
    @Resource
    private ITeacherCourseService service;

    @RequestMapping(value="/addCourse",method = RequestMethod.POST)
    @ResponseBody
    public int addCourse(HttpServletRequest req) throws ParseException {
        MultipartHttpServletRequest params=((MultipartHttpServletRequest) req);
        MultipartFile file=((MultipartHttpServletRequest) req).getFile("image");
        CourseVo course=new CourseVo();
        course.setImage(file);
        course.setCourseName(params.getParameter("course_name"));
        String date=params.getParameter("end");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date dateTime=sdf.parse(date);
        course.setEnd(dateTime);
        date=params.getParameter("start");
        dateTime=sdf.parse(date);
        course.setStart(dateTime);
        course.setIntro(params.getParameter("intro"));
        course.setType(Integer.valueOf(params.getParameter("type")));
        return service.addCourse(course);
    }

    @RequestMapping(value="deleteCause")
    public int deleteCourse(@RequestBody Map<String,Object> param){
        Integer course_id=Integer.parseInt(param.get("course_id").toString());
        return service.deleteCourse(course_id);
    }

    @RequestMapping(value="deleteTc")
    public int deleteTC(@RequestBody Map<String,Object> param){
        Integer tc_id=Integer.parseInt(param.get("tc_id").toString());
        return service.deleteTC(tc_id);
    }

    @RequestMapping(value="updateCourse",method = RequestMethod.POST)
    @ResponseBody
    public int updateCourse(HttpServletRequest req) throws ParseException {
        MultipartHttpServletRequest params=((MultipartHttpServletRequest) req);
        MultipartFile file=((MultipartHttpServletRequest) req).getFile("image");
        CourseVo course=new CourseVo();
        course.setImage(file);
        course.setCourseName(params.getParameter("course_name"));
        String date=params.getParameter("end");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date dateTime=sdf.parse(date);
        course.setEnd(dateTime);
        date=params.getParameter("start");
        dateTime=sdf.parse(date);
        course.setStart(dateTime);
        course.setIntro(params.getParameter("intro"));
        course.setType(Integer.valueOf(params.getParameter("type")));
        return service.updateCourse(course);
    }

    @RequestMapping(value = "CNumforT")
    public int CNumforT(@RequestBody Map<String,Object> param){
        Integer user_id=Integer.parseInt(param.get("user_id").toString());
        return service.CNumforT(user_id);
    }

    @RequestMapping(value = "showAllC")
    public String showAllC(@RequestBody Map<String,Object> param){
        Integer user_id=Integer.parseInt(param.get("user_id").toString());
        return service.showAllC(user_id);
    }

    @RequestMapping(value = "showStuPrc")
    public String showStuPrc(@RequestBody Map<String,Object> param){
        Integer course_id=Integer.parseInt(param.get("course_id").toString());
        return service.showStuPrc(course_id);
    }

    @RequestMapping(value = "showStuGrd")
    public String showStuGrd(@RequestBody Map<String,Object> param) {
        Integer course_id = Integer.parseInt(param.get("course_id").toString());
        return service.showStuPrc(course_id);
    }
}

