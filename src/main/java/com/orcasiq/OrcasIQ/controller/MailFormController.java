package com.orcasiq.OrcasIQ.controller;

import com.orcasiq.OrcasIQ.model.SubscribeForm;
import com.orcasiq.OrcasIQ.repository.SubscribeFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail-data")
public class MailFormController {
    @Autowired
    private SubscribeFormRepository subscribeFormRepository;
    @PostMapping
    public SubscribeForm subscribeFormHandler(@RequestBody SubscribeForm subscribeForm){
        return subscribeFormRepository.save(subscribeForm);
    }
}
