package com.oe.onlineeducation_demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("teacher_course")
public class Teacher_Course implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "TC_id", type = IdType.AUTO)
    private Integer TC_id;

    private Integer teacher_id;
    private Integer course_id;
}