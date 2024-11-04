package com.example.condominio.Service;

import com.example.condominio.Entities.Condominio;
import com.example.condominio.Repositories.CondominioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CondominioService {

    private final CondominioRepository condominioRepository;

    public CondominioService(CondominioRepository condominioRepository) {
        this.condominioRepository = condominioRepository;
    }

    public List<Condominio> findAll() {
        return condominioRepository.findAll();
    }

    public Condominio findById(Integer id) {
        return condominioRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Condominio não encontrado"));
    }

    public Condominio save(Condominio condominio) {
        return condominioRepository.save(condominio);
    }

    public Condominio update(int id, Condominio condominio) {
    Condominio condominioToUpdate = findById(id);
    condominioToUpdate.setNome(condominio.getNome());
    condominioToUpdate.setCidade(condominio.getCidade());
    condominioToUpdate.setBairro(condominio.getBairro());
    condominioToUpdate.setEdificios(condominio.getEdificios());
    return condominioRepository.save(condominioToUpdate);
}
    public void deleteById(Integer id) {
        condominioRepository.deleteById(id);
    }
}
