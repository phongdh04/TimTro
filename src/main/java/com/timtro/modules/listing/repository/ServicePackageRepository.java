package com.timtro.modules.listing.repository;

import com.timtro.modules.listing.model.ServicePackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicePackageRepository extends JpaRepository<ServicePackage, Long> {

    List<ServicePackage> findByIsActiveTrueOrderByPriorityLevelDesc();
}
