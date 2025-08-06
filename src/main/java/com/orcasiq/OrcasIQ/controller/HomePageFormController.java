package com.orcasiq.OrcasIQ.controller;

import com.orcasiq.OrcasIQ.model.HomePageForm;
import com.orcasiq.OrcasIQ.repository.HomePageFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/form")
public class HomePageFormController {
    @Autowired
    private HomePageFormRepository homePageFormRepository;
    @PostMapping
    public HomePageForm homePageForm(@RequestBody HomePageForm homePageForm){
        return homePageFormRepository.save(homePageForm);
    }
}
