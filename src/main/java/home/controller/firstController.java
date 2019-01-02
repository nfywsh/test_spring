package home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fyw on 2019/1/2
 */
@Controller
@RequestMapping("/home")
public class firstController {
    @RequestMapping("/index")
    public String index() {
        return "home";
    }
}
