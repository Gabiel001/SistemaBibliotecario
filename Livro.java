package atividade;

public class Livro extends ItemBiblioteca implements Emprestavel {
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        super(titulo, autor);
        this.emprestado = false;
    }

    @Override
    public void emprestar() throws Exception {
        if (emprestado) {
            throw new Exception("Este livro já está emprestado.");
        }
        emprestado = true;
        System.out.println("Livro emprestado com sucesso.");
    }

    @Override
    public void devolver() {
        emprestado = false;
        System.out.println("Livro devolvido com sucesso.");
    }

    @Override
    public boolean isEmprestado() {
        return emprestado;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo + " | Autor: " + autor);
    }
}

