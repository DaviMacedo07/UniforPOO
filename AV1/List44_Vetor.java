import java.util.Random;

public class List44_Vetor {
    public static void main(String[] args) {
        Random random = new Random();

        int []vetor = new int[5];
        int somaIndices = 0, multiplicaIndices = 1;
        System.out.println("Digite um número inteiro: ");
        for (int i = 0; i < vetor.length;i++ ) {
            vetor[i] = random.nextInt(5);
            somaIndices += vetor[i];
            multiplicaIndices *= vetor[i];
        }

        System.out.println("Vetor completo:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d]: %d\n", i, vetor[i]);
        }

        System.out.println("Soma dos Indices do Vetor: " + somaIndices);
        System.out.println("Multiplicação dos indices do Vetor: " + multiplicaIndices);
    }
}
