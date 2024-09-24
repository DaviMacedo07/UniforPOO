package AV2.Q5Pais;

public class Pais {
    private String codISO ;
    private String namePais;
    private double kmPais;
    private long populacao;

    @Override
    public String toString() {
        return "Pais{" +
                "codISO='" + codISO + '\'' +
                ", Nome do País='" + namePais + '\'' +
                ", Dimensão em KM²=" + kmPais +
                ", População=" + populacao +
                '}';
    }

    public Pais(String codISO, String namePais, double kmPais, long populacao) {
        this.codISO = codISO;
        this.namePais = namePais;
        this.kmPais = kmPais;
        this.populacao = populacao;
    }

    public String getCodISO() {
        return codISO;
    }

    public void setCodISO(String codISO) {
        this.codISO = codISO;
    }

    public String getNamePais() {
        return namePais;
    }

    public void setNamePais(String namePais) {
        this.namePais = namePais;
    }

    public double getKmPais() {
        return kmPais;
    }

    public void setKmPais(double kmPais) {
        this.kmPais = kmPais;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double densidadePop() {
        return populacao / kmPais;
    }
}
