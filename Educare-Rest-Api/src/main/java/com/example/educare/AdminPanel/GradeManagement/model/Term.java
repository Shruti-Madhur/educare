/*package com.example.educare.AdminPanel.GradeManagement.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "term")
public class Term {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ForeignKey(name = "subject_id")
	private int subjectId;
	
	@Column(name = "subject_name")
	private String subjectName;
	
	@Column(name = "term_topic")
	private String termTopic;
	
	@Column(name = "term_due")
	private Date termDue;
	
	@Column(name = "term_status")
	private String termStatus;
	
	@Column(name = "term_score")
	private int termScore;
	
	@Column(name = "term_out_of")
	private int termOutOf;
	
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
	
	@ForeignKey(name = "card_id")
	private int cardId;
	
	@ForeignKey(name = "prof_id")
	private int profId;
	
	@Column(name = "created_on")
	private Date createdOn;
	
	@Column(name = "created_by")
	private String createdBy;

	public Term() {
	}

	public Term(int id, int subjectId, String subjectName, String termTopic, Date termDue, String termStatus,
			int termScore, int termOutOf, int vivaExamId, int writtenExamId, int ospEaxmId, int oscExamId,
			int facultyId, int phaseId, int cardId, int profId, Date createdOn, String createdBy) {
		this.id = id;
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.termTopic = termTopic;
		this.termDue = termDue;
		this.termStatus = termStatus;
		this.termScore = termScore;
		this.termOutOf = termOutOf;
		this.vivaExamId = vivaExamId;
		this.writtenExamId = writtenExamId;
		this.ospEaxmId = ospEaxmId;
		this.oscExamId = oscExamId;
		this.facultyId = facultyId;
		this.phaseId = phaseId;
		this.cardId = cardId;
		this.profId = profId;
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

	public String getTermTopic() {
		return termTopic;
	}

	public void setTermTopic(String termTopic) {
		this.termTopic = termTopic;
	}

	public Date getTermDue() {
		return termDue;
	}

	public void setTermDue(Date termDue) {
		this.termDue = termDue;
	}

	public String getTermStatus() {
		return termStatus;
	}

	public void setTermStatus(String termStatus) {
		this.termStatus = termStatus;
	}

	public int getTermScore() {
		return termScore;
	}

	public void setTermScore(int termScore) {
		this.termScore = termScore;
	}

	public int getTermOutOf() {
		return termOutOf;
	}

	public void setTermOutOf(int termOutOf) {
		this.termOutOf = termOutOf;
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

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getProfId() {
		return profId;
	}

	public void setProfId(int profId) {
		this.profId = profId;
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