package no.hvl.dat108.oblig3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Value("${Password}")
    private String pass;

    @PostMapping(value = "login")
    public String checkPassword(Model model,
                                @RequestParam(name = "password") String password) {
        return "Passord er " + password.equals(pass);
    }
}
