/*package com.example.educare.AdminPanel.GradeManagement.model;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.ForeignKey;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "prof")
public class Prof {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ForeignKey(name = "subject_id")
	private int subjectId;
	
	@Column(name = "subject_name")
	private String subjectName;
	
	@Column(name = "prof_topic")
	private String profTopic;
	
	@Column(name = "prof_due")
	private Date profDue;
	
	@Column(name = "prof_status")
	private String profStatus;
	
	@Column(name = "prof_score")
	private int profScore;
	
	@Column(name = "prof_out_of")
	private int profOutOf;
	
	@Transient
	private ExamType examTpye;
	
	@ForeignKey(name = "viva_exam_id")
	private int vivaExamId;
	
	@ForeignKey(name = "written_exam_id")
	private int writtenExamId;
	
	@ForeignKey(name = "OSPE_exam_id")
	private int ospEaxmId;
	
	@ForeignKey(name = "OSCE_exam_id")
	private int oscExamId;
	
	@ForeignKey(name = "faculty_id")
	private int facultyId;
	
	@ForeignKey(name = "phase_id")
	private int phaseId;
	
	@ForeignKey(name = "term_id")
	private int termId;
	
	@Column(name = "created_on")
	private Date createdOn;
	
	@Column(name = "created_by")
	private String createdBy;

	public Prof() {
	}

	public Prof(int id, int subjectId, String subjectName, String profTopic, Date profDue, String profStatus,
			int profScore, int profOutOf, int vivaExamId, int writtenExamId, int ospEaxmId, int oscExamId,
			int facultyId, int phaseId, int termId, Date createdOn, String createdBy) {
		this.id = id;
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.profTopic = profTopic;
		this.profDue = profDue;
		this.profStatus = profStatus;
		this.profScore = profScore;
		this.profOutOf = profOutOf;
		this.vivaExamId = vivaExamId;
		this.writtenExamId = writtenExamId;
		this.ospEaxmId = ospEaxmId;
		this.oscExamId = oscExamId;
		this.facultyId = facultyId;
		this.phaseId = phaseId;
		this.termId = termId;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getProfTopic() {
		return profTopic;
	}

	public void setProfTopic(String profTopic) {
		this.profTopic = profTopic;
	}

	public Date getProfDue() {
		return profDue;
	}

	public void setProfDue(Date profDue) {
		this.profDue = profDue;
	}

	public String getProfStatus() {
		return profStatus;
	}

	public void setProfStatus(String profStatus) {
		this.profStatus = profStatus;
	}

	public int getProfScore() {
		return profScore;
	}

	public void setProfScore(int profScore) {
		this.profScore = profScore;
	}

	public int getProfOutOf() {
		return profOutOf;
	}

	public void setProfOutOf(int profOutOf) {
		this.profOutOf = profOutOf;
	}

	public int getVivaExamId() {
		return vivaExamId;
	}

	public void setVivaExamId(int vivaExamId) {
		this.vivaExamId = vivaExamId;
	}

	public int getWrittenExamId() {
		return writtenExamId;
	}

	public void setWrittenExamId(int writtenExamId) {
		this.writtenExamId = writtenExamId;
	}

	public int getOspEaxmId() {
		return ospEaxmId;
	}

	public void setOspEaxmId(int ospEaxmId) {
		this.ospEaxmId = ospEaxmId;
	}

	public int getOscExamId() {
		return oscExamId;
	}

	public void setOscExamId(int oscExamId) {
		this.oscExamId = oscExamId;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public int getPhaseId() {
		return phaseId;
	}

	public void setPhaseId(int phaseId) {
		this.phaseId = phaseId;
	}

	public int getTermId() {
		return termId;
	}

	public void setTermId(int termId) {
		this.termId = termId;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
*/