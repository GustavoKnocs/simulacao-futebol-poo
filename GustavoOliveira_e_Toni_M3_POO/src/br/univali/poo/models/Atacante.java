package br.univali.poo.models;

public class Atacante extends Jogador {
    private int velocidade;
    private int tecnica;

    public Atacante(String nome, int idade, int velocidade, int tecnica) {
        super(nome, idade);
        if (velocidade < 0 || tecnica < 0) throw new IllegalArgumentException("Velocidade e técnica devem ser não-negativos.");
        this.velocidade = velocidade;
        this.tecnica = tecnica;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }

    @Override
    public int getHabilidade() {
        return (velocidade * 2 + tecnica * 3) / 5;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" [Atacante: Velocidade=%d, Tecnica=%d]", velocidade, tecnica);
    }
}