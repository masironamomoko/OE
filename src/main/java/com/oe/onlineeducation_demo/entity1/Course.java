package com.oe.onlineeducation_demo.entity1;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
@TableName("course")
public class Course {
    private static final long serialVersionUID = 1L;
    // 主鍵
    @TableId(value = "course_id", type = IdType.AUTO)
    private Integer course_id;
    private String course_name;
    @TableField(fill= FieldFill.INSERT)
    private Date start;
    @TableField(fill= FieldFill.INSERT)
    private Date end;
    private String intro;
    private Integer student_num;
    private String intro_video;
    private String image;
    private String type;
    @TableLogic
    private Integer status;
}
