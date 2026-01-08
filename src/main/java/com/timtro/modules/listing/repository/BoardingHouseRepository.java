package com.timtro.modules.listing.repository;

import com.timtro.modules.listing.model.BoardingHouse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardingHouseRepository extends JpaRepository<BoardingHouse, Long> {

    Page<BoardingHouse> findByLandlordId(Long landlordId, Pageable pageable);

    Page<BoardingHouse> findByDistrictId(Integer districtId, Pageable pageable);
}
