package no.hvl.dat108.oblig3.controller;

import no.hvl.dat108.oblig3.utils.LoginUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Value("${message.invalidPassword}") private String INVALID_USERNAME_MESSAGE;
    @Value("${url.loginURL}")   private String LOGIN_URL;
    @Value("${url.handlelisteURL}") private String HANDLELISTE_URL;
    @Value("${Password}")
    private String pass;

    @GetMapping
    @RequestMapping("/")
    public String getLogin(Model model,
                           HttpSession session) {
        if (LoginUtil.isUserLoggedIn(session)){
            return "redirect:" + HANDLELISTE_URL;
        }
        return LOGIN_URL;
    }

    @PostMapping(value = "login")
    public String checkPassword(Model model,
                                @RequestParam(name = "password") String password,
                                HttpServletRequest request) {
        if (!password.equals(pass))
        {
            return LOGIN_URL;
        }
        LoginUtil.loginUser(request);
        return "redirect:" + HANDLELISTE_URL;
    }
}
