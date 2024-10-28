package AV2.AV2Interfaces.Q6Palavras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // "Ola", "Pedro", "Garrafa","mouse"
        ConjuntoPalavras conjuntoPalavras = new ConjuntoPalavras();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra para checar se está no vocabulário do sistema");
        String resposta = sc.nextLine();

        boolean resultado = conjuntoPalavras.contemPalavra(resposta);

        System.out.println("Todas as palavras estão no conjunto? " + resultado);
    }
}
