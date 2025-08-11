package questao12;//questao11
import java.util.Scanner;

public class Principal{
    public static void main(String[]grs){
        int num;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num=entrada.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println(i++);
        }

    }
}