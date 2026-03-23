package com.team3.ueic.domain.test.dto;

import lombok.Data;

@Data
public class AnswerRequest {
    private Long questionId;
    private Long choiceId;
}