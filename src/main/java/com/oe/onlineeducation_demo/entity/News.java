package com.oe.onlineeducation_demo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author momoko
 * @since 2022-06-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class News implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "news_id", type = IdType.AUTO)
    private Integer newsId;

    private String title;

    private String content;

    private String image;

    @TableField(fill= FieldFill.INSERT)
    private Date date;

    private Integer teacherId;


}
