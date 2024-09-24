package AV2.Q6ArvoreGenealogica;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pai = new Pessoa("Neto");
        Pessoa mae = new Pessoa("Altina");
        Pessoa mae2 = new Pessoa("Altina");

        Pessoa filho = new Pessoa("Davi Macedo", mae, pai);
        Pessoa filho2 = new Pessoa("Davi Macedo", mae, null);

        System.out.println("A mae de " + filho.getNamePerson() + " é : " + mae.getNamePerson());
        System.out.println("O pai de " + filho.getNamePerson() + " é : " + pai.getNamePerson());

        System.out.println("Filho é igual a Filho2? " + filho.equals(filho2));
    }
}
