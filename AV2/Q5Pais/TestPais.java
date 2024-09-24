package AV2.Q5Pais;

public class TestPais {
    public static void main(String[] args) {
        Pais Brasil = new Pais("BRA", "Brasil", 8515767.049, 215000000);
        Pais Argentina = new Pais("BRA", "Argentina", 2780400, 40117096);
        Pais BrasilClone = new Pais("BRA", "BrasilClone", 8515767.049, 215000000);

        System.out.println(Brasil.toString());
        System.out.println(Argentina.toString());
        System.out.printf("Densidade populacional: %.2f habitantes por km²%n", Brasil.densidadePop());
        System.out.printf("Densidade populacional: %.2f habitantes por km²%n", Argentina.densidadePop());

        if (Brasil.getCodISO().equals(BrasilClone.getCodISO())) {
            System.out.println(Brasil.getNamePais() + " possui o mesmo ISO de " + BrasilClone.getNamePais());
        } else {
            System.out.println("Ambos tem códigos ISO diferentes , não são iguais");
        }
    }
}
