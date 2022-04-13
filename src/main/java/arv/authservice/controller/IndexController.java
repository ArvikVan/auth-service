package arv.authservice.controller;

import arv.authservice.domain.Role;
import arv.authservice.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @author ArvikV
 * @version 1.0
 * @since 11.04.2022
 * тестовая
 */
@Controller
@RequiredArgsConstructor
public class IndexController {

    @GetMapping("/")
    public String testPage(@RequestParam String access_token, String refresh_token) {
        System.out.println(access_token);
        System.out.println(refresh_token);
        System.out.println("asdfasfasdfasdfasfdasdf");
        return "index";
    }
}
