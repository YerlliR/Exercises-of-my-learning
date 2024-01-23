package Exercises12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VotacionesMundial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            Map<String, Integer> votacionMunidal = new HashMap<>();

            for (int i = 0; i < num; i++) {
                String candidatura = scanner.next();
                votacionMunidal.put(candidatura, votacionMunidal.getOrDefault(candidatura, 0) + 1);
            }

            String ganador = campeonVotacion(votacionMunidal);

            System.out.println(ganador);
        }
    }

    private static String campeonVotacion (Map<String, Integer> votos) {
        int maxVotos = 0;
        String ganador = "EMPATE";

        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            if (entry.getValue() > maxVotos) {
                maxVotos = entry.getValue();
                ganador = entry.getKey();
            } else if (entry.getValue() == maxVotos) {
                ganador = "EMPATE";
            }
        }

        return ganador;
    }
}
