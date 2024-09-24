package AV2.Q5Pais;

public class TestPais {
    public static void main(String[] args) {
        Pais Brasil = new Pais("BRA", "Brasil", 8515767.049, 215000000);
        Pais Argentina = new Pais("BRA", "Argentina", 2780400, 40117096);
        Pais BrasilClone = new Pais("BRA", "Brasil", 8515767.049, 215000000);

        System.out.println(Brasil.toString());
        System.out.println(Argentina.toString());
        System.out.println("Densidade populacional: " + Brasil.densidadePop());
        System.out.println("Densidade populacional: " + Argentina.densidadePop());

        if (Brasil.getCodISO().equals(Argentina.getCodISO())) {
            System.out.println("O paises são iguais");
        } else {
            System.out.println("não sao iguais");
        }
    }
}
