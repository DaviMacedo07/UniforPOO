package AV2.AV2Interfaces.Q8MapaAluno;

import AV2.AV2Interfaces.Q7Alunos.Aluno;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteMapaALuno {
    public static void main(String[] args) {
        Map<Integer, Aluno> mapaAlunos = new HashMap<>();

        mapaAlunos.put(2456, new Aluno(2456,"Bruno", 25,"Engenharia Mecanica"));
        mapaAlunos.put(5864, new Aluno(5864,"Davi", 56,"Ciencia da Computação"));
        mapaAlunos.put(7845, new Aluno(7845,"Amanda", 74,"Medicina"));
        mapaAlunos.put(1412, new Aluno(1412,"Pedro", 45,"Publicidade"));
        mapaAlunos.put(7956, new Aluno(7956,"Maria", 99,"Moda"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a matrícula do aluno: ");
        int matricula = scanner.nextInt();

        Aluno aluno = mapaAlunos.get(matricula);

        if (aluno != null) {
            System.out.println("Dados do aluno:");
            System.out.println(aluno);
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }
}
