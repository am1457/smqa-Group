package com.mcqa.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "questions")
public class Question {
    @Id
    private Integer id;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctOption;
}
