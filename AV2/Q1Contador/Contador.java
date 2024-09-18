package AV2.Q1Contador;

public class Contador {
    public int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void zerar() {
            this.valor = 0;
        }

    public void incrementar() {
        this.valor++;
    }

}
