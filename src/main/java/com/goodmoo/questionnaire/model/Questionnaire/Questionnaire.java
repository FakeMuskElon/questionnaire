package com.goodmoo.questionnaire.model.Questionnaire;

import com.goodmoo.questionnaire.model.Question.Question;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Questionnaire {
    @Id
    @SequenceGenerator(
            name = "questionnaire_id_sequence",
            sequenceName = "questionnaire_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "questionnaire_id_sequence"
    )
    private Integer id;
    private String questionnaireName;
    private List<Question> questions;
    private boolean isActive;
    private LocalDate StartsDate;
    private LocalDate EndDate;
}
