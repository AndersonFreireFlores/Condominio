package com.example.condominio.Entities;

import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class ApartamentoPadrao extends Apartamento{

    private String tipoArmarios;

    private String tipoPiso;

    public ApartamentoPadrao() {
    }

    public ApartamentoPadrao(String tipoArmarios, String tipoPiso) {
        this.tipoArmarios = tipoArmarios;
        this.tipoPiso = tipoPiso;
    }

    public ApartamentoPadrao(int id, int andar, Edificio edificio, List<Morador> morador, Long rendaMediaMoradores, String tipoArmarios, String tipoPiso) {
        super(id, andar, edificio, morador, rendaMediaMoradores);
        this.tipoArmarios = tipoArmarios;
        this.tipoPiso = tipoPiso;
    }

    public String getTipoArmarios() {
        return tipoArmarios;
    }

    public void setTipoArmarios(String tipoArmarios) {
        this.tipoArmarios = tipoArmarios;
    }

    public String getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(String tipoPiso) {
        this.tipoPiso = tipoPiso;
    }
}
