package Aluno;

public class Principal{
    public static void main(String[] agrs){
        Livro livro1 = new Livro("O senhor dos Aneis", "");
        livro1.titulo = "O senhor dos Aneis";
        Livro livro2 = new Livro("Jogos Vorazes", "seila");
        livro2.titulo = "Jogos Vorazes";

        livro1.imprimirDetalhes();
        livro2.imprimirDetalhes();
    }
}