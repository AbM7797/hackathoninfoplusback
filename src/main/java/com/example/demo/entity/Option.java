package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "option_sequence")
    @SequenceGenerator(name = "option_sequence", sequenceName = "option_seq", initialValue = 1, allocationSize = 1)
    private Long idOption;
    private Long questionId;
    private String name;
    private Boolean isAnswer;
    private Boolean selected;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Question myQuestion;
}