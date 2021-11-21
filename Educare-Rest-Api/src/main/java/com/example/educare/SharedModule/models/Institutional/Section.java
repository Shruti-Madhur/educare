package com.example.educare.SharedModule.models.Institutional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.Instant;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Table(name = "section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sectionId;

    @Column(name = "sectionName")
    private String sectionName;

    @Column(name = "session")
    private String session;

    @Column(name = "roomNo")
    private String roomNo;

    @CreatedDate
    @Column(name = "createdOn", nullable = false, updatable = false)
    private Instant createdOn = Instant.now();

    @CreatedBy
    @Column(name = "createdBy", updatable = false)
    private String createdBy;

    @LastModifiedDate
    @Column(name = "modifiedOn", nullable = false)
    private Instant modifiedOn = Instant.now();

    @LastModifiedBy
    @Column(name = "modifiedBy")
    private String modifiedBy;

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
}
