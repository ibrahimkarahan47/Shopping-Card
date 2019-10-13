package com.trendyol.codecase.repo;

import com.trendyol.codecase.entity.CampaignInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignInfoRepository extends CrudRepository<CampaignInfo, String> {
}
