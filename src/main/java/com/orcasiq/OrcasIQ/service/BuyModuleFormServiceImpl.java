package com.orcasiq.OrcasIQ.service;

import com.orcasiq.OrcasIQ.model.BuyModuleForm;
import com.orcasiq.OrcasIQ.repository.BuyModuleFormRepository;
import com.orcasiq.OrcasIQ.service.BuyModuleFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class BuyModuleFormServiceImpl implements BuyModuleFormService {

    @Autowired
    private BuyModuleFormRepository buyModuleFormRepository;

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public BuyModuleForm saveModuleForm(BuyModuleForm form) {
        return buyModuleFormRepository.save(form);
    }

    @Override
    public void sendModuleFormEmail(BuyModuleForm form) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("yettapusatishreddy@gmail.com"); // 👉 Replace with your email
        message.setSubject("New Module Purchase Request");
        message.setText("You received a new module purchase request:\n\n" +
                "Name: " + form.getName() + "\n" +
                "Email: " + form.getEmail() + "\n" +
                "Phone: " + form.getMobile_no() + "\n" +
                "Message: " + form.getMessage());

        javaMailSender.send(message);
    }
}
