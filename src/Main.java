public class Main {
    public static void main(String[] args) {

        Ebook ebook = new Ebook("First Ebook","Ana Maria");
        ebook.descricao();
        ebook.baixar();

        VideoDigital videoDigital = new VideoDigital("Primeiro Video","Ana Maria");
        videoDigital.descricao();
        videoDigital.baixar();
        videoDigital.visualizar();
    }
}
