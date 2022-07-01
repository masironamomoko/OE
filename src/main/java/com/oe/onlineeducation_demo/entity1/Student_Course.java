package com.oe.onlineeducation_demo.entity1;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("student_course")
public class Student_Course implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "SC_id", type = IdType.AUTO)
    private Integer SC_id;

    private Integer stu_id;
    private Integer course_id;
    private Integer score;
    private Float process;
}