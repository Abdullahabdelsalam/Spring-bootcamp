package main.com.myApp.controller.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userName;

    private String password;

    private String country;

    private String programmingLanguage;

    private String operatingSystem;
}
