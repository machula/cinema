package com.cinema.cinema.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "films")
public class Films implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "Name")
	private String name;

	/*@Column(name = "StandartPrice")
	private float standartPrice;*/

	/*@Column(name = "PremierDate")
	private String premierDate;*/
/*
	@Column(name = "EndDate")
	private String endDate;*/

	public Films() {
	}

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

	/*public float getStandartPrice() {
		return standartPrice;
	}

	public void setStandartPrice(float standartPrice) {
		this.standartPrice = standartPrice;
	}
*/
	/*public String getPremierDate() {
		return premierDate;
	}

	public void setPremierDate(String premierDate) {
		this.premierDate = premierDate;
	}*/
/*
	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}*/

}
