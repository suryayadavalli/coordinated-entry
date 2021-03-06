package com.hserv.coordinatedentry.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Model class of label_picklist.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity
public class LabelPicklist implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** index. */
	@Id
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="labelpicklist_id_seq")
//	@SequenceGenerator(name="labelpicklist_id_seq", sequenceName="labelpicklist_id_seq")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column()
	private Integer labelPicklistId;

	/** label_value. */
	private String labelValue;

	/**
	 * Constructor.
	 */
	public LabelPicklist() {
	}


	public Integer getLabelPicklistId() {
		return labelPicklistId;
	}

	public void setLabelPicklistId(Integer labelPicklistId) {
		this.labelPicklistId = labelPicklistId;
	}



	/**
	 * Set the label_value.
	 * 
	 * @param labelValue
	 *            label_value
	 */
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

	/**
	 * Get the label_value.
	 * 
	 * @return label_value
	 */
	public String getLabelValue() {
		return this.labelValue;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((labelPicklistId == null) ? 0 : labelPicklistId.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		LabelPicklist other = (LabelPicklist) obj;
		if (labelPicklistId == null) {
			if (other.labelPicklistId != null) {
				return false;
			}
		} else if (!labelPicklistId.equals(other.labelPicklistId)) {
			return false;
		}
		return true;
	}

}
