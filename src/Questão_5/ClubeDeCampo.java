/* Exercício 07 – Operações Matrizes
* Aluno: Bárbara Geovanna Alves Cavalcante – Matricula: 20220055021
* Aluno: Samuel da Silva Ferreira – Matricula: 20220054946
*/

package Questão_5;

import java.util.Scanner;

public class ClubeDeCampo {

  private int ID;
  private float ALT;

  public static void main(String[] args) throws Exception {
    int N;
    try (Scanner sc = new Scanner(System.in)) {
      do {
        System.out.println("Digite a quantidade de pessoas cadastradas: (1 ... 10)");
        N = sc.nextInt();
      } while (N < 1 || N > 10);

      final ClubeDeCampo[] cc = new ClubeDeCampo[N];

      checkIn(cc, N);
      for (int i = 0; i < cc.length; i++) {
        System.out.println("ID: " + cc[i].ID + " ALT: " + cc[i].ALT);
      }
      compute(cc);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void checkIn(ClubeDeCampo[] cc, int N) {
    String in;
    String[] arr;
    try (Scanner sc = new Scanner(System.in)) {
      for (int i = 0; i < N; i++) {
        System.out.println("Digite a Idade e a Altura" + (i > 1 ? " da próxima pessoa:" : ": ") + "(<idade> <altura>)");
        in = sc.nextLine();
        arr = in.split(" ");
        cc[i] = new ClubeDeCampo(Integer.parseInt(arr[0]), Float.parseFloat(arr[1]));

      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void compute(ClubeDeCampo[] cc) {
    float lessThan10 = 0;
    float lessThan15 = 0;
    float lessThan21 = 0;
    float biggerThan21 = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    for (int i = 0; i < cc.length; i++) {
      if (cc[i].ID < 10) {
        a++;
        lessThan10 += cc[i].ALT;
      } else if (cc[i].ID >= 10 && cc[i].ID <= 15) {
        b++;
        lessThan15 += cc[i].ALT;
      } else if (cc[i].ID >= 15 && cc[i].ID <= 21) {
        c++;
        lessThan21 = cc[i].ALT;
      } else if (cc[i].ID > 21) {
        d++;
        biggerThan21 = cc[i].ALT;
      }
    }
    float average10 = lessThan10 / (float) a;
    float average15 = lessThan15 / (float) b;
    float average21 = lessThan21 / (float) c;
    float averageB21 = biggerThan21 / (float) d;
    System.out.printf("Média < 10: %.2f; Média 10<x<15: %.2f; Média 15<x<21: %.2f; Média 21<x: %.2f", average10,
        average15, average21, averageB21);
  }

  public ClubeDeCampo(int ID, float ALT) {
    this.ID = ID;
    this.ALT = ALT;
  }
}
