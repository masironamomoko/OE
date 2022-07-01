package com.oe.onlineeducation_demo.entity1;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("question")
public class Question implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "question_id", type = IdType.AUTO)
    private Integer question_id;

    private String theme;
    private String content;
    @TableField(fill= FieldFill.INSERT)
    private Date edit_time;
    private Integer likes_num;
    private Integer user_id;
    private Integer answer_num;
    private Integer chapter_id;
}