package com.cinema.cinema.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sessions")
public class Sessions implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "time")
	private Time time;
	
	@Column(name = "session_price")
	private Float sessionPrice;
	
	@Column(name = "vip_price")
	private Float vipPrice;
	
	@Column(name = "free_places")
	private int freePlaces;
	
	@Column(name = "amount_cash")
	private Float amountCash;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Float getSessionPrice() {
		return sessionPrice;
	}

	public void setSessionPrice(Float sessionPrice) {
		this.sessionPrice = sessionPrice;
	}

	public Float getVipPrice() {
		return vipPrice;
	}

	public void setVipPrice(Float vipPrice) {
		this.vipPrice = vipPrice;
	}

	public int getFreePlaces() {
		return freePlaces;
	}

	public void setFreePlaces(int freePlaces) {
		this.freePlaces = freePlaces;
	}

	public Float getAmountCash() {
		return amountCash;
	}

	public void setAmountCash(Float amountCash) {
		this.amountCash = amountCash;
	}


	
	

	
	
	
}
