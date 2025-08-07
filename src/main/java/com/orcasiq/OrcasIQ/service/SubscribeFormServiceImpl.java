package com.orcasiq.OrcasIQ.service;

import com.orcasiq.OrcasIQ.model.SubscribeForm;
import com.orcasiq.OrcasIQ.repository.SubscribeFormRepository;
import com.orcasiq.OrcasIQ.service.SubscribeFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SubscribeFormServiceImpl implements SubscribeFormService {

    @Autowired
    private SubscribeFormRepository subscribeFormRepository;

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public SubscribeForm saveSubscription(SubscribeForm form) {
        return subscribeFormRepository.save(form);
    }

    @Override
    public void sendSubscriptionEmail(SubscribeForm form) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("yettapusatishreddy@gmail.com"); // 👈 Replace with your actual email
        message.setSubject("New Subscriber Alert");
        message.setText("A new user has subscribed.\n\nName: " + form.getEmail() +
                "\nEmail: " + form.getEmail());

        javaMailSender.send(message);
    }
}
