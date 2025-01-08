package main.com.myApp.controller;

import main.com.myApp.controller.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
;


@Controller
public class HomeController
{
    @RequestMapping("/" )
    public String showHomePage(Model model)
    {
        model.addAttribute("user" , new User());
        return "employeeForm";
    }

    @RequestMapping("/submitForm")
    public String processForm(@RequestParam("username") String username,
                              @RequestParam("email") String email,
                              @RequestParam("password") String password,
                              Model model) {
        model.addAttribute("username", username);
        model.addAttribute("email", email);
        model.addAttribute("password", password);

        return "success";
    }
}


