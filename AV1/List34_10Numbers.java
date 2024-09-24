package AV1;

import java.util.Scanner;

public class List34_10Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] numeros = new double[10] ;
        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double somaTotal = 0;
        double media;

        for (int n = 0; n <= 9; n++) {
            System.out.println("Digite um numero: ");
            numeros[n] = scanner.nextDouble();
            somaTotal += numeros[n];

            if (numeros[n] > maiorValor) {
                maiorValor = numeros[n] ;
            }

            if (numeros[n] < menorValor) {
                menorValor = numeros[n];
            }
        }
        System.out.println("Números inseridos:");
        for (double numero : numeros) {
            System.out.println(numero);
        }

        double mediaDosNumeros = somaTotal / 10;
        System.out.printf("O maior valor inserido é: %.2f\n", maiorValor);
        System.out.printf("O menor valor inserido é: %.2f\n", menorValor);
        System.out.println("A soma total do valor foi de " + somaTotal);
        System.out.println("A media do valor foi de " + mediaDosNumeros);
        }
    }


