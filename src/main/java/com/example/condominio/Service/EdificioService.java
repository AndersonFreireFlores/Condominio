package com.example.condominio.Service;

import com.example.condominio.Entities.Edificio;
import com.example.condominio.Repositories.EdificioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdificioService {

    private final EdificioRepository edificioRepository;

    public EdificioService(EdificioRepository edificioRepository) {
        this.edificioRepository = edificioRepository;
    }

    public List<Edificio> findAll() {
        return edificioRepository.findAll();
    }

    public Edificio findById(int id) {
        return edificioRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Edificio não encontrado"));
    }

    public Edificio save(Edificio edificio) {
        return edificioRepository.save(edificio);
    }

    public Edificio update(int id, Edificio edificio) {
    Edificio edificioToUpdate = findById(id);
    edificioToUpdate.setCor(edificio.getCor());
    edificioToUpdate.setAndares(edificio.getAndares());
    edificioToUpdate.setCondominio(edificio.getCondominio());
    return edificioRepository.save(edificioToUpdate);
}

    public void deleteById(int id) {
        edificioRepository.deleteById(id);
    }
}