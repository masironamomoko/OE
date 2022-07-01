package com.oe.onlineeducation_demo.entity1;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("chapter")
public class Chapter implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "chapter_id", type = IdType.AUTO)
    private Integer chapter_id;

    private Integer course_id;
    private String chapter_name;
    private String video;
    private String outline;
    private Integer homework_id;
}