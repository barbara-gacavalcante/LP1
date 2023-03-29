/* Exerc�cio 08 � Anagrama
* Aluno: B�rbara Geovanna Alves Cavalcante � Matricula: 20220055021
* Aluno: Samuel da Silva Ferreira � Matricula: 20220054946
*/

package Questão_6;

import java.util.Scanner;

public class Calculadora {

  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    compute(showUI());
  }

  public static int showUI() {
    int option;
    do {
      System.out.println("Digite uma das opções: \n");
      System.out.println(
          "'1' - Dobro     '2' - Triplo      '3' - Metade\n'4' - Quadrado      '5' - Cubo      '6' - Raiz Quadrada\n'7' - Raiz Cúbica     '8' - Módulo      '9' - Inverso\n'0' - Sair do programa\n");
      option = sc.nextInt();
    } while (option == 0 || (option < 0 || option > 9));
    return option;
  }

  public static void compute(int option) {
    float N;
    System.out.println("\nDigite um número para realizar a operação escolhida: ");
    N = sc.nextFloat();
    switch (option) {
      case 1: {
        N = dobro(N);
        break;
      }
      case 2: {
        N = triplo(N);
        break;
      }
      case 3: {
        N = metade(N);
        break;
      }
      case 4: {
        N = quadrado(N);
        break;
      }
      case 5: {
        N = cubo(N);
        break;
      }
      case 6: {
        N = raiz_quadrada(N);
        break;
      }
      case 7: {
        N = raiz_cubica(N);
        break;
      }
      case 8: {
        N = modulo(N);
        break;
      }
      case 9: {
        N = inverso(N);
        break;
      }
      default: {
        System.out.println("Finalizando programa!");
      }
    }
    System.out.println("O resultado é: " + N);
  }

  public static float dobro(float N) {
    return N * 2;
  }

  public static float triplo(float N) {
    return N * 3;
  }

  public static float metade(float N) {
    return N / 2;
  }

  public static float quadrado(float N) {
    return (float) Math.pow(N, 2);
  }

  public static float cubo(float N) {
    return (float) Math.pow(N, 3);
  }

  public static float raiz_quadrada(float N) {
    return (float) Math.sqrt(N);
  }

  public static float raiz_cubica(float N) {
    return (float) Math.cbrt(N);
  }

  public static float modulo(float N) {
    return Math.abs(N);
  }

  public static float inverso(float N) {
    return (float) 1 / N;
  }
}
