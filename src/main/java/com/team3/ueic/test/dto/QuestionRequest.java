package com.team3.ueic.test.dto;

import com.team3.ueic.test.enums.WeakType;

import java.util.List;

public class QuestionRequest {
    private String content;
    private WeakType weakType;
    private List<String> choices;
    private int answerIndex;

    // Getter/Setter 필요 (Lombok 사용 시 @Data)
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public WeakType getWeakType() { return weakType; }
    public void setWeakType(WeakType weakType) { this.weakType = weakType; }
    public List<String> getChoices() { return choices; }
    public void setChoices(List<String> choices) { this.choices = choices; }
    public int getAnswerIndex() { return answerIndex; }
    public void setAnswerIndex(int answerIndex) { this.answerIndex = answerIndex; }
}
