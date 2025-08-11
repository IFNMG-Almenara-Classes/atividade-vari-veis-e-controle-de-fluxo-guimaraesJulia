package Aluno;//aula_07_08

public class Livro{
    String autor;
    String titulo;
    boolean emprestado;
    Livro(String autor, String titulo){
        this.autor = autor;
        this.titulo = titulo;
    }
    void imprimirDetalhes(){
     System.out.println("Digite o autor: "+ this.autor);
     System.out.println("Digite o titulo: "+ this.titulo);
     System.out.println("Digite o emprestado: "+ (this.emprestado ? "Sim": "Não"));
    }
    boolean isEmprestado(){
        return this.emprestado;
    }
    void emprestar(){
        this.emprestado=true;
    }
    void devolver(){
        this.emprestado=false;
    }
    void alterarEstadoEmprestimo(boolean empresstado) {
        this.emprestado = emprestado;
    }
    void alterarEstadoEmprestimo(){
        this.emprestado= !this.emprestado;
    }
}