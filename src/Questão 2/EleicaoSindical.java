/* Exercício 07 – Operações Matrizes
* Aluno: Bárbara Geovanna Alves Cavalcante – Matricula: 20220055021
* Aluno: Samuel da Silva Ferreira – Matricula: 20220054946
*/

import java.util.Scanner;
import java.io.*;

public class EleicaoSindical {
  public static void main(String[] args) throws Exception {

    int coisa; 
    System.out.println("Hello, World!");
    compute();
  }

  static void compute() {
    try (Scanner sc = new Scanner(System.in)) {
      int votosNulos;
      int votosBrancos;
      int votosVal;
      int total;
      int A;
      int B;
      int C;
      float PV;
      float PN;
      float Pb;
      float PA;
      float PB;
      float PC;
      System.out.println("Digite a quantidade de votos nulos: ");
      votosNulos = sc.nextInt();
      System.out.println("Digite a quantidade de votos brancos: ");
      votosBrancos = sc.nextInt();
      System.out.println("Digite a quantidade de votos do candidato A: ");
      A = sc.nextInt();
      System.out.println("Digite a quantidade de votos do candidato B: ");
      B = sc.nextInt();
      System.out.println("Digite a quantidade de votos do candidato C: ");
      C = sc.nextInt();
      votosVal = A + B + C;
      total = votosVal + votosBrancos + votosNulos;
      System.out.println("Votos válidos: " + votosVal + "; Votos total: " + total + "; VotosA: " + A + "; VotosB: " + B
          + "; VotosC: " + C);
      PV = ((float) votosVal / (float) total) * 100;
      Pb = ((float) votosBrancos / (float) total) * 100;
      PN = ((float) votosNulos / (float) total) * 100;
      PA = ((float) A / (float) total) * 100;
      PB = ((float) B / (float) total) * 100;
      PC = ((float) C / (float) total) * 100;
      System.out.println(PV);
      System.out.printf(
          "Porcentagem Válidos: %.2f%%;\nPorcentagem A: %.2f%%;\nPorcentagem B: %.2f%%;\nPorcentagem C: %.2f%%;\nPorcentagem Nulos: %.2f%%;\nPorcentagem Branco: %.2f%%;\n",
          PV, PA, PB, PC, PN, Pb);
    }
  }
}