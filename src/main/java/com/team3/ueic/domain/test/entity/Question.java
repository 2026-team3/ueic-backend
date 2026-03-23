package com.team3.ueic.domain.test.entity;

import com.team3.ueic.domain.test.enums.WeakType;
import jakarta.persistence.*;
import lombok.Data;


import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "question")
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content; // 문제 본문

    @Enumerated(EnumType.STRING)
    private WeakType weakType;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Choice> choices = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "answer_choice_id")
    private Choice answerChoice;

    // 연관관계 편의 메서드
    public void addChoice(Choice choice) {
        choices.add(choice);
        choice.setQuestion(this);
    }

    // 정답 체크
    public boolean isCorrect(Long choiceId) {
        if (answerChoice == null) return false;
        return answerChoice.getId().equals(choiceId);
    }


}