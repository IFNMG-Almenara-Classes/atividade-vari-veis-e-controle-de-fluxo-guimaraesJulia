import java.util.Scanner;

public class questao02{
    public static void main(String[] args) {
        int num1,num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = entrada.nextInt();
        if (num1 < num2) {
            System.out.println("O menor numero e "+num2);
        }else if (num1 > num2){
            System.out.println("O maior numero e "+num1);
        }
    }
}