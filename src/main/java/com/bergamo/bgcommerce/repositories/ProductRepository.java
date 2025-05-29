package com.bergamo.bgcommerce.repositories;

import com.bergamo.bgcommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
