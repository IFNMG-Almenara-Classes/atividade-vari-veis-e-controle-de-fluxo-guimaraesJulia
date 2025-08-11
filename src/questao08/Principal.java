package questao08;
import java.util.Scanner;

public class Principal{
    public static void main(String[]grs) {
        int triangulo1,triangulo2,triangulo3;
        int menor, maior;

        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite um valor de um lado do triangulo: ");
        triangulo1=entrada.nextInt();
        System.out.println("Digite um valor de um lado do triangulo: ");
        triangulo2=entrada.nextInt();
        System.out.println("Digite um valor de um lado do triangulo: ");
        triangulo3=entrada.nextInt();

        if (triangulo1>triangulo2 && triangulo1>triangulo3){
            menor=triangulo1;
            maior=triangulo2;
        } else if (triangulo1<triangulo2 && triangulo1<triangulo3) {
            menor=triangulo2;
            maior=triangulo3;
        }else if (triangulo2>triangulo3 && triangulo2>triangulo1){
            menor=triangulo2;
            maior=triangulo3;
        }else{
            maior=triangulo1;
            menor= triangulo3;
        }
    }
}