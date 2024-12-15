public class LivroTerror extends Livro{

    public LivroTerror(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Livro do gênero: Terros");
    }




}
