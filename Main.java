package atividade;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Revista revista1 = new Revista("Ciência Hoje", "SBPC", 202);

        Usuario usuario1 = new Usuario("Ana");

        System.out.println("📚 Itens da Biblioteca:");
        livro1.exibirDetalhes();
        revista1.exibirDetalhes();

        System.out.println("\n▶️ Simulação de empréstimo:");
        usuario1.pegarEmprestado(livro1);
        usuario1.pegarEmprestado(livro1); // Vai dar erro

        System.out.println("\n▶️ Devolução:");
        usuario1.devolverItem(livro1);
    }
}
