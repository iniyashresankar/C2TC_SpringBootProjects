package com.tnsif.placementmanagement.repository;

import com.tnsif.placementmanagement.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
