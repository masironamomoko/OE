package com.oe.onlineeducation_demo.mapper;

import com.oe.onlineeducation_demo.entity.ChapterMaterial;
import com.oe.onlineeducation_demo.entity1.Chapter_Material;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Chapter_MaterialMapperTest {
    @Autowired
    private ChapterMaterialMapper mapper;

    @Test
    void test(){
        mapper.selectList(null);
    }

    @Test
    void save(){
        ChapterMaterial cm=new ChapterMaterial();
        cm.setContent("0");
        cm.setName("第一章课件");
        cm.setChapterId(1);
        mapper.insert(cm);
        System.out.println(cm);
    }

    @Test
    void update(){
        ChapterMaterial cm=mapper.selectById(1);
        cm.setContent("一星期C语言速成");
        cm.setCmId(1);
        mapper.updateById(cm);
    }
}