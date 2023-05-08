package com.eduloan.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduloan.demo.Model.LoanApplicationModel;
import com.eduloan.demo.Repository.LoanApplicationRepo;

@Service
public class LoanApplicationService {

	@Autowired
	LoanApplicationRepo lrep;
	public List<LoanApplicationModel> get()
	{
		List<LoanApplicationModel> l=lrep.findAll();
		return l;
	}
	
	public LoanApplicationModel saveLoans(LoanApplicationModel l)
	{
		return lrep.save(l);
	}

	public LoanApplicationModel changeLoans(LoanApplicationModel c)
	{
		return lrep.saveAndFlush(c);
	}
	public void deleteLoan(int loanId)
		{
			lrep.deleteById(loanId);
		}
}
