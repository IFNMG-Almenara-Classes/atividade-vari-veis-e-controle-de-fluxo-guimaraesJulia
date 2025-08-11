package lista02;

class Livro {
    String autor;
    String nome;
    String editora;
    int paginas;
    int ano;
    Livro(String autor, String nome, String editora, int paginas, int ano){
        this.autor = autor;
        this.nome = nome;
        this.editora = editora;
        this.paginas = paginas;
        this.ano = ano;
    }
    void imprimirDetalhes() {
        System.out.println("Digite o autor: " + this.autor);
        System.out.println("Digite o titulo: " + this.nome);
        System.out.println("Digite o editora: " + this.editora);
        System.out.println("Digite o paginas: " + this.paginas);
        System.out.println("Digite o ano: " + this.ano);
    }
}