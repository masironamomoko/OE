package com.oe.onlineeducation_demo.entity1;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("news")
public class News implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId("news_id")
    private Integer news_id;

    private String title;
    private String image;
    @TableField(fill= FieldFill.INSERT)
    private Date date;
    private Integer teacher_id;
}
