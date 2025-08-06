package com.orcasiq.OrcasIQ.repository;

import com.orcasiq.OrcasIQ.model.BuyCourseForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyCourseFormRepository extends JpaRepository<BuyCourseForm, Integer> {
}
