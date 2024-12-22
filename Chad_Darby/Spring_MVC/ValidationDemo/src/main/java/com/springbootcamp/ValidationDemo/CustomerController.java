package com.springbootcamp.ValidationDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class CustomerController {

public String showForm(Model theModel){

    theModel.addAttribute("customer",new Customer());
    return "customer-form";
}

}
