package com.team3.ueic.domain.test.dto;

import com.team3.ueic.domain.test.entity.Choice;
import lombok.Data;

@Data
public class ChoiceResponse {
    private Long id;
    private String content;

    public ChoiceResponse(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    // static 변환 메서드 (편의)
    public static ChoiceResponse fromEntity(Choice choice) {
        return new ChoiceResponse(choice.getId(), choice.getContent());
    }
}
