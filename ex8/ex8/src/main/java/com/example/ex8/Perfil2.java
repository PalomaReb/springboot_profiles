package com.example.ex8;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@Profile("perfil2")
@RestController
public class Perfil2 implements Perfiles{

    String perfil = "perfil2";
@GetMapping("/perfil")

    public void miFuncion(){
    System.out.println("este es perfil: " + perfil);
}

}
