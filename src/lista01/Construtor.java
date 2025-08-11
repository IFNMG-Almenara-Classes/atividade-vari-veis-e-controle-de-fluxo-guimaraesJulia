package lista01;

public class Construtor {
    private String nome;
    private int matricula;
    private double nota1, nota2, nota3;
    private double notaTrabalho;

    private static final double PESO_PROVA = 2.0;
    private static final double PESO_TRABALHO = 1.5;

    public Construtor(String nome, int matricula, double nota1, double nota2, double nota3, double notaTrabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notaTrabalho = notaTrabalho;
    }
    public double calcularMedia() {
        double somaNotas = (nota1 * PESO_PROVA) +
                (nota2 * PESO_PROVA) +
                (nota3 * PESO_PROVA) +
                (notaTrabalho * PESO_TRABALHO);

        double somaPesos = (3 * PESO_PROVA) + PESO_TRABALHO;
        return somaNotas / somaPesos;
    }
    public void imprimirDetalhes() {
        System.out.println("Dados do Aluno:");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota Prova 1: " + nota1);
        System.out.println("Nota Prova 2: " + nota2);
        System.out.println("Nota Prova 3: " + nota3);
        System.out.println("Nota Trabalho: " + notaTrabalho);
        System.out.printf("Média Final: %.2f\n", calcularMedia());
    }
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
}