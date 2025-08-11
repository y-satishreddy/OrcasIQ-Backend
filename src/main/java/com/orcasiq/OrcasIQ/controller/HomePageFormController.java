package com.orcasiq.OrcasIQ.controller;
import com.orcasiq.OrcasIQ.model.HomePageForm;
import com.orcasiq.OrcasIQ.service.HomePageFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/form")
@CrossOrigin(origins = "*")
public class HomePageFormController {
    @Autowired
    private HomePageFormService homePageFormService;
    @PostMapping
    public HomePageForm homePageForm(@RequestBody HomePageForm homePageForm) {
        // Save the form to the database
        HomePageForm savedForm = homePageFormService.saveHomePageForm(homePageForm);
        // Send email notification with form data
        homePageFormService.sendHomePageFormEmail(savedForm);
        return savedForm;
    }
}
