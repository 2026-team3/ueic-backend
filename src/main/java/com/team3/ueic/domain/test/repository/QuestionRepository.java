package com.team3.ueic.domain.test.repository;

import com.team3.ueic.domain.test.enums.WeakType;
import com.team3.ueic.domain.test.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    // WeakType별 전체 조회
    List<Question> findByWeakType(WeakType weakType);


}

