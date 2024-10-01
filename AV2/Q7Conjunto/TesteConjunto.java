
package AV2.Q7Conjunto;

public class TesteConjunto {
    public static void main(String[] args) {
        Conjunto conjuntoA = new Conjunto();
        conjuntoA.adicionar("A");
        conjuntoA.adicionar("B");
        conjuntoA.adicionar("C");

        Conjunto conjuntoB = new Conjunto();
        conjuntoB.adicionar("B");
        conjuntoB.adicionar("C");
        conjuntoB.adicionar("D");

        System.out.println("Conjunto A:");
        conjuntoA.print();

        System.out.println("Conjunto B:");
        conjuntoB.print();

        Conjunto uniao = conjuntoA.uniao(conjuntoB);
        System.out.println("União A ∪ B:");
        uniao.print();

        Conjunto inter = conjuntoA.inter(conjuntoB);
        System.out.println("Interseção A ∩ B:");
        inter.print();

        Conjunto menos = conjuntoA.menos(conjuntoB);
        System.out.println("Subtração A - B:");
        menos.print();



    }
}