package AV2.Q7Conjunto;

import java.util.Arrays;

public class Conjunto {
    private String[] elementos;
    private int tamanho;

    public Conjunto() {
        this.elementos = new String[10]; // Capacidade inicial
        this.tamanho = 0; // Tamanho inicial
    }

    public void adicionar(String elemento) {
        if (!contido(elemento)) {
            if (tamanho == elementos.length) {
                aumentarCapacidade();
            }
            elementos[tamanho] = elemento;
            tamanho++;
        }
    }

    public boolean contido(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public Conjunto uniao(Conjunto outro) {
        Conjunto resultado = new Conjunto();

        // Adiciona elementos do conjunto atual
        for (int i = 0; i < this.tamanho; i++) {
            resultado.adicionar(this.elementos[i]);
        }

        // Adiciona elementos do outro conjunto
        for (int i = 0; i < outro.tamanho; i++) {
            resultado.adicionar(outro.elementos[i]);
        }

        return resultado;
    }

    public Conjunto inter(Conjunto outro) {
        Conjunto resultado = new Conjunto();

        for (int i = 0; i < this.tamanho; i++) {
            if (outro.contido(this.elementos[i])) {
                resultado.adicionar(this.elementos[i]);
            }
        }

        return resultado;
    }

    public Conjunto menos(Conjunto outro) {
        Conjunto resultado = new Conjunto();

        for (int i = 0; i < this.tamanho; i++) {
            if (!outro.contido(this.elementos[i])) {
                resultado.adicionar(this.elementos[i]);
            }
        }

        return resultado;
    }

    public void aumentarCapacidade() {
        elementos = Arrays.copyOf(elementos, elementos.length * 2);
    }

    public void print() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    public int getTamanho() {
        return this.tamanho;
    }
}