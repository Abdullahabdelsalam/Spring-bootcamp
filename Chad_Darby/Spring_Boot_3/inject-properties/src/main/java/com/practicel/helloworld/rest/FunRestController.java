package com.practicel.helloworld.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties
    @Value("${player.name}")
    private String playerName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/team")
    public String getTeam(){
        return "Player: " + playerName + " => " + " Teem: " + teamName;
    }

    @GetMapping("/")
    public String sayHelloWorld(){
        return "Hello Word";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hart 5k!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day.";
    }

}
