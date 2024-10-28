package AV2.Q8Matriz;

import java.util.Arrays;

public class Matriz {
    private int[][] elementos;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.elementos = new int[linhas][colunas];
    }

    public int getElemento(int linha, int coluna) {
        return elementos[linha][coluna];
    }

    public void setElemento(int linha, int coluna, int valor) {
        elementos[linha][coluna] = valor;
    }

    public Matriz adicionar(Matriz outra) {
        if (this.linhas != outra.linhas || this.colunas != outra.colunas) {
            throw new IllegalArgumentException("Matrizes devem ter as mesmas dimensões para adição.");
        }
        Matriz resultado = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.setElemento(i, j, this.getElemento(i, j) + outra.getElemento(i, j));
            }
        }
        return resultado;
    }

    public boolean equals(Matriz outra) {
        if (this.linhas != outra.linhas || this.colunas != outra.colunas) {
            return false;
        }
        for (int i = 0; i < linhas; i++) {
            if (!Arrays.equals(this.elementos[i], outra.elementos[i])) {
                return false;
            }
        }
        return true;
    }

    public Matriz transposta() {
        Matriz transposta = new Matriz(colunas, linhas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta.setElemento(j, i, this.getElemento(i, j));
            }
        }
        return transposta;
    }

    public Matriz oposta() {
        Matriz oposta = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                oposta.setElemento(i, j, -this.getElemento(i, j));
            }
        }
        return oposta;
    }

    public static Matriz gerarNula(int linhas, int colunas) {
        return new Matriz(linhas, colunas);  // Por padrão, todos os elementos são 0
    }

    public boolean isIdentidade() {
        if (linhas != colunas) return false;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if ((i == j && elementos[i][j] != 1) || (i != j && elementos[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isDiagonal() {
        if (linhas != colunas) return false;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i != j && elementos[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isSimetrica() {
        return this.equals(this.transposta());
    }

    public boolean isAntiSimetrica() {
        return this.equals(this.oposta().transposta());
    }

    public Matriz subtrair(Matriz outra) {
        if (this.linhas != outra.linhas || this.colunas != outra.colunas) {
            throw new IllegalArgumentException("Matrizes devem ter as mesmas dimensões para subtração.");
        }
        Matriz resultado = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.setElemento(i, j, this.getElemento(i, j) - outra.getElemento(i, j));
            }
        }
        return resultado;
    }

    public Matriz multiplicar(Matriz outra) {
        if (this.colunas != outra.linhas) {
            throw new IllegalArgumentException("Número de colunas da primeira matriz deve ser igual ao número de linhas da segunda.");
        }
        Matriz resultado = new Matriz(linhas, outra.colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < outra.colunas; j++) {
                int soma = 0;
                for (int k = 0; k < colunas; k++) {
                    soma += this.getElemento(i, k) * outra.getElemento(k, j);
                }
                resultado.setElemento(i, j, soma);
            }
        }
        return resultado;
    }

    public Matriz copiar() {
        Matriz copia = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            System.arraycopy(this.elementos[i], 0, copia.elementos[i], 0, colunas);
        }
        return copia;
    }

    public void exibir() {
        for (int[] linha : elementos) {
            System.out.println(Arrays.toString(linha));
        }
    }
}
