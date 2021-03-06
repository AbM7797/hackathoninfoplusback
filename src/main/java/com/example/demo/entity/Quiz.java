package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "quiz_generator")
    @SequenceGenerator(name="quiz_generator",sequenceName = "quiz_seq",initialValue = 1,allocationSize = 1)
    private Long idQuiz;
    private String name;
    private String description;
    @OneToMany(mappedBy = "myQuiz",cascade = CascadeType.ALL)
    private List<Question> questions;
}