package com.oe.onlineeducation_demo.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CourseMapperTest {
@Autowired
    private CourseMapper mapper;

    @Test
    void delete(){
        mapper.deleteById(1);
    }
    @Test
    void search(){
        mapper.selectList(null).forEach(System.out::println);
    }
}