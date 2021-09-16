package com.ua.kpi.lab7.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name="user_scores")
@Entity
public class UserScore {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long id_guest;
    private long id_film;
    private int score;
}
