package com.orcasiq.OrcasIQ.controller;
import com.orcasiq.OrcasIQ.model.SubscribeForm;
import com.orcasiq.OrcasIQ.service.SubscribeFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/mail-data")
@CrossOrigin(origins = "*")
public class MailFormController {
    @Autowired
    private SubscribeFormService subscribeFormService;
    @PostMapping
    public SubscribeForm subscribeFormHandler(@RequestBody SubscribeForm subscribeForm) {
        // Save to DB
        SubscribeForm savedForm = subscribeFormService.saveSubscription(subscribeForm);
        // Send email notification
        subscribeFormService.sendSubscriptionEmail(savedForm);
        return savedForm;
    }
}
