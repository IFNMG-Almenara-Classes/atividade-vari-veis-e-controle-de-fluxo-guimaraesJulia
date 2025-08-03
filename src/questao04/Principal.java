package questao04;
import java.util.Scanner;

public class Principal{
    public static void main(String[]args){
        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        numero = entrada.nextInt();
        if(numero %2 == 0){
            System.out.println("Numero"+ numero+"e par!");
        }else{
            System.out.println("Numero"+ numero +" é impar!");
        }
    }
}