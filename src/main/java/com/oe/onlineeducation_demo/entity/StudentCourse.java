package com.oe.onlineeducation_demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

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
public class StudentCourse implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "SC_id", type = IdType.AUTO)
    private Integer scId;

    private Integer stuId;

    private Integer courseId;

    private Integer score;

    private Integer process;

    @TableLogic
    private Integer deleted;

}
