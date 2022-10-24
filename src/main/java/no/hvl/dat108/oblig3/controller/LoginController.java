package no.hvl.dat108.oblig3.controller;

import no.hvl.dat108.oblig3.utils.LoginUtil;
import no.hvl.dat108.oblig3.utils.Validator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/${url.loginURL}")
public class LoginController {
    @Value("${message.invalidPassword}") private String INVALID_PASSWORD_MESSAGE;
    @Value("${url.loginURL}")   private String LOGIN_URL;
    @Value("${url.handlelisteURL}") private String HANDLELISTE_URL;
    @Value("${Password}") private String pass;

    @GetMapping
    public String getLogin() {

        return LOGIN_URL;
    }

    @PostMapping
    public String tryLogin(@RequestParam(name = "password") String password,
                                HttpServletRequest request, RedirectAttributes ra) {
        if (!Validator.isValidPassword(password, pass))
        {
            ra.addFlashAttribute("redirectMessage", INVALID_PASSWORD_MESSAGE);
            return LOGIN_URL;
        }
        LoginUtil.loginUser(request);
        return "redirect:" + HANDLELISTE_URL;
    }
}
