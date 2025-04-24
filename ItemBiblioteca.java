package atividade;

public abstract class ItemBiblioteca {
	 protected String titulo;
	    protected String autor;

	    public ItemBiblioteca(String titulo, String autor) {
	        this.titulo = titulo;
	        this.autor = autor;
	    }

	    public abstract void exibirDetalhes();

}
