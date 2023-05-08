package com.example.Educationalloan.Repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.example.Educationalloan.Model.AdminModel;
	@Repository

	public interface AdminRepo extends JpaRepository<AdminModel,String>{

	}

