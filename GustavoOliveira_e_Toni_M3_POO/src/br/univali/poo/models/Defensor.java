package br.univali.poo.models;

public class Defensor extends Jogador {
    private int cobertura;
    private int desarme;

    public Defensor(String nome, int idade, int cobertura, int desarme) {
        super(nome, idade);
        if (cobertura < 0 || desarme < 0) throw new IllegalArgumentException("cobertura e desarme devem ser positivos.");
        this.cobertura = cobertura;
        this.desarme = desarme;
    }

    public int getCobertura() {
        return cobertura;
    }

    public void setCobertura(int cobertura) {
        this.cobertura = cobertura;
    }

    public int getDesarme() {
        return desarme;
    }

    public void setDesarme(int desarme) {
        this.desarme = desarme;
    }

    @Override
    public int getHabilidade() {
        return (cobertura * 3 + desarme * 2) / 5;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" [Defensor: Cobertura=%d, Desarme=%d]", cobertura, desarme);
    }
}
