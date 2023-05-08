package com.example.Educationalloan.Repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.example.Educationalloan.Model.LoanApplicationModel;

	@Repository
	public interface LoanApplicationRepo  extends JpaRepository <LoanApplicationModel,Integer>{

	}

