package com.orcasiq.OrcasIQ.controller;
import com.orcasiq.OrcasIQ.model.BuyModuleForm;
import com.orcasiq.OrcasIQ.service.BuyModuleFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/buy-module")
@CrossOrigin(origins = "*")
public class BuyModuleFormController {
    @Autowired
    private BuyModuleFormService buyModuleFormService;
    @PostMapping
    public BuyModuleForm buyModuleFormHandler(@RequestBody BuyModuleForm buyModuleForm) {
        BuyModuleForm savedForm = buyModuleFormService.saveModuleForm(buyModuleForm);
        buyModuleFormService.sendModuleFormEmail(savedForm);
        return savedForm;
    }
}
