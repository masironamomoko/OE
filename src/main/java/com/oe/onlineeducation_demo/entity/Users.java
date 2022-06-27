package com.oe.onlineeducation_demo.entity;

import lombok.Data;

@Data
public class Users {
    private Integer user_id;
    private String password;
    private String user_name;
    private Integer role_id;  //角色
    private String organization;
    private String real_name;
    private String user_number;//学工号
    private String headshot;  //头像
    private String phone;
    private String email;
}
