public abstract class ItemBibliotecaDigital {
    String titulo;
    String autor;

    public ItemBibliotecaDigital(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract String descricao();
}
