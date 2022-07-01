package com.oe.onlineeducation_demo.controller;


import com.oe.onlineeducation_demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
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
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Resource private IUserService userService;

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list",userService.list());
        return modelAndView;
    }

    @GetMapping("/selectId")
    public int selectId(@RequestBody Map<String,Object> param){
        String user_name=(String) param.get("user_name");
        return userService.selectid(user_name);
    }
}

