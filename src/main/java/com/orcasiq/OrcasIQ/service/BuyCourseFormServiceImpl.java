package com.orcasiq.OrcasIQ.service;

import com.orcasiq.OrcasIQ.model.BuyCourseForm;
import com.orcasiq.OrcasIQ.repository.BuyCourseFormRepository;
import com.orcasiq.OrcasIQ.service.BuyCourseFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class BuyCourseFormServiceImpl implements BuyCourseFormService {

    @Autowired
    private BuyCourseFormRepository buyCourseFormRepository;

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public BuyCourseForm saveForm(BuyCourseForm form) {
        return buyCourseFormRepository.save(form);
    }

    @Override
    public void sendCoursePurchaseEmail(BuyCourseForm form) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("your-email@example.com"); // 🔁 Replace with your actual receiving email
        message.setSubject("New Course Purchase Request");
        message.setText("A new course purchase request has been received:\n\n" +
                "Name: " + form.getName() + "\n" +
                "Email: " + form.getEmail() + "\n" +
                "Phone: " + form.getMobile_no() + "\n" +
                "Message: " + form.getMessage());

        javaMailSender.send(message);
    }
}
