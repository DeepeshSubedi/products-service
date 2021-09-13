package com.deepesh.productsservice.repos;

import com.deepesh.productsservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepos extends MongoRepository<Product,String> {
}
