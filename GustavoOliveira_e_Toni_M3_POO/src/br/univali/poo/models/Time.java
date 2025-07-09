package br.univali.poo.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Time implements Iterable<Jogador> {
    private String nome;
    private List<Jogador> jogadores;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    @Override
    public Iterator<Jogador> iterator() {
        return jogadores.iterator();
    }

    public String getNome() {
        return nome;
    }
}