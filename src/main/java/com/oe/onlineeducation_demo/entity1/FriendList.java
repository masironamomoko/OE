package com.oe.onlineeducation_demo.entity1;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("friend_list")
public class FriendList implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "FL_id", type = IdType.AUTO)
    private Integer FL_id;

    private Integer friend_id;
    private Integer user_id;
    private String friend_name;
}