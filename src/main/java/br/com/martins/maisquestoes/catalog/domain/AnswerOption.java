package br.com.martins.maisquestoes.catalog.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class AnswerOption {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    @Column(nullable = false)
    private String letter;

    @Column(nullable = false, columnDefinition = "text")
    private String text;

    @Column(nullable = false)
    private boolean isCorrect;
}
