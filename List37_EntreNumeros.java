    import java.util.Scanner;

    public class List37_EntreNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 12 e 20: ");
            numero = scanner.nextInt();

            if (numero < 12 || numero > 20) {
                System.out.println("Entrada inválida. Tente novamente.");
            }

                } while (numero < 12 || numero > 20);
    
                System.out.println("Número digitado: " + numero);

                scanner.close();
            }

    }
