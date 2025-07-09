package br.univali.poo.view;

import br.univali.poo.controller.GameController;
import br.univali.poo.models.Jogador;
import br.univali.poo.models.Time;

public class ConsoleView {
    public static void main(String[] args) {
        GameController controller = new GameController();
        Time time = controller.getTime();

        System.out.println("RELATÓRIO INICIAL:");
        for (Jogador j : time) {
            System.out.printf("%s - Habilidade: %d%n", j, j.getHabilidade());
        }

        controller.simularTreino();

        System.out.println("\nRELATÓRIO DE TREINO:");
        for (Jogador j : time) {
            System.out.printf("%s - Gols marcados: %d%n", j.getNome(), j.getGols());
        }
    }
}