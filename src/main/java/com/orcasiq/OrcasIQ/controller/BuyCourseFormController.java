package com.orcasiq.OrcasIQ.controller;
import com.orcasiq.OrcasIQ.model.BuyCourseForm;
import com.orcasiq.OrcasIQ.repository.BuyCourseFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/buy-course")
@CrossOrigin(origins = "*") // Allow CORS from any frontend
public class BuyCourseFormController {
    @Autowired
    private BuyCourseFormRepository buyCourseFormRepository;
    @PostMapping
    public BuyCourseForm submitForm(@RequestBody BuyCourseForm form) {
        return buyCourseFormRepository.save(form);
    }
}
