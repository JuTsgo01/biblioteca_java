public class LivroMisterioSuspense extends Livro {

    public LivroMisterioSuspense(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Livro do gênero: Mistério e Suspense");
    }

}