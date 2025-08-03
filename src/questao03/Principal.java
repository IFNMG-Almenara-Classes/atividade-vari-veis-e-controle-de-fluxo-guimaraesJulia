package questao03;
import java.util.Scanner;

    public class Principal {
        public static void main(String[] args) {
            double peso;
            double altura;
            double imc;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite seu peso:");
            peso = entrada.nextDouble();

            System.out.println("Digite sua altura: ");
            altura = entrada.nextDouble();

            imc = peso / (altura * altura);
            if(imc >= 18.5) {
                System.out.println("Seu IMC e igual a" + imc +"e você esta saúdavel!");
            }else{
                System.out.println("Seu IMC e igual a"+ imc +" e você não esta saúdavel");
            }
        }
    }
