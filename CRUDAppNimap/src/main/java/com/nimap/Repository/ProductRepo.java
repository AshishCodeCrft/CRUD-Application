package com.nimap.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nimap.Model.Product;



public interface ProductRepo extends JpaRepository<Product, Long> {
	
}
 