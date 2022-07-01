package com.oe.onlineeducation_demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
public class FriendList implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "FL_id", type = IdType.AUTO)
    private Integer flId;

    private Integer friendId;

    private Integer userId;

    private String friendName;


}
