package com.example.condominio.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Edificio {

    @Id
    private int id;

    private String cor;

    private int andares;

    @ManyToOne
    private Condominio condominio;

    @OneToMany(mappedBy = "edificio")
    private List<Apartamento> apartamentos;

    public Edificio() {
    }

    public Edificio(int id, String cor, int andares, Condominio condominio, List<Apartamento> apartamentos) {
        this.id = id;
        this.cor = cor;
        this.andares = andares;
        this.condominio = condominio;
        this.apartamentos = apartamentos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    public List<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(List<Apartamento> apartamentos) {
        this.apartamentos = apartamentos;
    }
}
