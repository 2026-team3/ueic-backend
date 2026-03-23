package com.team3.ueic.domain.test.repository;

import com.team3.ueic.domain.test.entity.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserAnswerRepository extends JpaRepository<UserAnswer, Long> {

    Optional<UserAnswer> findByUserIdAndQuestionId(Long userId, Long questionId);
    List<UserAnswer> findByUserId(Long userId);
}
