public class Ebook extends ItemBibliotecaDigital implements Baixavel {

    @Override
    public String descricao() {
        return "Este é o primeiro ebook da plataforma.";
    }

    @Override
    public void baixar() {
        System.out.println("Baixando ebook");
    }
}
