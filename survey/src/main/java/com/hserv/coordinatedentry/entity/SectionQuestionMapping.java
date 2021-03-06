package com.hserv.coordinatedentry.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hserv.coordinatedentry.util.JsonDateSerializer;

/**
 * Model class of Question.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity
@Table(name = "section_question_mapping")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class SectionQuestionMapping implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** question_id. */
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	/*private Integer sectionQuestionMappingId;

	private Integer questionId;

	private Integer sectionId;

	private Integer questionParentId;

	private Integer questionChildId;*/
	
	@ManyToOne
    private SurveySection surveySection;

    @ManyToOne
    private Question question;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/*public Integer getSectionQuestionMappingId() {
		return sectionQuestionMappingId;
	}

	public void setSectionQuestionMappingId(Integer sectionQuestionMappingId) {
		this.sectionQuestionMappingId = sectionQuestionMappingId;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public Integer getQuestionParentId() {
		return questionParentId;
	}

	public void setQuestionParentId(Integer questionParentId) {
		this.questionParentId = questionParentId;
	}

	public Integer getQuestionChildId() {
		return questionChildId;
	}

	public void setQuestionChildId(Integer questionChildId) {
		this.questionChildId = questionChildId;
	}*/

	public SurveySection getSurveySection() {
		return surveySection;
	}

	public void setSurveySection(SurveySection surveySection) {
		this.surveySection = surveySection;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) {
	            return true;
	        }
	        if (o == null || getClass() != o.getClass()) {
	            return false;
	        }
	        SectionQuestionMapping sectionQuestionMapping = (SectionQuestionMapping) o;
	        if(sectionQuestionMapping.id == null || id == null) {
	            return false;
	        }
	        return Objects.equals(id, sectionQuestionMapping.id);
	    }

}
