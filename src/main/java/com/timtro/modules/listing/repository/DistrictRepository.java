package com.timtro.modules.listing.repository;

import com.timtro.modules.listing.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {

    List<District> findByCityId(Integer cityId);

    Optional<District> findBySlug(String slug);
}
