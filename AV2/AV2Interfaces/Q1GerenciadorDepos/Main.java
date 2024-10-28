package AV2.AV2Interfaces.Q1GerenciadorDepos;

public class Main {
    public static void main(String[] args) {
        GerenciadorImpostoDeRenda gerenciador = new GerenciadorImpostoDeRenda("Davi Macêdo");

        Imovel hotelCopacabana = new Imovel(1500000);
        Investimento bolsaVal = new Investimento(2000);

        gerenciador.adicionar(hotelCopacabana);
        gerenciador.adicionar(bolsaVal);

        System.out.println("Total de impostos do Sr(a). " + gerenciador.getNamePerson() + ": " + gerenciador.getTotalImposto() + "R$");
    }

}
