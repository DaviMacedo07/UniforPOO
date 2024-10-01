package AV2.Q3Reta;

public class TesteReta {
    public static void main(String[] args) {
        RetaClass reta1 = new RetaClass(4, 2);
        double x = 3, y = 14;
        System.out.println(" Equação da reta 1: " + reta1.getEquacao());


        if (reta1.perteceReta(x, y)) {
            System.out.println("O ponto (" + x + ", " + y + ") PERTECEM a reta: " + reta1.getEquacao());
        } else {
            System.out.println("O ponto (" + x + ", " + y + ") NÃO PERTECEM a reta: " + reta1.getEquacao());
        }
    }
}
