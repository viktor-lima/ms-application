package com.vkl.hrpayroll.entiteis;

import java.io.Serializable;

public class Payment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double dailyIncome;
	private Integer Days;
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(String name, Double dailyIncome, Integer days) {
		super();
		this.name = name;
		this.dailyIncome = dailyIncome;
		Days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public Integer getDays() {
		return Days;
	}

	public void setDays(Integer days) {
		Days = days;
	}
	
	public double getTotal() {
		return this.Days * this.dailyIncome;
	}
	
}
