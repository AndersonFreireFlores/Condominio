package com.example.condominio.Controllers;

import com.example.condominio.Entities.Edificio;
import com.example.condominio.Service.EdificioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EdificioController {

    private final EdificioService edificioService;

    public EdificioController(EdificioService edificioService) {
        this.edificioService = edificioService;
    }

    @GetMapping("/edificios")
    public List<Edificio> getEdificios() {
        return edificioService.findAll();
    }

    @GetMapping("/edificios/{id}")
    public Edificio getEdificioById(@PathVariable int id) {
        return edificioService.findById(id);
    }

    @PostMapping("/edificios")
    public Edificio createEdificio(@RequestBody Edificio edificio) {
        return edificioService.save(edificio);
    }

    @PutMapping("/edificios/{id}")
    public Edificio updateEdificio(@PathVariable int id, @RequestBody Edificio edificio) {
        return edificioService.update(id, edificio);
    }

    @DeleteMapping("/edificios/{id}")
    public void deleteEdificio(@PathVariable int id) {
        edificioService.deleteById(id);
    }
}
