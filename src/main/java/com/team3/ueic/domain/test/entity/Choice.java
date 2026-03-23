package com.team3.ueic.domain.test.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Choice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    public void setQuestion(Question question) {
        this.question = question;
    }

    // getter/setter 생략
}
