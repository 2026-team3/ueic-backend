package com.team3.ueic.domain.test.dto;

import com.team3.ueic.domain.test.enums.WeakType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SubmitResponse {
    private boolean allCorrect;  // 모든 문제 맞았는지
    private WeakType weakType;    // 취약 분야 (틀린 문제 중 가장 많이 나온 유형)
    private String message;       // 메시지
}
