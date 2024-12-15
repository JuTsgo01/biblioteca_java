public class Main {

    public static void main(String[] args) {

        LivroFicacaoCientifica livro1 = new LivroFicacaoCientifica("Fahrenheit 451", "Ray Bradbury", 1953);
        livro1.exibirInformacoes();
        livro1.emprestarLivro();
        livro1.devolverLivro();

        LivroFantasia livro2 = new LivroFantasia("Shadow and Bone", "Leigh Bardugo", 2012);
        livro2.exibirInformacoes();
        livro2.emprestarLivro();
        livro2.devolverLivro();

        LivroMisterioSuspense livro3 = new LivroMisterioSuspense("A Paciente Silenciosa", "Alex Michaelides", 2019);
        livro3.exibirInformacoes();
        livro3.emprestarLivro();
        livro3.devolverLivro();

        LivroDrama livro4 = new LivroDrama("O Menino do Pijama Listrado", "John Boyne", 2006);
        livro4.exibirInformacoes();
        livro4.emprestarLivro();
        livro4.devolverLivro();

        LivroTerror livro5 = new LivroTerror("O Vilarejo", "Raphael Montes", 2015);
        livro5.exibirInformacoes();
        livro5.emprestarLivro();
        livro5.devolverLivro();
    }

}
