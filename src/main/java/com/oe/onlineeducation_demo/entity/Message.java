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
public class Message implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "message_id", type = IdType.AUTO)
    private Integer messageId;

    private String content;

    @TableField(fill= FieldFill.INSERT)
    private Date time;

    private Integer senderId;

    private Integer receiverId;


}
