package com.team3.ueic.test.dto;

import com.team3.ueic.test.enums.WeakType;
import lombok.Data;

import java.util.List;

@Data
public class QuestionResponse {
    private Long id;
    private String content;
    private WeakType weakType;
    private List<ChoiceResponse> choices;
    private ChoiceResponse answerChoice;
}

