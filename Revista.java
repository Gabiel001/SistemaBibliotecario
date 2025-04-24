package atividade;

public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, String autor, int edicao) {
        super(titulo, autor);
        this.edicao = edicao;
    }

    public void exibirDetalhes() {
        System.out.println("Revista: " + titulo + " | Autor: " + autor + " | Edição: " + edicao);
    }
}
