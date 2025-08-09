package com.tnsif.placementmanagement.service;

import com.tnsif.placementmanagement.entity.College;
import com.tnsif.placementmanagement.repository.CollegeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CollegeService {

    private final CollegeRepository collegeRepository;

    public CollegeService(CollegeRepository collegeRepository) {
        this.collegeRepository = collegeRepository;
    }

    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    public Optional<College> getCollegeById(Long id) {
        return collegeRepository.findById(id);
    }

    public College createCollege(College college) {
        return collegeRepository.save(college);
    }

    public College updateCollege(Long id, College updatedCollege) {
        return collegeRepository.findById(id)
                .map(college -> {
                    college.setCollegeName(updatedCollege.getCollegeName());
                    college.setAddress(updatedCollege.getAddress());
                    return collegeRepository.save(college);
                }).orElseThrow(() -> new RuntimeException("College not found"));
    }

    public void deleteCollege(Long id) {
        collegeRepository.deleteById(id);
    }
}