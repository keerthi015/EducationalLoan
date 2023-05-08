package com.example.Educationalloan.Repository;

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.example.Educationalloan.Model.UserModel;

	public interface UserRepo extends JpaRepository<UserModel,Integer> {

	}
