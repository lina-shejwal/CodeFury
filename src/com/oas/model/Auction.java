package com.oas.model;

import java.util.Date;

public class Auction {

	int seqNumber;
	double minBidValue;
	Date bidStartDate;
	Date bidEndDate;
	int buyerID;
	double soldPrice;
	String status;

	public Auction() {
	
	}

	public Auction(int seqNumber, double minBidValue, Date bidStartDate, Date bidEndDate, int buyerID, double soldPrice,
			String status) {
		this.seqNumber = seqNumber;
		this.minBidValue = minBidValue;
		this.bidStartDate = bidStartDate;
		this.bidEndDate = bidEndDate;
		this.buyerID = buyerID;
		this.soldPrice = soldPrice;
		this.status = status;
	}
	
	public Auction(double minBidValue, Date bidStartDate, Date bidEndDate, int buyerID, double soldPrice,
			String status) {
		this.minBidValue = minBidValue;
		this.bidStartDate = bidStartDate;
		this.bidEndDate = bidEndDate;
		this.buyerID = buyerID;
		this.soldPrice = soldPrice;
		this.status = status;
	}

	public int getSeqNumber() {
		return seqNumber;
	}

	public void setSeqNumber(int seqNumber) {
		this.seqNumber = seqNumber;
	}

	public double getMinBidValue() {
		return minBidValue;
	}

	public void setMinBidValue(double minBidValue) {
		this.minBidValue = minBidValue;
	}

	public Date getBidStartDate() {
		return bidStartDate;
	}

	public void setBidStartDate(Date bidStartDate) {
		this.bidStartDate = bidStartDate;
	}

	public Date getBidEndDate() {
		return bidEndDate;
	}

	public void setBidEndDate(Date bidEndDate) {
		this.bidEndDate = bidEndDate;
	}

	public int getBuyerID() {
		return buyerID;
	}

	public void setBuyerID(int buyerID) {
		this.buyerID = buyerID;
	}

	public double getSoldPrice() {
		return soldPrice;
	}

	public void setSoldPrice(double soldPrice) {
		this.soldPrice = soldPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Auction [seqNumber=" + seqNumber + ", minBidValue=" + minBidValue + ", bidStartDate=" + bidStartDate
				+ ", bidEndDate=" + bidEndDate + ", buyerID=" + buyerID + ", soldPrice=" + soldPrice + ", status="
				+ status + "]";
	}
	
	

}
