package com.example.java.apache.commons.email;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class JavaSimpleEmail {

    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.qq.com");
        email.setSmtpPort(465);
        email.setAuthentication("username", "password");
        email.setSSLOnConnect(true);
        email.setFrom("809730879@qq.com");
        email.setSubject("Email Subject");
        email.setMsg("Email Content");
        email.addTo("386657687@qq.com");
        email.send();
    }
}
