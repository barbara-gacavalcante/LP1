/* Exercício 08 – Anagrama
* Aluno: Bárbara Geovanna Alves Cavalcante – Matricula: 20220055021
* Aluno: Samuel da Silva Ferreira – Matricula: 20220054946
*/

import java.util.Scanner;
import java.util.Arrays;

public class Anagrama {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String word, word2;
        System.out.println("Informe uma palavra: ");
        word = sc.next();
        System.out.println("Informe a palavra que deseja comparar: ");
        word2 = sc.next();

        if(word.length() == word2.length())
            compare(word, word2);
        else   
        System.out.printf("%n%n%n%s não é anagrama de %s", word2, word);

        sc.close();
    }

    public static void compare(String w1, String w2){

        char[] w1Array = w1.toCharArray();
        Arrays.sort(w1Array);
        String w1Sorted = new String(w1Array);

        char[] w2Array = w2.toCharArray();
        Arrays.sort(w2Array);
        String w2Sorted = new String(w2Array);

        if(w1Sorted.equals(w2Sorted))
            System.out.printf("%n%n%n%s é anagrama de %s", w2, w1);
        else
            System.out.printf("%n%n%n%s não é anagrama de %s", w2, w1);
    }

}