import java.util.Random;

public class List42_EvenOrOdd {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int countPares = 0, countImpares = 0;

        for (int i = 0; i <= 19 ; i++) {

            numbers[i] = random.nextInt(100);

            if (numbers[i] % 2 == 0) {
                pares[countPares] = numbers[i];
                countPares++;
            } else {
                impares[countImpares] = numbers[i];
                countImpares++;
            }
        }
        System.out.println("Todos os números: ");
        for (int i = 0; i < 19; i++) {
            System.out.print(numbers[i] + " ,");
        }
        System.out.println("Pares: ");
        for (int i = 0; i <= countPares ;i++) {
            System.out.print(pares[i] + " ,");
        }

        System.out.println("Impares: ");
        for (int i = 0; i <= countImpares; i++) {
            System.out.print(impares[i] + " ,");
        }
    }
}
