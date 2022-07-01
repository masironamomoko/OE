package com.oe.onlineeducation_demo.service.impl;

import com.oe.onlineeducation_demo.entity.User;
import com.oe.onlineeducation_demo.mapper.UserMapper;
import com.oe.onlineeducation_demo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author momoko
 * @since 2022-06-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    protected JdbcTemplate jdbcTemplate;

    @Override
    public int selectid(String user_name) {
        String sql="select user_id from user where user_name="+user_name;
        int id=jdbcTemplate.queryForObject(sql,Integer.class);
        System.out.println(id);
        return id;
    }
}
