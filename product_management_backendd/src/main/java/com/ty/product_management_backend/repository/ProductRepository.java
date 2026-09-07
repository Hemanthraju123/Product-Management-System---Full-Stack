package com.ty.product_management_backend.repository;

import com.ty.product_management_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {



}
