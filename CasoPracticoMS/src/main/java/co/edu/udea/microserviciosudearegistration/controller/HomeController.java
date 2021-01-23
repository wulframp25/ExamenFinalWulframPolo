package co.edu.udea.microserviciosudearegistration.controller;

import co.edu.udea.microserviciosudearegistration.MicroserviciosUdeaRegistrationApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class HomeController {

    @RequestMapping(value = "/hello")

    public String mostrarMensaje() {

        return "Hola mundo desde Spring Boot";

    }
}
