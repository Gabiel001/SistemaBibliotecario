package atividade;

public class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void pegarEmprestado(Emprestavel item) {
        try {
            item.emprestar();
            System.out.println(nome + " pegou emprestado.");
        } catch (Exception e) {
            System.out.println("Erro ao emprestar: " + e.getMessage());
        }
    }

    public void devolverItem(Emprestavel item) {
        item.devolver();
        System.out.println(nome + " devolveu o item.");
    }
}