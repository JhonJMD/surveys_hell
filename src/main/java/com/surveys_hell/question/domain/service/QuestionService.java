package com.surveys_hell.question.domain.service;

import java.util.Optional;
import java.util.List;

import com.surveys_hell.question.domain.entity.Question;


public interface QuestionService {
    void createQuestion (Question question);
    Optional<Question> findQuestion (int id);
    void updateQuestion (Question Question);
    void deleteQuestion (int id);
    List<Question> findQuestionByChapter(int questionId);
}
