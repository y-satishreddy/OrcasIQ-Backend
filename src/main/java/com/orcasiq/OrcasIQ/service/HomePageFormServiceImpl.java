package com.orcasiq.OrcasIQ.service;
import com.orcasiq.OrcasIQ.model.HomePageForm;
import com.orcasiq.OrcasIQ.repository.HomePageFormRepository;
import com.orcasiq.OrcasIQ.service.HomePageFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class HomePageFormServiceImpl implements HomePageFormService {

    @Autowired
    private HomePageFormRepository homePageFormRepository;

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public HomePageForm saveHomePageForm(HomePageForm form) {
        return homePageFormRepository.save(form);
    }

    @Override
    public void sendHomePageFormEmail(HomePageForm form) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("your-email@example.com"); // 👈 Replace with your receiving email
        message.setSubject("New Inquiry from Home Page Form");
        message.setText("You received a new inquiry:\n\n" +
                "Name: " + form.getName() + "\n" +
                "Email: " + form.getEmail() + "\n" +
                "Phone: " + form.getMobileNo() + "\n" +
                "Message: " + form.getMessage());

        javaMailSender.send(message);
    }
}
