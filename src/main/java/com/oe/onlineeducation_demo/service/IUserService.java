package com.oe.onlineeducation_demo.service;

import com.oe.onlineeducation_demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author momoko
 * @since 2022-06-29
 */
public interface IUserService extends IService<User> {
    public int selectid(String user_name);
}
