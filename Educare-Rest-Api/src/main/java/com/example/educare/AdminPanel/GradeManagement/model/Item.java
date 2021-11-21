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
@Table(name = "item")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ForeignKey(name = "subject_id")
	private int subjectId;
	
	@Column(name = "subject_name")
	private String subjectName;
	
	@Column(name = "item_topic")
	private String itemTopic;
	
	@Column(name = "item_due")
	private Date itemDue;
	
	@Column(name = "item_status")
	private String itemStatus;
	
	@Column(name = "item_score")
	private int itemScore;
	
	@Column(name = "item_out_of")
	private int itemOutOf;
	
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
	
	@Column(name = "created_on")
	private Date createdOn;
	
	@Column(name = "created_by")
	private String createdBy;

	public Item() {
	}

	public Item(int id, int subjectId, String subjectName, String itemTopic, Date itemDue, String itemStatus,
			int itemScore, int itemOutOf, int vivaExamId, int writtenExamId, int ospEaxmId, int oscExamId,
			int facultyId, int phaseId, int cardId, Date createdOn, String createdBy) {
		this.id = id;
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.itemTopic = itemTopic;
		this.itemDue = itemDue;
		this.itemStatus = itemStatus;
		this.itemScore = itemScore;
		this.itemOutOf = itemOutOf;
		this.vivaExamId = vivaExamId;
		this.writtenExamId = writtenExamId;
		this.ospEaxmId = ospEaxmId;
		this.oscExamId = oscExamId;
		this.facultyId = facultyId;
		this.phaseId = phaseId;
		this.cardId = cardId;
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

	public String getItemTopic() {
		return itemTopic;
	}

	public void setItemTopic(String itemTopic) {
		this.itemTopic = itemTopic;
	}

	public Date getItemDue() {
		return itemDue;
	}

	public void setItemDue(Date itemDue) {
		this.itemDue = itemDue;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public int getItemScore() {
		return itemScore;
	}

	public void setItemScore(int itemScore) {
		this.itemScore = itemScore;
	}

	public int getItemOutOf() {
		return itemOutOf;
	}

	public void setItemOutOf(int itemOutOf) {
		this.itemOutOf = itemOutOf;
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