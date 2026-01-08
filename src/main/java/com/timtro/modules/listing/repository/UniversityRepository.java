package com.timtro.modules.listing.repository;

import com.timtro.modules.listing.model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversityRepository extends JpaRepository<University, Long> {

    List<University> findByDistrictId(Integer districtId);
}
