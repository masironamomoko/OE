package com.oe.onlineeducation_demo.entity1;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("message")
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "message_id", type = IdType.AUTO)
    private Integer message_id;

    private String content;
    @TableField(fill= FieldFill.INSERT)
    private Date time;
    private Integer sender_id;
    private Integer receiver_id;
}