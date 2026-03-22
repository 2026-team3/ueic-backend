package com.team3.ueic.test.repository;

import com.team3.ueic.test.entity.Choice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChoiceRepository extends JpaRepository<Choice, Long> {
    // 특정 Question ID에 속한 Choice들 조회
    List<Choice> findByQuestionId(Long questionId);

}
