package main.com.myApp.controller;

import main.com.myApp.controller.model.User;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

//@Controller
//public class HomeController
//{
//    @RequestMapping("/" )
//    public String showHomePage(Model theModel)
//    {
//        User theUser = new User();
//        theModel.addAttribute("userName",theUser.getUserName());
//        return "userForm";
//    }
//
//
//    @RequestMapping("/process")
//    public String processForm(@RequestParam("userName") String userName,
//                              @RequestParam("password") String password,
//                              @RequestParam("country") String country,
//                              @RequestParam("programmingLanguage") String programmingLanguage,
//                              @RequestParam("operatingSystem") String operatingSystem,
//                              Model model){
//
//        model.addAttribute("userName",userName);
//        model.addAttribute("password",password);
//        model.addAttribute("country",country);
//        model.addAttribute("programmingLanguage",programmingLanguage);
//        model.addAttribute("operatingSystem",operatingSystem);
//        System.out.println(userName);
//
//        return "result";
//    }
//}


