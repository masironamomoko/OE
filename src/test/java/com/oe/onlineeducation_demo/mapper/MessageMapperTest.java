package com.oe.onlineeducation_demo.mapper;

import com.oe.onlineeducation_demo.entity.Message;
import com.oe.onlineeducation_demo.mapper.MessageMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MessageMapperTest {
@Autowired
    private MessageMapper mapper;

@Test
    void save(){
    Message m=new Message();
    m.setContent("我想睡觉");
    m.setReceiverId(2);
    m.setSenderId(1);
    mapper.insert(m);
}
}