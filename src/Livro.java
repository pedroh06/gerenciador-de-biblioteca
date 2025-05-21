public class Livro extends ItemBiblioteca {
    private String autor;
    private String genero;

    public Livro(String titulo, int anoPublicacao, String tipoItem, String autor, String genero) {
        super(titulo, anoPublicacao, tipoItem);
        this.autor = autor;
        this.genero = genero;
    }   

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano da Publicação: " + getAnoPublicacao());
        System.out.println("Tipo do Item: " + getTipoItem());
        System.out.println("Autor: " + getAutor());
        System.out.println("Gênero: " + getGenero());
    }
}
