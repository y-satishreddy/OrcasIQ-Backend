package com.orcasiq.OrcasIQ.repository;

import com.orcasiq.OrcasIQ.model.BuyModuleForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyModuleFormRepository extends JpaRepository<BuyModuleForm, Integer> {
}
