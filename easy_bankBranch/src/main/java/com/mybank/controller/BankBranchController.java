package com.mybank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mybank.dao.BankBranchData;
import com.mybank.model.BankBranch;

@Controller
public class BankBranchController {
	
	@Autowired
	BankBranchData branchData;
	
	@RequestMapping("/branch-entry")
	public String createNewBranchForm(Model model)
	{
		BankBranch bankBranch=new BankBranch();
		model.addAttribute("bankRecord",bankBranch);
		return "bankBranchEntry";
	}
	
	@RequestMapping("/save-branch")
	public String saveNewBranch(@ModelAttribute ("bankRecord") BankBranch bankBranch)
	{
		branchData.addBranch(bankBranch);
		return "insertSuccess";
	}
	
	@RequestMapping("/show-all-branches")
	public String showAllBranches(Model model)
	{
		List<BankBranch> branchList=branchData.getAllBranches();
		 model.addAttribute("branchList",branchList);  
		return "bankBranchShow";
	}

	

}
