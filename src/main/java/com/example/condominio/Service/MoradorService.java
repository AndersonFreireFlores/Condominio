package com.example.condominio.Service;

import com.example.condominio.Entities.Morador;
import com.example.condominio.Repositories.MoradorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoradorService {

    private final MoradorRepository moradorRepository;

    public MoradorService(MoradorRepository moradorRepository) {
        this.moradorRepository = moradorRepository;
    }

    public List<Morador> findAll() {
        return moradorRepository.findAll();
    }

    public Morador findById(int id) {
        return moradorRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Morador não encontrado"));
    }

    public Morador save(Morador morador) {
        return moradorRepository.save(morador);
    }

    public void deleteById(int id) {
        moradorRepository.deleteById(id);
    }
}
