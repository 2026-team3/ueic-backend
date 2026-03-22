package com.team3.ueic.test;



import com.team3.ueic.test.dto.QuestionRequest;
import com.team3.ueic.test.service.QuestionService;
import jakarta.annotation.PostConstruct;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;

@Component
public class DataInitializer {

    private final QuestionService questionService;
    private final ObjectMapper objectMapper;

    public DataInitializer(QuestionService questionService, ObjectMapper objectMapper) {
        this.questionService = questionService;
        this.objectMapper = objectMapper;
    }

    @PostConstruct
    public void init() {
        try {
            InputStream inputStream = new ClassPathResource("question.json").getInputStream();
            List<QuestionRequest> questions = objectMapper.readValue(inputStream, new TypeReference<List<QuestionRequest>>() {});

            for (QuestionRequest q : questions) {
                questionService.createQuestion(
                        q.getContent(),
                        q.getWeakType(),
                        q.getChoices(),
                        q.getAnswerIndex()
                );
            }

            System.out.println("총 " + questions.size() + "문제가 DB에 적재되었습니다.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
