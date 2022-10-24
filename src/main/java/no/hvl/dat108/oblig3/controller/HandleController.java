package no.hvl.dat108.oblig3.controller;

import no.hvl.dat108.oblig3.Handleliste;
import no.hvl.dat108.oblig3.utils.LoginUtil;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/${url.handlelisteURL}")
public class HandleController {
    @Value("${message.requireLogin}") private String REQUIRES_LOGIN_MESSAGE;
    @Value("${url.loginURL}")   private String LOGIN_URL;
    @Value("${url.handlelisteURL}") private String HANDLELISTE_URL;


    @GetMapping
    public String visHandleliste(Model model, HttpSession session, RedirectAttributes ra){
        if (!LoginUtil.isUserLoggedIn(session)) {
            ra.addFlashAttribute("redirectMessage", REQUIRES_LOGIN_MESSAGE);
            return "redirect:" + LOGIN_URL;
        }
        return HANDLELISTE_URL;
    }

    @PostMapping
    public String addToList(Model model,
                            @RequestParam(name = "newItem") String newItem){
        return "redirect:" + HANDLELISTE_URL;
    }

   //@PostMapping
    public String removeFromList(Model model,
                                 @RequestParam(name = "remItem") String remItem){
        return "redirect:" + HANDLELISTE_URL;
    }
}
