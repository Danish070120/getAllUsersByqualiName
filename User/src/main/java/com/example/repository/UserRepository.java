package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

//	@Query("select u from User u where u.department.id=:id ")
	List<User> findAByDepartmentDepartId(int id);

	List<User> findByQualificationsQualiName(String name);

}
