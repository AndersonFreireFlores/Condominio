package com.example.condominio.Controllers;

import com.example.condominio.Entities.Condominio;
import com.example.condominio.Service.CondominioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CondominioController {

    private final CondominioService condominioService;

    public CondominioController(CondominioService condominioService) {
        this.condominioService = condominioService;
    }

    @GetMapping("/condominios")
    public List<Condominio> getCondominios() {
        return condominioService.findAll();
    }

    @GetMapping("/condominios/{id}")
    public Condominio getCondominioById(@PathVariable int id) {
        return condominioService.findById(id);
    }

    @PostMapping("/condominios")
    public Condominio createCondominio(@RequestBody Condominio condominio) {
        return condominioService.save(condominio);
    }

    @PutMapping("/condominios/{id}")
    public Condominio updateCondominio(@PathVariable int id, @RequestBody Condominio condominio) {
        return condominioService.update(id, condominio);
    }

    @DeleteMapping("/condominios/{id}")
    public void deleteCondominio(@PathVariable int id) {
        condominioService.deleteById(id);
    }
}