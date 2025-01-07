package main.com.myApp.controller;

import main.com.myApp.controller.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController
{
    @RequestMapping("/" )
    public String showHomePage(Model model)
    {
        model.addAttribute("user" , new User());
        return "userForm";
    }

    @RequestMapping("/process")
    public String processForm(@ModelAttribute("user") User user , Model model)
    {

        model.addAttribute("theUser" , user );
        return "result";
    }
}


