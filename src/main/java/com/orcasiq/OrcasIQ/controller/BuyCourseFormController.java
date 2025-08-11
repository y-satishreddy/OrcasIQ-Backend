package com.orcasiq.OrcasIQ.controller;
import com.orcasiq.OrcasIQ.model.BuyCourseForm;
import com.orcasiq.OrcasIQ.service.BuyCourseFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/buy-course")
@CrossOrigin(origins = "*")
public class BuyCourseFormController {
    @Autowired
    private BuyCourseFormService buyCourseFormService;
    @PostMapping
    public BuyCourseForm submitForm(@RequestBody BuyCourseForm form) {
        BuyCourseForm savedForm = buyCourseFormService.saveForm(form);
        buyCourseFormService.sendCoursePurchaseEmail(savedForm);
        return savedForm;
    }
}
