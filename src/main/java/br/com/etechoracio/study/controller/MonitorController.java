package br.com.etechoracio.study.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitores")
public class MonitorController {
    public MonitorController()
    {

    }

    @PostMapping("/cadastrar")
    public ResponseEntity cadastrar()
    {
        return ResponseEntity
                .status(200)
                .body("Sucesso ao cadastrar usuário!");
    }
}
