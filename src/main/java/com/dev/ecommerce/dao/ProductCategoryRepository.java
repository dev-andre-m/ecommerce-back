package com.dev.ecommerce.dao;

import com.dev.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
