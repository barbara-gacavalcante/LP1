/* Exercício 07 – Operações Matrizes
* Aluno: Bárbara Geovanna Alves Cavalcante – Matricula: 20220055021
* Aluno: Samuel da Silva Ferreira – Matricula: 20220054946
*/

package Questão_4;

import java.util.Arrays;
import java.util.Scanner;

public class RhEmpresa {

  final static int N = 4;
  public static final RhEmpresa[] rh = new RhEmpresa[N];

  private String name;
  private float salary;

  public static void main(String[] args) throws Exception {
    float[] salaryInfo = new float[2];
    checkEmployees();
    for (int i = 0; i < N; i++) {
      System.out.println("Name: " + rh[i].name + " salary: " + rh[i].salary);
    }
    salaryInfo = computeSalary(rh);
    String[] rich = richEmployees(rh, salaryInfo[0]);
    String[] poor = poorEmployees(rh, salaryInfo[1]);
    System.out.println("*********************************************");
    System.out.println("Maior salário: " + salaryInfo[0] + "; Média salarial: " + salaryInfo[1]);
    System.out.println("*********************************************");
    System.out.println("Funcionários que recebem o maior salário: ");
    for (String e : rich) {
      if (e != null) {
        System.out.println(e);
      }
    }
    System.out.println("*********************************************");
    System.out.println("Funcionários que recebem menos que a média salarial: ");
    for (String e : poor) {
      if (e != null) {
        System.out.println(e);
      }
    }

  }

  public static void checkEmployees() {
    try (Scanner sc = new Scanner(System.in)) {
      String[] arr;
      String a;
      for (int i = 0; i < N; i++) {
        System.out.println("Digite o nome do funcionário e o seu salário na mesma linha:(Ex: <nome> <salario>): ");
        a = sc.nextLine();
        arr = a.split(" ");
        rh[i] = new RhEmpresa(arr[0], Float.parseFloat(arr[1]));
        Arrays.fill(arr, null);
      }
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
  }

  public static float[] computeSalary(RhEmpresa[] rh) {
    float biggest = 0;
    float average = 0;
    float total = 0;
    float[] result = new float[2];
    for (int i = 0; i < N; i++) {
      if (rh[i].salary > biggest) {
        biggest = rh[i].salary;
      }
      total += rh[i].salary;
    }
    average = total / N;
    result[0] = biggest;
    result[1] = average;
    return result;
  }

  public static String[] richEmployees(RhEmpresa[] rh, float bigSalary) {
    String[] employees = new String[N];
    for (int i = 0; i < N; i++) {
      if (rh[i].salary > bigSalary) {
        employees[i] = rh[i].name;
      }
    }
    return employees;
  }

  public static String[] poorEmployees(RhEmpresa[] rh, float average) {
    String[] employees = new String[N];
    for (int i = 0; i < N; i++) {
      if (rh[i].salary < average) {
        employees[i] = rh[i].name;
      }
    }
    return employees;
  }

  public RhEmpresa(String name, float salary) {
    this.name = name;
    this.salary = salary;
  }
}
