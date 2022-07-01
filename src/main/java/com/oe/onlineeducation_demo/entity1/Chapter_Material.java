package com.oe.onlineeducation_demo.entity1;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("chapter_material")
public class Chapter_Material implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "CM_id", type = IdType.AUTO)
    private Integer CM_id;
    @TableField
    private Integer chapter_id;
    private String name;
    private String content;
    @TableField(fill= FieldFill.INSERT_UPDATE)
    private Date upload_date;
}
