package com.taller.festivos.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller.festivos.entidades.tipo;

@RestController
@RequestMapping(path="festivos")
public class tipoController {
    @GetMapping
    public List<tipo> getTipos(){
        return List.of(
            new tipo(
                2565,
                "santo"
            )
        );

    }

    

}
