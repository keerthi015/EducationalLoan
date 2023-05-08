package com.example.Educationalloan.Repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.example.Educationalloan.Model.LoginModel;

	@Repository

	public interface LoginRepo extends JpaRepository <LoginModel,String>{

	}

