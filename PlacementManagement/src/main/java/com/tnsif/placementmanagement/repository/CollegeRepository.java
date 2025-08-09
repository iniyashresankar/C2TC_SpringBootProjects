package com.tnsif.placementmanagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.placementmanagement.entity.College;

public interface CollegeRepository extends JpaRepository<College, Long> {
}