package AV2.Q8Matriz;

import java.util.Scanner;

public class Matriz {
    private int linhas;
    private int colunas;
    private int [][]matriz;

    public Matriz(int linhas, int colunas, int[][] matriz) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.matriz = new int [linhas][colunas];
    }

    public void alimentarMatriz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantas linhas serão: ");
        this.linhas = scanner.nextInt();
        System.out.println("Quantas colunas serão: ");
        this.colunas = scanner.nextInt();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Digite o indice da matriz na posição: [ " + i + " ][ " + j + " ]");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
}
