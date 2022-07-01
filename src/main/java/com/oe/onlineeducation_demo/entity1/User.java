package com.oe.onlineeducation_demo.entity1;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value="user")
public class User {
    @TableId(type=IdType.AUTO)
    private long user_id;
    private String password;
    private String user_name;
    private Integer role;  //角色
    private String organization;
    private String real_name;
    private String user_number;//学工号
    private String headshot;  //头像
    private String phone;
    private String email;
    private Integer age;
    private Integer sex;
}
