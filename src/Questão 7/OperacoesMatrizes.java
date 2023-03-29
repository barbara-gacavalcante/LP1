/* Exercício 07 – Operações Matrizes
* Aluno: Bárbara Geovanna Alves Cavalcante – Matricula: 20220055021
* Aluno: Samuel da Silva Ferreira – Matricula: 20220054946
*/

import java.util.Scanner; 

public class OperacoesMatrizes {
    final static int i = 4;
    final static int j = 4;
    public static void main (String[] args) throws Exception {
        
        int[][] matriz = new int[i][j];
        
        fillMatriz(matriz);

        showMatriz(matriz);
        
        averageMatriz(matriz);

        sumMatriz(matriz);

        averageDiagonal(matriz);

        smallestElement(matriz);

        totalSum(matriz);

    }

    public static void fillMatriz (int[][] matriz){
        
        Scanner sc = new Scanner(System.in);

        for (int c = 0; c < i; c++){
            for(int k = 0; k < j; k++){
                System.out.printf("Informe o elemento da linha: %d e coluna: %d%n", c+1, k+1);
                matriz[c][k] = sc.nextInt();
            }
        }

        sc.close();
    }

    public static void showMatriz (int[][] matriz){
        
        System.out.print("{");
        for(int c = 0; c < i; c++){
            if (c != 0)
                System.out.print(" ");
            for(int k = 0; k < j; k++){
                System.out.print(matriz[c][k] + " ");
            }
            if (c != i-1)
                System.out.print("\n");
        }
        System.out.print("}");
    }

    public static void averageMatriz(int[][] matriz) {
        int sum = 0;
        int k= 0;
        final int n = 4;
        for( int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if ( i == 0 && j > 0) {
                    k++;
                    sum += matriz[j][i];
                }
                if ( i == 1 && j > 1) {
                    k++;
                    sum += matriz[j][i];
                }
                if ( i == 2 && j > 2) {
                    k++;
                    sum += matriz[j][i];
                }
            }
        }
        float average = (float) sum / k;
        System.out.println("\n\na) A média aritmética dos elementos abaixo da diagonal principal resulta em: " + average);
    }

    public static void sumMatriz (int[][] matriz){
        int sum = 0;
        final int n = 4;
        for( int c = 0; c < n; c++) {
            for (int k = 1; k < n; k++) {
                if ( c == 0 && k > 0) {
                    sum += matriz[c][k];
                }
                if ( c == 1 && k > 1) {
                    sum += matriz[c][k];
                }
                if ( c == 2 && k > 2) {
                    sum += matriz[c][k];
                }
            }
        }

        System.out.println("\nb) A soma dos elementos acima da diagonal principal resulta em: " + sum);
    }

    public static void averageDiagonal (int[][] matriz) {
        int sum = 0;
        int count = 0;
        float med;

        for(int c = 0; c < i; c++){
            for(int k = 0; k < j; k++){
                if(c == k){
                    sum += matriz[c][k];
                    count++;
                }
            }
        }

        med = (float) sum/count;

        System.out.println("\nc) A média aritmética dos elementos da diagonal principal resulta em: " + med);
    }

    public static void smallestElement(int[][] matriz){
        int smallest = 2147483647, line = 0, column = 0;
        for(int c = 0; c < i; c++){
            for(int k = 0; k < j; k++){
                if(matriz[c][k] < smallest){
                    smallest = matriz[c][k];
                    line = c;
                    column = k;
                }
            }
        }
        System.out.printf("%nd) O menor elemento da matriz é %d, encontrado na linha %d e na coluna %d", smallest, line, column);
    }

    public static void totalSum(int[][] matriz){
        int sum = 0;
        for(int c = 0; c < i; c++){
            for(int k = 0; k < j; k++){
                sum += matriz[c][k];
            }
        }

        System.out.println("\n\ne) A soma de todos os elementos da matriz é: " + sum);
    }
}
