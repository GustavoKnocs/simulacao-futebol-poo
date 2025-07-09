package br.univali.poo.controller;

import br.univali.poo.models.*;

public class GameController {
    private Time time;

    public GameController() {
        time = new Time("Unidos da Univali");

        time.adicionarJogador(new Atacante("João", 22, 8, 7));
        time.adicionarJogador(new Defensor("Gustavo", 19, 6, 7));
        time.adicionarJogador(new Goleiro("Toni", 20, 9, 1.80f));
    }

    public Time getTime() {
        return time;
    }

    public void simularTreino() {
        for (Jogador jogador : time) {
            if (!(jogador instanceof Goleiro)) {
                int gols = (int)(Math.random() * 5);
                for (int i = 0; i < gols; i++) {
                    jogador.marcarGol();
                }
            }
        }
    }
}