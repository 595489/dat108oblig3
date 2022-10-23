package no.hvl.dat108.oblig3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @PostMapping(value = "login")
    public String checkPassword(Model model,
                                @RequestParam(name = "password") String password) {
        if (password.equals(@Value("${Password}")))
            //login = true
        else {
            //login = false
        }
    }
}
