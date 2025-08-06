package com.orcasiq.OrcasIQ.controller;

import com.orcasiq.OrcasIQ.model.BuyModuleForm;
import com.orcasiq.OrcasIQ.repository.BuyModuleFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buy-module")
@CrossOrigin(origins = "*")
public class BuyModuleFormController {
    @Autowired
    private BuyModuleFormRepository buyModuleFormRepository;

    @PostMapping
    public BuyModuleForm buyModuleFormHandler(@RequestBody BuyModuleForm buyModuleForm) {

        return buyModuleFormRepository.save(buyModuleForm);
    }
}
