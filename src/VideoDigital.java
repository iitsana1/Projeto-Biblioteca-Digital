public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {

    @Override
    public String descricao(){
        return "Este é o primeiro video digital da plataforma."
    }

    @Override
    public void baixar(){
        System.out.println("Baixando video digital.");
    }

    @Override
    public void visualizar(){
        System.out.println("Exibindo video digital");
    }
}
