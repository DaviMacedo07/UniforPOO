package AV2.Q8Matriz;

import java.util.Scanner;

public class Matriz {
    private int linhas;
    private int colunas;
    private int [][]matriz;

    public Matriz(int linhas, int colunas) {
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

        matriz = new int [linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Digite o indice da matriz na posição: [ " + i + " ][ " + j + " ]");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz alimentada! ");
    }

    public void mostrarMatriz() {
                System.out.println("Matriz:");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }

        public Matriz somar (Matriz outra) {
            Matriz resultado = new Matriz(this.linhas, this.colunas);
            for (int i = 0; i < this.linhas; i++) {
                for (int j = 0; j < this.colunas; j++) {
                    resultado.matriz[i][j] = this.matriz[i][j] + outra.matriz[i][j];
                }
            }
            return resultado;
        }

        public boolean equalsMatrizes(Matriz outra) {
            for (int i = 0; i < this.linhas; i++) {
                for (int j = 0; j < this.colunas; j++) {
                    if (this.matriz[i][j] != outra.matriz[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }

    public Matriz transpor() {
        Matriz transposta = new Matriz(this.colunas, this.linhas);
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                transposta.matriz[j][i] = this.matriz[i][j];
            }
        }
        return transposta;
    }


    }
