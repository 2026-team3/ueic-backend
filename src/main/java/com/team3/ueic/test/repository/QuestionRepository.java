package com.team3.ueic.test.repository;

import com.team3.ueic.test.enums.WeakType;
import com.team3.ueic.test.entity.Question;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    // WeakType별 전체 조회
    List<Question> findByWeakType(WeakType weakType);


}

