package com.nimap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimap.Model.Category;



public interface CategoryRepo extends JpaRepository<Category, Long> {
	
}
