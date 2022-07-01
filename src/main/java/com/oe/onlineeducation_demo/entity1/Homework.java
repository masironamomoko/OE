package com.oe.onlineeducation_demo.entity1;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("homework")
public class Homework implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "homework_id", type = IdType.AUTO)
    private Integer homework_id;

    private String homework_title;
    private String content;
    private Integer chapter_id;
    private String image;
    @TableField(fill= FieldFill.INSERT)
    private Date date;
}