package com.oe.onlineeducation_demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableLogic;
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
public class Course implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "course_id", type = IdType.AUTO)
    private Integer courseId;

    private String courseName;

    private Date start;

    private Date end;

    private String intro;

    private Integer studentNum;

    private String introVideo;

    private String image;

    private Integer type;

    /**
     * 0：未删除
1：已删除
     */
    @TableLogic
    private Integer status;


}
