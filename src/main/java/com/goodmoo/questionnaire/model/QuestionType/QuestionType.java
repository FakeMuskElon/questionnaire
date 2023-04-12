package com.goodmoo.questionnaire.model.QuestionType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class QuestionType {
    @Id
    @SequenceGenerator(
            name = "questionType_id_sequence",
            sequenceName = "questionType_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "questionType_id_sequence"
    )
    private Integer id;
    private String typeName;
}
