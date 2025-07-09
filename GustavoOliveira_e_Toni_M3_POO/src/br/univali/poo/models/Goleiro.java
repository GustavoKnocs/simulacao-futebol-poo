package br.univali.poo.models;

public class Goleiro extends Jogador {
    private int reflexo;
    private float altura;

    public Goleiro(String nome, int idade, int reflexo, float altura) {
        super(nome, idade);
        if (reflexo < 0 || altura < 1.0f) throw new IllegalArgumentException("Reflexo deve ser positivo e altura mínima é 1.0m.");
        this.reflexo = reflexo;
        this.altura = altura;
    }

    public int getReflexo() {
        return reflexo;
    }

    public void setReflexo(int reflexo) {
        this.reflexo = reflexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public int getHabilidade() {
        return ((int)(altura * 10) * 2 + reflexo * 3) / 5;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" [Goleiro: Reflexo=%d, Altura=%.2fm]", reflexo, altura);
    }
}
