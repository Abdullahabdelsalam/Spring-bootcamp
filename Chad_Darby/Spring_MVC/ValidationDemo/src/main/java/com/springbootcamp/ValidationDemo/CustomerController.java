package com.springbootcamp.ValidationDemo;

import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    public void initBinder(WebDataBinder dateBinder){

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        dateBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @GetMapping("/")
    public String showForm(Model theModel){
        theModel.addAttribute("customer",new Customer());
        return "customer-form";
    }

    @PostMapping("/processForm")
    public String processF0rm(@Valid @ModelAttribute("customer") Customer theCustomer,
                              BindingResult theBindingResult) {
        if(theBindingResult.hasErrors()){
            return "customer-form";
        }else{
            return "customer-confirmation";
        }

    }


}
