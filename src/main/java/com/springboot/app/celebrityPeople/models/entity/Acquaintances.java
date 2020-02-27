package com.springboot.app.celebrityPeople.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="acquaintances")
public class Acquaintances implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementals
	private long id;

	@Column(name = "parent_id")
	private long parentId;  // id parent
	
	@Column(name = "related_id")
	private long relatedId; // ids related
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public long getRelatedId() {
		return relatedId;
	}

	public void setRelatedId(long relatedId) {
		this.relatedId = relatedId;
	}
	
	

	@Override
	public String toString() {
		return "Acquaintances [id=" + id + ", parentId=" + parentId + ", relatedId=" + relatedId + "]";
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = -1797023567393187947L;

}
