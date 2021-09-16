package com.ua.kpi.lab7.service;

import com.ua.kpi.lab7.entity.UserScore;

import java.util.List;

public interface UserScoreService {
    UserScore createUserScore(UserScore userScore);

    UserScore updateUserScoreById(UserScore userScore, long id);

    List<UserScore> getUsersScores();

    UserScore getUserScoreById(long id);

    void deleteUserScoreById(long id);
}
