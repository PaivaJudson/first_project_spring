package com.judson.paiva;

import org.springframework.stereotype.Controller;
<<<<<<< HEAD
=======
import org.springframework.ui.Model;
>>>>>>> Enviando menssagem com o model
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
<<<<<<< HEAD
    public String homeApp(){
=======
    public String homeApp(Model model){
        model.addAttribute("messagem", "Essa foi uma menssagem injectada");
>>>>>>> Enviando menssagem com o model
        return "index";
    }

}
