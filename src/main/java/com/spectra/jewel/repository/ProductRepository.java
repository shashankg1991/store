package com.spectra.jewel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spectra.jewel.model.product.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	Product findByCode(String code);

}
