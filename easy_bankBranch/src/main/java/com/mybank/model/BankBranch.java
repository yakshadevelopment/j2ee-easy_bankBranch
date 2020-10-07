package com.mybank.model;

public class BankBranch {
	private long branchId;
	private String branchName;
	private String branchAddress;
	public BankBranch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankBranch(String branchName, String branchAddress) {
		super();
		
		this.branchName = branchName;
		this.branchAddress = branchAddress;
	}
	public long getBranchId() {
		return branchId;
	}
	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	
}
