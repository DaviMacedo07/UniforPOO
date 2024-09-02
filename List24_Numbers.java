import  java.util.Scanner;
public class List24_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] numeros = new double[3] ;
        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;


        for (int n = 0; n <= 2; n++) {
            System.out.println("Digite um numero: ");
            numeros[n] = scanner.nextDouble();


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

        System.out.printf("O maior valor inserido é: %.2f\n", maiorValor);
        System.out.printf("O menor valor inserido é: %.2f\n", menorValor);

    }
}
