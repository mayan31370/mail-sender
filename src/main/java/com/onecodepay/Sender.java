package com.onecodepay;

import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mayan on 2017/12/21.
 */
@RestController
public class Sender {
  private static final String from = "notice@chenyuzhifu.com";
  @Autowired
  private JavaMailSender mailSender;

  @PostMapping("/")
  public String sendEmail(@NotNull String to, @NotNull String subject, @NotNull String content) {
    SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
    simpleMailMessage.setFrom(from);
    simpleMailMessage.setTo(to);
    simpleMailMessage.setSubject(subject);
    simpleMailMessage.setText(content);
    mailSender.send(simpleMailMessage);
    return "OK";
  }
}
