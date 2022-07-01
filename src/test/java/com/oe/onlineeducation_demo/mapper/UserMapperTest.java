package com.oe.onlineeducation_demo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.oe.onlineeducation_demo.entity.User;
import com.oe.onlineeducation_demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper mapper;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    void test(){
        mapper.selectList(null).forEach(System.out::println);
    }
    @Test
    void save(){
        User user= new User();
        user.setUserName("小红");
        user.setPassword("111");
        user.setHeadshot("0");
        user.setPhone("12345678902");
        user.setRealName("小红");
        mapper.insert(user);
    }
    @Test
    void select(){
        //不加任何条件的查询
        //mapper.selectList(null);
        //单条件查询
        QueryWrapper wrapper=new QueryWrapper();
        //wrapper.eq("sex","0");
        //wrapper.gt("age",20);
        //wrapper.like("user_name","张");
        wrapper.inSql("age","select age from user where age<20");
        wrapper.orderByAsc("age");
        mapper.selectList(wrapper).forEach(System.out::println);

        //多条件查询
        Map<String,Object> map=new HashMap<>();
        map.put("user_name","小明");
        map.put("sex","0");
        wrapper.allEq(map);
        System.out.println(mapper.selectList(wrapper));

        mapper.selectBatchIds(Arrays.asList(1,2,3)).forEach(System.out::println);
    }
}