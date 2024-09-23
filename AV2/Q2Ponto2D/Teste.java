package AV2.Q2Ponto2D;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Plano ponto1 = new Plano(1.1, 2.3);
        Plano ponto2 = new Plano(3.4, 6.4);

        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println(ponto1.calcularDistanciaParaOrigem());

        System.out.println("Distância entre o ponto 1 e o ponto 2: " + distancia);
    }
}
