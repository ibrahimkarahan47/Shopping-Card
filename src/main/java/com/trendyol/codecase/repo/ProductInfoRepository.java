package com.trendyol.codecase.repo;

import com.trendyol.codecase.entity.ProductInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInfoRepository extends CrudRepository<ProductInfo, String> {
}
