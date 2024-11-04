package com.example.condominio.Controllers;

import com.example.condominio.Entities.Morador;
import com.example.condominio.Service.MoradorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MoradorController {

    private final MoradorService moradorService;

    public MoradorController(MoradorService moradorService) {
        this.moradorService = moradorService;
    }

    @GetMapping("/moradores")
    public List<Morador> getMoradores() {
        return moradorService.findAll();
    }

    @GetMapping("/moradores/{id}")
    public Morador getMoradorById(@PathVariable int id) {
        return moradorService.findById(id);
    }

    @PostMapping("/moradores")
    public Morador createMorador(@RequestBody Morador morador) {
        return moradorService.save(morador);
    }

    @PutMapping("/moradores/{id}")
    public Morador updateMorador(@PathVariable int id,@RequestBody Morador morador) {
        return moradorService.update(id, morador);
    }

    @DeleteMapping("/moradores/{id}")
    public void deleteMorador(@PathVariable int id) {
        moradorService.deleteById(id);
    }
}
