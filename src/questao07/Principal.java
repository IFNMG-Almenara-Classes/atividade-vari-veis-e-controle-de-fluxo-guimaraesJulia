package questao07;
import java.util.Scanner;

public class Principal{
    public static void main(String[]grs){
        int nu1;
        int nu2;
        int nu3;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        nu1 = entrada.nextInt();
        System.out.println("Digite um numero:");
        nu2 = entrada.nextInt();
        System.out.println("Digite um numero:");
        nu3 = entrada.nextInt();

        if(nu1<nu2 && nu1<nu3){
            System.out.println("O numero menor e "+nu1);
        }else if(nu2>nu1 && nu2>nu3){
            System.out.println("O numero menor e "+nu2);
        }else{
            System.out.println("O numero menor e "+nu3);
        }
    }
}