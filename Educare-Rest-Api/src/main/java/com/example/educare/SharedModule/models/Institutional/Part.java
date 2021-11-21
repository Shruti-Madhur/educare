package com.example.educare.SharedModule.models.Institutional;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "part")
public class Part implements Serializable {
    @Id
    @SequenceGenerator(
            initialValue = 1,
            name = "part_sequence",
            sequenceName = "part_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "part_sequence"
    )
    private Long id;

    @Column(name = "name", length = 255)
    private String name;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            foreignKey = @ForeignKey(name = "subjectId"),
            name = "subjectId"
    )
    @ToString.Exclude
    private Subject subject;

    //Will be auto generated
    @Column(name = "createdOn")
    private Instant createdOn;

    @Column(name = "createdBy")
    private String createdBy;

    //Will be auto generated
    @Column(name = "modifiedOn")
    private Instant modifiedOn;

    @Column(name = "modifiedBy")
    private String modifiedBy;
}
