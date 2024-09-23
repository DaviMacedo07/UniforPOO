package AV1;

import java.util.Scanner;

public class List33_HigherOrMinor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []vetorTotal = new int[3];
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;

        for (int i = 0; i < vetorTotal.length; i++) {
            System.out.println("Digite  valor para inserir no vetor: ");
            vetorTotal[i] = scanner.nextInt();

            if (vetorTotal[i] > maiorValor) {
                 maiorValor = vetorTotal[i] ;
            }

            if (vetorTotal[i] < menorValor) {
                menorValor=  vetorTotal[i] ;
            }
        }

        for (int i = 0; i < vetorTotal.length; i++) {
            System.out.println(vetorTotal[i]);
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);

    }
}
