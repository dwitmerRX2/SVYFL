package com.razorx2.svyfl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="league")
public class League {
	
	@Id
	@Column(name="id")
	private int id;	
    @Column(name = "name", nullable = false)
    private String name;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
