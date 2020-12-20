package com.pojo;

public class Sales {
	private int id;
	private int plotId;
	private String ownerName;
	private String buyerName;
	private String bPhone;
	private int paidAmount;
	private int reaminingAmount;
	private String paymentStatus;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPlotId() {
		return plotId;
	}
	public void setPlotId(int plotId) {
		this.plotId = plotId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getbPhone() {
		return bPhone;
	}
	public void setbPhone(String bPhone) {
		this.bPhone = bPhone;
	}
	public int getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(int paidAmount) {
		this.paidAmount = paidAmount;
	}
	
	public int getReaminingAmount() {
		return reaminingAmount;
	}
	public void setReaminingAmount(int reaminingAmount) {
		this.reaminingAmount = reaminingAmount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
