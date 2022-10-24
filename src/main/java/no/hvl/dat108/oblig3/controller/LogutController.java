package no.hvl.dat108.oblig3.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import no.hvl.dat108.oblig3.utils.LoginUtil;

@Controller
@RequestMapping("/${url.logoutURL}")
public class LogutController {

    @Value("${message.logout}")   private String LOGGED_OUT_MESSAGE;
    @Value("${url.loginURL}") private String LOGIN_URL;

    @PostMapping
    public String loggUt(HttpSession session, RedirectAttributes ra){
        if(LoginUtil.isUserLoggedIn(session)){
            LoginUtil.logoutUser(session);
        }
        ra.addFlashAttribute("redirectMessage", LOGGED_OUT_MESSAGE);
        return "redirect:" + LOGIN_URL;
    }
}
