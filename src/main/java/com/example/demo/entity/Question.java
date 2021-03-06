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
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_generator")
    @SequenceGenerator(name = "question_generator", sequenceName = "question_seq", initialValue = 1 , allocationSize = 1)
    private Long idQuestion;
    private String name;
    private Long questionTypeId;
    private Boolean answered;
    @OneToMany (mappedBy = "myQuestion",cascade = CascadeType.ALL)
    private List<Option> options;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Quiz myQuiz;

}