/* Exercício 01 – Tabuada
* Aluno: Bárbara Geovanna Alves Cavalcante – Matricula: 20220055021
* Aluno: Samuel da Silva Ferreira – Matricula: 20220054946
*/

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        int operacao, num1;
        Scanner sc;

        sc = new Scanner (System.in);

        System.out.println("Escolha uma operação para a tabuada: ");
        System.out.println("1. Soma;");
        System.out.println("2. Subtração;");
        System.out.println("3. Multiplicação;");
        System.out.println("4. Divisão.");
        System.out.println("Resposta: ");
        operacao = sc.nextInt();

        System.out.println("============================================================================");
        System.out.printf("%nQual o valor deseja calcular?%n");
        num1 = sc.nextInt();

        switch(operacao){
            case 1: soma(num1); break;
            case 2: subtracao(num1); break;
            case 3: multiplicacao(num1); break;
            case 4: divisao(num1); break;
            default: System.out.println("Operação inválida!"); break;
        }

        sc.close();

    }
    
    public static void soma (int a){
        System.out.printf("%n%nTabuada da soma do %d%n", a);
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d + %d = %d%n", i, a, i+a);
        }
    }

    public static void subtracao (int a){
        System.out.printf("%n%nTabuada da subtração do %d%n", a);
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d - %d = %.0f%n", i, a, (float) i-a);
        }
    }

    public static void multiplicacao (int a){
        System.out.printf("%n%nTabuada da multiplicação do %d%n", a);
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d%n", i, a, i*a);
        }
    }

    public static void divisao (int a){
        System.out.printf("%n%nTabuada da divisão do %d%n", a);
        for (int i = 1; i <= 10; i++){
            if(a != 0){
                System.out.printf("%d / %d = %.2f%n", i, a, (float) i/a);
            } else {
                System.out.println("Impossível realizar operação.");
            }
            
        }
    }
}
