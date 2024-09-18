package AV2.Q1Contador;

import java.util.Scanner;

public class TesteContador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contador firstN = new Contador();
        int opt;

        System.out.println("Entre com um inteiro para o primeiro valor: ");
        firstN.valor = scanner.nextInt();

        System.out.println("O que você quer realizar com o número? 1 - Incrementar 2 - Zerar");
        opt = scanner.nextInt();

        if (opt == 1){
            firstN.incrementar();
            System.out.println(firstN.valor);
        } else {
            firstN.zerar();
            System.out.println(firstN.valor);
        }



    }
}
