package com.orcasiq.OrcasIQ.service;

import com.orcasiq.OrcasIQ.model.BuyCourseForm;

public interface BuyCourseFormService {
    BuyCourseForm saveForm(BuyCourseForm form);
    void sendCoursePurchaseEmail(BuyCourseForm form);
}
