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
@Table(name = "card")
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ForeignKey(name = "subject_id")
	private int subjectId;
	
	@Column(name = "subject_name")
	private String subjectName;
	
	@Column(name = "card_topic")
	private String cardTopic;
	
	@Column(name = "card_due")
	private Date cardDue;
	
	@Column(name = "card_status")
	private String cardStatus;
	
	@Column(name = "card_score")
	private int cardScore;
	
	@Column(name = "card_out_of")
	private int cardOutOf;
	
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
	
	@ForeignKey(name = "item_id")
	private int itemId;
	
	@Column(name = "created_on")
	private Date createdOn;
	
	@Column(name = "created_by")
	private String createdBy;

	public Card() {
	}

	public Card(int id, int subjectId, String subjectName, String cardTopic, Date cardDue, String cardStatus,
			int cardScore, int cardOutOf, int vivaExamId, int writtenExamId, int ospEaxmId, int oscExamId,
			int facultyId, int phaseId, int termId, int itemId, Date createdOn, String createdBy) {
		this.id = id;
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.cardTopic = cardTopic;
		this.cardDue = cardDue;
		this.cardStatus = cardStatus;
		this.cardScore = cardScore;
		this.cardOutOf = cardOutOf;
		this.vivaExamId = vivaExamId;
		this.writtenExamId = writtenExamId;
		this.ospEaxmId = ospEaxmId;
		this.oscExamId = oscExamId;
		this.facultyId = facultyId;
		this.phaseId = phaseId;
		this.termId = termId;
		this.itemId = itemId;
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

	public String getCardTopic() {
		return cardTopic;
	}

	public void setCardTopic(String cardTopic) {
		this.cardTopic = cardTopic;
	}

	public Date getCardDue() {
		return cardDue;
	}

	public void setCardDue(Date cardDue) {
		this.cardDue = cardDue;
	}

	public String getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public int getCardScore() {
		return cardScore;
	}

	public void setCardScore(int cardScore) {
		this.cardScore = cardScore;
	}

	public int getCardOutOf() {
		return cardOutOf;
	}

	public void setCardOutOf(int cardOutOf) {
		this.cardOutOf = cardOutOf;
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

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
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