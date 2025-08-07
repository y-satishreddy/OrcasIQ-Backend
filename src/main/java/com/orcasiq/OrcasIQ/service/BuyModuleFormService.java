package com.orcasiq.OrcasIQ.service;

import com.orcasiq.OrcasIQ.model.BuyModuleForm;

public interface BuyModuleFormService {
    BuyModuleForm saveModuleForm(BuyModuleForm form);
    void sendModuleFormEmail(BuyModuleForm form);
}
