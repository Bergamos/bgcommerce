package com.bergamo.bgcommerce.service;

import com.bergamo.bgcommerce.dto.ProductDTO;
import com.bergamo.bgcommerce.entities.Product;
import com.bergamo.bgcommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).get();
        return new ProductDTO(product);
    }


}


