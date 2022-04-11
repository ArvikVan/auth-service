package arv.authservice.controller;

import arv.authservice.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ArvikV
 * @version 1.0
 * @since 11.04.2022
 * тестовая
 */
@RequestMapping("/api")
@Controller
public class IndexController {
    @GetMapping("/page")
    public String testPage(@RequestParam String access_token, String refresh_token) {
        System.out.println(access_token);
        System.out.println(refresh_token);
        System.out.println("asdfasfasdfasdfasfdasdf");
        return "index";
    }
}
