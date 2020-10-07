package com.mybank.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mybank.model.BankBranch;

@Component
@Service
public class BankBranchData {
	private static List<BankBranch> branchList=new ArrayList<BankBranch>();
	private static long idgen=10000;
	public void addBranch(BankBranch bankBranch)
	{
		bankBranch.setBranchId(++idgen);
		branchList.add(bankBranch);
	}
	
	public List<BankBranch> getAllBranches()
	{
		return branchList;
	}

}
