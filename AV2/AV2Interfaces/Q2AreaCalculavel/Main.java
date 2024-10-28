package AV2.AV2Interfaces.Q2AreaCalculavel;

public class Main {
    public static void main(String[] args) {
        AreaCalculavel[] proj = new AreaCalculavel[5];

        proj[0] = new Quadrado(2);
        proj[1] = new Retangulo(2, 6);
        proj[2] = new Circulo(5);
        proj[3] = new Quadrado(4);
        proj[4] = new Retangulo(3,9);

        for (AreaCalculavel projs : proj ) {
            System.out.println("Área : " + projs.calcularArea());
        }
//        Circulo circulo1 = new Circulo(3);
//        Quadrado quadrado1 = new Quadrado(4);
//        Retangulo retangulo1 = new Retangulo(2, 6);
//
//        double retangulo1Result = retangulo1.calcularArea();
//        double quadrado1Result = quadrado1.calcularArea();
//        double circulo1Result = circulo1.calcularArea();
//        System.out.println("Área do circulo: " + circulo1Result);
//        System.out.println("Área do retangulo: " + retangulo1Result);
//        System.out.println("Área do quadrado: "+quadrado1Result);
     }
}
