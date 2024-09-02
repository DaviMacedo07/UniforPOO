import java.util.Scanner;
public class List42_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int countPares = 0, countImpares = 0;

        for (int i = 0; i <= 19 ; i++) {
            System.out.println("Digite um numero: ");
            numbers[i] = scanner.nextInt();

            if (numbers[i] % 2 == 0) {
                pares[countPares] = numbers[i];
                countPares++;
            } else {
                impares[countImpares] = numbers[i];
                countImpares++;
            }

        }
    }
}
