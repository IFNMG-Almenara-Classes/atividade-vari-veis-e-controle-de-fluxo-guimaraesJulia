package questao05;
import java.util.Scanner;

public class Principal{
    public static void main(String[]grs){
        String senhaCorreta ="1234";
        String senhaInserida;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        senhaInserida = entrada.nextLine();

        if(senhaInserida.equals(senhaCorreta)){
            System.out.println("Senha valida!");
        }else{
            System.out.println("Senha invalida!");
        }
    }
}