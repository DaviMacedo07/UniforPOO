package AV2.Q4Circulo;

public class TesteCirculo {
    public static void main(String[] args) {
    Circulo circunferencia1 = new Circulo(4, 3);
    double area = circunferencia1.calcularArea();
    System.out.println("A área do circulo de raio 4: " +area);

    System.out.println("Valor após desinflar 2: " + circunferencia1.desinflar(2));
    System.out.println("Valor após inflar 6: " + circunferencia1.inflar(6));

    }
}
