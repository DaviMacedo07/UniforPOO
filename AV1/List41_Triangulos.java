import  java.util.Scanner;

public class List41_Triangulos {
    public boolean VerificaTriangulo(int ladoA, int ladoB, int ladoC) {
        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            System.out.println("Atendem a regra , é um triângulo.");
            return true;
        } else {
            System.out.println("Não atendem a regra , não é um triângulo.");
            return false;
        }
    }

    public void TipoTriangulo(int ladoA, int ladoB, int ladoC) {
        if (ladoA == ladoB && ladoB == ladoC ) {
            System.out.println("O triângulo é do tipo Equilátero! ");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            System.out.println("O triângulo é do tipo Isóceles! ");
        } else {
            System.out.println("O triângulo é do tipo Escaleno! ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado A: ");
        int ladoA = scanner.nextInt();
        System.out.println("Digite o lado B: ");
        int ladoB = scanner.nextInt();
        System.out.println("Digite o lado C: ");
        int ladoC = scanner.nextInt();

        List41_Triangulos triangulos = new List41_Triangulos();
        if (triangulos.VerificaTriangulo(ladoA, ladoB, ladoC)) {
            triangulos.TipoTriangulo(ladoA, ladoB, ladoC);
        }
    }
}
