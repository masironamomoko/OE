package com.oe.onlineeducation_demo.entity1;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("course_catalog")
public class Course_Catalog {
    private static final long serialVersionUID = 1L;
    @TableId(value = "CC_id", type = IdType.AUTO)

    private String name;
    private Integer parent_id;
}
