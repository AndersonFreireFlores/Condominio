package com.example.condominio.Service;

import com.example.condominio.Entities.Apartamento;
import com.example.condominio.Repositories.ApartamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartamentoService {

    private final ApartamentoRepository apartamentoRepository;

    public ApartamentoService(ApartamentoRepository apartamentoRepository) {
        this.apartamentoRepository = apartamentoRepository;
    }

    public List<Apartamento> findAll() {
        return apartamentoRepository.findAll();
    }

    public Apartamento findById(int id) {
        return apartamentoRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Apartamento não encontrado"));
    }

    public Apartamento save(Apartamento apartamento) {
        return apartamentoRepository.save(apartamento);
    }

    public Apartamento update(int id, Apartamento apartamento) {
    Apartamento apartamentoToUpdate = findById(id);
    apartamentoToUpdate.setAndar(apartamento.getAndar());
    apartamentoToUpdate.setEdificio(apartamento.getEdificio());
    apartamentoToUpdate.setMorador(apartamento.getMorador());
    apartamentoToUpdate.setRendaMediaMoradores(apartamento.getRendaMediaMoradores());
    return apartamentoRepository.save(apartamentoToUpdate);
}

    public void deleteById(int id) {
        apartamentoRepository.deleteById(id);
    }
}
