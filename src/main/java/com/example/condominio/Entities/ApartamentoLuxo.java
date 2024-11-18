package com.example.condominio.Entities;

import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class ApartamentoLuxo extends Apartamento{

    private String tipoLuminaria;

    private boolean geladeiraInclusa;

    private boolean fogaoIncluso;

    public ApartamentoLuxo() {
    }

    public ApartamentoLuxo(String tipoLuminaria, boolean geladeiraInclusa, boolean fogaoIncluso) {
        this.tipoLuminaria = tipoLuminaria;
        this.geladeiraInclusa = geladeiraInclusa;
        this.fogaoIncluso = fogaoIncluso;
    }

    public ApartamentoLuxo(int id, int andar, Edificio edificio, List<Morador> morador, Long rendaMediaMoradores, String tipoLuminaria, boolean geladeiraInclusa, boolean fogaoIncluso) {
        super(id, andar, edificio, morador, rendaMediaMoradores);
        this.tipoLuminaria = tipoLuminaria;
        this.geladeiraInclusa = geladeiraInclusa;
        this.fogaoIncluso = fogaoIncluso;
    }

    public String getTipoLuminaria() {
        return tipoLuminaria;
    }

    public void setTipoLuminaria(String tipoLuminaria) {
        this.tipoLuminaria = tipoLuminaria;
    }

    public boolean isGeladeiraInclusa() {
        return geladeiraInclusa;
    }

    public void setGeladeiraInclusa(boolean geladeiraInclusa) {
        this.geladeiraInclusa = geladeiraInclusa;
    }

    public boolean isFogaoIncluso() {
        return fogaoIncluso;
    }

    public void setFogaoIncluso(boolean fogaoIncluso) {
        this.fogaoIncluso = fogaoIncluso;
    }
}
