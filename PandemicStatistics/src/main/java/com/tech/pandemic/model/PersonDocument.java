package com.tech.pandemic.model;

import javax.persistence.*;

@Entity
@Table(name="PERSON_DOCUMENT")
public class PersonDocument {
	
	@Id
	@Column(length = 10)
	String docId;
	String docName;
	String docLocation;
	private Long userId;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getDocLocation() {
		return docLocation;
	}
	public void setDocLocation(String docLocation) {
		this.docLocation = docLocation;
	}
	
	

}
