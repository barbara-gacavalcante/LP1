import java.util.Scanner;

public class CensoAltura {

    private final static CensoAltura[] ca = new CensoAltura[5];

    private float altura;
    private String sexo;
    public static void main (String[] args) throws Exception{
        
        final int qntd = 20;
        float altura;
        String sexo;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < qntd; i++) {
            System.out.println("Informe a altura: ");
            altura = sc.nextFloat();
            System.out.println("Informe o sexo: ");
            sexo = sc.next();
            ca[i] = new CensoAltura(altura, sexo);
        }

        HigherLower(ca);
        AverageHeight(ca);
        CounterPercentage(ca);

        sc.close();
    }

    public static void HigherLower (CensoAltura ca[]){
        float menor = 2147483647;
        final int qntd = 20;

        for(int i = 0; i < qntd; i++){
            if(ca[i].altura < menor){
                menor = ca[i].altura;
            }
        }

        System.out.printf("%n%n%na) A menor altura é: %.2f", menor);
    }

    public static void AverageHeight (CensoAltura ca[]){
        final int qntd = 20;
        float somaFem = 0, somaMas = 0, mediaFem, mediaMas;
        int count1 = 0, count2 = 0;
        for(int i = 0; i < qntd; i++){
            if(ca[i].sexo.equalsIgnoreCase("f")){
                somaFem += ca[i].altura;
                count1++;
            } else if(ca[i].sexo.equalsIgnoreCase("m")){
                somaMas += ca[i].altura;
                count2++;
            }
        }

        mediaFem = somaFem/count1;
        mediaMas = somaMas/count2;

        System.out.printf("%n%n%nb) A média da altura das mulheres é: %.2f", mediaFem);
        System.out.printf("%n%n%nc) A média da altura dos homens é: %.2f", mediaMas);

    }
    public static void CounterPercentage(CensoAltura ca[]){
        int count1 = 0, count2 = 0;
        final int qntd = 20;
        float percentFem, percentMas;

        for(int i = 0; i < qntd; i++){
            if(ca[i].sexo.equalsIgnoreCase("f"))
                count1++;
            if(ca[i].sexo.equalsIgnoreCase("m"))
                count2++;
        }

        System.out.printf("%n%n%nd) A quantidade de mulheres é: %d", count1);
        System.out.printf("%n%n%ne) A quantidade de homens é: %d", count2);

        percentFem = (float) (count1 * 100)/qntd;
        percentMas = (float) (count2 * 100)/qntd;

        System.out.printf("%n%n%nf) A porcentagem de mulheres é: %.2f %%", percentFem);
        System.out.printf("%n%n%ng) A porcentagem de homens é: %.2f %%", percentMas);

    }

    public CensoAltura(float altura, String sexo) {
        this.altura = altura;
        this.sexo = sexo;
    }
}
