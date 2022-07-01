package com.oe.onlineeducation_demo.entity1;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("question_answer")
public class Question_Answer implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "QA_id", type = IdType.AUTO)
    private Integer QA_id;

    private Integer question_id;
    private Integer user_id;
    private String content;
    private Integer likes_num;
}
