package com.ua.kpi.lab7.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name="categories")
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
}
