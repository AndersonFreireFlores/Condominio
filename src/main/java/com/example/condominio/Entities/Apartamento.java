package com.example.condominio.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Apartamento {

    @Id
    private int id;

    private int andar;

    @ManyToOne
    private Edificio edificio;

    @OneToMany(mappedBy = "apartamento")
    private List<Morador> morador;

    private Long rendaMediaMoradores;

    public Apartamento() {
    }

    public Apartamento(int id, int andar, Edificio edificio, List<Morador> morador, Long rendaMediaMoradores) {
        this.id = id;
        this.andar = andar;
        this.edificio = edificio;
        this.morador = morador;
        this.rendaMediaMoradores = rendaMediaMoradores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public List<Morador> getMorador() {
        return morador;
    }

    public void setMorador(List<Morador> morador) {
        this.morador = morador;
    }

    public Long getRendaMediaMoradores() {
        return rendaMediaMoradores;
    }

    public void setRendaMediaMoradores(Long rendaMediaMoradores) {
        this.rendaMediaMoradores = rendaMediaMoradores;
    }
}
