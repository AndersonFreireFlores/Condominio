package com.example.condominio.Controllers;

import com.example.condominio.Entities.Apartamento;
import com.example.condominio.Service.ApartamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApartamentoController {

    private final ApartamentoService apartamentoService;

    public ApartamentoController(ApartamentoService apartamentoService) {
        this.apartamentoService = apartamentoService;
    }

    @GetMapping("/apartamentos")
    public List<Apartamento> getApartamentos() {
        return apartamentoService.findAll();
    }

    @GetMapping("/apartamentos/{id}")
    public Apartamento getApartamentoById(@PathVariable int id) {
        return apartamentoService.findById(id);
    }

    @PostMapping("/apartamentos")
    public Apartamento createApartamento(@RequestBody Apartamento apartamento) {
        return apartamentoService.save(apartamento);
    }

    @PutMapping("/apartamentos/{id}")
    public Apartamento updateApartamento(@PathVariable int id, @RequestBody Apartamento apartamento) {
        return apartamentoService.update(id, apartamento);
    }

    @DeleteMapping("/apartamentos/{id}")
    public void deleteApartamento(@PathVariable int id) {
        apartamentoService.deleteById(id);
    }
}