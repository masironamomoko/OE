package com.oe.onlineeducation_demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class Homework implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "homework_id", type = IdType.AUTO)
    private Integer homeworkId;

    private String homeworkTitle;

    private String content;

    private Integer chpaterId;

    private String image;

    private Date date;


}
