package com.oe.onlineeducation_demo.service.impl;

import com.oe.onlineeducation_demo.entity.Question;
import com.oe.onlineeducation_demo.mapper.QuestionMapper;
import com.oe.onlineeducation_demo.service.IQuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements IQuestionService {

}
