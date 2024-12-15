public class LivroFicacaoCientifica extends Livro {

    public LivroFicacaoCientifica(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Livro do gênero: Ficção Científica");
    }

}
