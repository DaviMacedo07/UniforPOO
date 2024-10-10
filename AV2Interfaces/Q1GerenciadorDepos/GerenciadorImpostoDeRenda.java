package AV2Interfaces.Q1GerenciadorDepos;

public class GerenciadorImpostoDeRenda {
    private double totalImposto;
    private String namePerson;

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public GerenciadorImpostoDeRenda(String namePerson) {
        this.namePerson = namePerson;
    }

    public void adicionar(Tributável tributável) {
    this.totalImposto += tributável.getValorImposto();
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
