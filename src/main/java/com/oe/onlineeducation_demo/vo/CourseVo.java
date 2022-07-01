package com.oe.onlineeducation_demo.vo;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class CourseVo {
    private String courseName;
    private Date start;
    private Date end;
    private String intro;
    private String introVideo;
    private MultipartFile image;
    private Integer type;
}
