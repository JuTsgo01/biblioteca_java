public class Livro {

    /*Por que 'protected' e não private?
    Porque quero que as classes filhas tenham acesso a esses atributos e se eu mantesse privados, elas não teriam acesso*/
    protected  String titulo;
    protected  String autor;
    protected  int anoPublicacao;
    private boolean emprestado;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo !=null ? titulo : "Desconhecido";
        this.autor = autor !=null ? autor : "Desconhecido";
        this.anoPublicacao = anoPublicacao > 0 ? anoPublicacao : 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    private void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void emprestarLivro(){
        if(!this.isEmprestado()){
            setEmprestado(true);
            System.out.println("\nEmprestando livro: " + this.getTitulo()
            + "\nAutor: " + this.getAutor() 
            + "\nAno de publicação do livro: " + this.getAnoPublicacao() 
            + "\nStatus: " + (this.isEmprestado() ? "Emprestado" : "Disponível"));
        } else{
            System.out.println("Impossível emprestar livro, pois não está disponível");
        }
    }

    public void devolverLivro(){
        if(this.isEmprestado()){
            setEmprestado(false);
            System.out.println("\nDevolvendo livro: " + this.getTitulo()
            + "\nAutor: " + this.getAutor() 
            + "\nAno de publicação do livro: " + this.getAnoPublicacao() 
            + "\nStatus: " + (this.isEmprestado() ? "Emprestado" : "Disponível"));
        } else{
            System.out.println("Informe corretamente o livro que deseja devolver, pois este já se encontra disponível! O que você deseja é pega-lo emprestado?");
        }
    }

    public void exibirInformacoes(){
        System.out.println("\nLivro: " + this.getTitulo() 
        + "\nAutor: " + this.getAutor()
        + "\nAno de publicação do livro: " + this.getAnoPublicacao() 
        + "\nStatus: " + (this.isEmprestado() ? "Emprestado" : "Disponível"));
    }
}


