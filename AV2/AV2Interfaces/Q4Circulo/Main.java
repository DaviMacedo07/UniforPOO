package AV2.AV2Interfaces.Q4Circulo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Circulo> circulos = new ArrayList<>();

        circulos.add(new Circulo(2.3));
        circulos.add(new Circulo(2));
        circulos.add(new Circulo(4.5));
        circulos.add(new Circulo(1.2));
        circulos.add(new Circulo(7.3));

        for (Circulo circulo: circulos) {
            System.out.printf("Área %.2f%n ", circulo.AreaCalc());
        }
    }
}
