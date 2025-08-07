package com.orcasiq.OrcasIQ.service;

import com.orcasiq.OrcasIQ.model.HomePageForm;

public interface HomePageFormService {
    HomePageForm saveHomePageForm(HomePageForm form);
    void sendHomePageFormEmail(HomePageForm form);
}
