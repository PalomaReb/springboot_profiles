package com.example.ex8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GETcontroller {

    @Value("${url: no hay valor}")
    String url;

    @Value("${password: no hay valor}")
    String password;

    @GetMapping("/parametros")
    public String getAppProp(){
        return "Esta es la url: " + url + " y esta es la password: "+ password;
    }



@Value("${valor1: No se encontro ningun valor1}")
    String valor1;

    @Value("${valor2: no se encontro ningun valor2}")
    String valor2;

    @GetMapping("/miconfiguracion")
    public String configval (){
        return "Estos son los valores valor1: " + valor1 + " y valor2: " + valor2;
    }

}
