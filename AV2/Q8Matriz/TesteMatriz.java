package AV2.Q8Matriz;

public class TesteMatriz {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(0, 0);
       // Matriz segundaMatriz = new Matriz(0, 0);
        matriz.alimentarMatriz();
     //   segundaMatriz.alimentarMatriz();
        matriz.mostrarMatriz();
     //   segundaMatriz.mostrarMatriz();
     //   Matriz resultadoSoma = matriz.somar(segundaMatriz);
        Matriz transposta = matriz.transpor();


     //   System.out.println("Resultado da soma das duas matrizes");
      //  resultadoSoma.mostrarMatriz();
     //   if (matriz.equalsMatrizes(segundaMatriz)) {
      //      System.out.println("As matrizes são idênticas.");
     //   } else {
    //        System.out.println("As matrizes são diferentes.");
    //    }

        System.out.println("Matriz transposta: ");
        transposta.mostrarMatriz();
    }
}
