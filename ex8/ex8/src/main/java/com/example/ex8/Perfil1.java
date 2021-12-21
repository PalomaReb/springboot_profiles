package com.example.ex8;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@Profile("perfil1")
@RestController

public class Perfil1 {
    String perfil = "perfil1";
    @GetMapping("/perfil")
    public void miFuncion(){
        System.out.println("este es perfil: " + perfil);
    }
}
