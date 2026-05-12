package mx.edu.tecdesoftware.market_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//anotaciones: importas ciertas funcionalidad, utilizando la api rest
@RestController
//anotación para requuest mapping
//@RequestMapping("/hola")
public class HelloWorldController {
    //un metodo http
    @GetMapping("/hola")
    public String hola(){ return "Hello World"; }
}
