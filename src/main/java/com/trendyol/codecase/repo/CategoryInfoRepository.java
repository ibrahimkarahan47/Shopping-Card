package com.trendyol.codecase.repo;

import com.trendyol.codecase.entity.CategoryInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryInfoRepository extends CrudRepository<CategoryInfo, String> {
}
