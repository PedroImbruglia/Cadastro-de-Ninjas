package dev.Java10xCadastroDeNInjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class Controller {
    @GetMapping ("/boasVindas") //GetMapping vai pegar informações
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

}
