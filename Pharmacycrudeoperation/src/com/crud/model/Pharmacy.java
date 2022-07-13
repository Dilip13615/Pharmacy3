package com.crud.model;

public class Pharmacy {
	private int trans_id;
	private String username;
	private String mode;
	private int Amount;
	public int getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public Pharmacy(int trans_id, String username, String mode, int amount) {
		super();
		this.trans_id = trans_id;
		this.username = username;
		this.mode = mode;
		Amount = amount;
	}
	

}
