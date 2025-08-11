package lista01;

public class Principal {
    public static void main(String[] args) {
        // Criando dois alunos para teste
        Construtor aluno1 = new Construtor("Maria Silva", 2023001, 8.5, 7.0, 9.0, 10.0);
        Construtor aluno2 = new Construtor(João Santos", 2023002, 6.0, 8.5, 7.5, 9.0);

        // Exibindo os detalhes dos alunos
        aluno1.imprimirDetalhes();
        aluno2.imprimirDetalhes();

        // Exemplo de uso dos getters
        System.out.println("\nNome do primeiro aluno: " + aluno1.getNome());
        System.out.println("Matrícula do segundo aluno: " + aluno2.getMatricula());
    }
}