package br.com.martins.maisquestoes.catalog.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Exam {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="exam_board_id", nullable = false)
    private ExamBoard examBoard;

    @Column(nullable = false)
    private int year;

    @Column(nullable = false)
    private String jobPosition;

    @Column(nullable = false)
    private String institution;
}
