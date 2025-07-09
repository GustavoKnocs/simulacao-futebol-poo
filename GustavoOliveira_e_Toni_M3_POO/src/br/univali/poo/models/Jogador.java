package br.univali.poo.models;

public abstract class Jogador {
    private String nome;
    private int idade;
    private int gols;

    public Jogador(String nome, int idade) {
        if (idade < 18) throw new IllegalArgumentException("Idade mínima é 18 anos.");
        this.nome = nome;
        this.idade = idade;
        this.gols = 0;
    }

    public void marcarGol() {
        gols++;
    }

    public int getGols() {
        return gols;
    }

    public String getNome() {
        return nome;
    }

    public abstract int getHabilidade();

    @Override
    public String toString() {
        return String.format("%s (%d anos, %d gol(s))", nome, idade, gols);
    }
}

