import java.util.Random;
//Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de
//20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois
//outros vetores
public class List46_Elements {
    public static void main(String[] args) {
        Random random = new Random();
        int [] vetorTotal = new int[20];
        int [] primeiroVetor = new int[10];
        int [] segundoVetor = new int[10];

        //Aqui eu vou preecher os arrays...
        System.out.println("Digite valores para o vetor1");
        for (int i = 0; i < primeiroVetor.length; i++) {
            primeiroVetor[i] = random.nextInt(10);
        }
        for (int i = 0; i < segundoVetor.length; i++) {
            segundoVetor[i] = random.nextInt(10);
        }
        System.out.println("PRIMEIRO VETOR");
        for (int i = 0; i < primeiroVetor.length; i++) {
            System.out.println(primeiroVetor[i]);
        }

        System.out.println("SEGUNDO VETOR");
        for (int i = 0; i < segundoVetor.length; i++) {
            System.out.println(segundoVetor[i]);
        }

        for (int i = 0 ; i < primeiroVetor.length; i++) {
            vetorTotal[2 * i] = primeiroVetor[i];
            vetorTotal[2 * i + 1] = segundoVetor[i];
        }

        System.out.println("VETOR TOTAL INTERCALADO");
        for (int i = 0; i < vetorTotal.length; i++) {
            System.out.println(vetorTotal[i]);
        }
    }
}
