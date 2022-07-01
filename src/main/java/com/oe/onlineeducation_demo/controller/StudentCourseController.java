package com.oe.onlineeducation_demo.controller;


import com.oe.onlineeducation_demo.entity.Course;
import com.oe.onlineeducation_demo.service.IStudentCourseService;
import com.oe.onlineeducation_demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
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
@RequestMapping("/studentCourse")
public class StudentCourseController {
    @Autowired
    @Resource
    private IStudentCourseService service;

    @RequestMapping("/showCourse")
    public String showCourse(@RequestBody Map<String,Object> param){
        Integer type=Integer.parseInt(param.get("type").toString());
        return service.showCourse(type);
    }

    @RequestMapping("/addCourse")
    public int addCourse(@RequestBody Map<String,Object> param){
        Integer stu_id=Integer.parseInt(param.get("stu_id").toString());
        Integer c_id=Integer.parseInt(param.get("course_id").toString());
        return service.addCourse(stu_id,c_id);
    }

    @RequestMapping("/updateSC")
    public void updateSC(@RequestBody Map<String,Object> param){
        Integer stu_id=Integer.parseInt(param.get("stu_id").toString());
        Integer c_id=Integer.parseInt(param.get("course_id").toString());
        Integer process=Integer.parseInt(param.get("process").toString());
        service.updateSC(stu_id,c_id,process);
    }

    @RequestMapping("/showSCSingle")
    public String showSCSingle(@RequestBody Map<String,Object> param){
        Integer sc_id=Integer.parseInt(param.get("sc_id").toString());
        return service.showSCSingle(sc_id);
    }

    @RequestMapping("/findSCAll")
    public String findSCAll(@RequestBody Map<String,Object> param){
        Integer stu_id=Integer.parseInt(param.get("stu_id").toString());
        return service.findSCAll(stu_id);
    }

    @RequestMapping("/deleteSC")
    public int deleteSC(@RequestBody Map<String,Object> param){
        Integer sc_id=Integer.parseInt(param.get("sc_id").toString());
        return service.deleteSC(sc_id);
    }

    @RequestMapping("/showDetail")
    public String shouDetail(@RequestBody Map<String,Object> param){
        Integer course_id=Integer.parseInt(param.get("course_id").toString());
        return service.showDetail(course_id);
    }
}

