package com.example.java.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

public class ShiroQuickStart {

    public static void main(String[] args) {
        Subject currentUser = SecurityUtils.getSubject();

        Session session = currentUser.getSession();
        session.setAttribute("some_key", "some_value");

        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken("username", "password");
            token.setRememberMe(true);
            try {
                currentUser.login(token);
            } catch (UnknownAccountException e) {
                // xxx
            } catch (AuthenticationException e) {
                // xxx
            }
        }

        if (currentUser.hasRole("xxx")) {}
        if (currentUser.isPermitted("xxx")) {}

        currentUser.logout();
    }
}
