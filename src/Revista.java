public class Revista extends ItemBiblioteca {
    private int edicao;
    private int peridiocidade; // refere-se a constância de publicação (1=mensal, 2=bimestral, 3=trimestral, 6=semestral, 12=anual)

    public Revista(String titulo, int anoPublicacao, String tipoItem, int edicao, int peridiocidade) {
        super(titulo, anoPublicacao, tipoItem);
        this.edicao = edicao;
        this.peridiocidade = peridiocidade;     
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getPeridiocidade() {
        return peridiocidade;
    }

    public void setPeridiocidade(int peridiocidade) {
        this.peridiocidade = peridiocidade;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano da Publicação: " + getAnoPublicacao());
        System.out.println("Tipo do Item: " + getTipoItem());
        System.out.println("Edição: " + getEdicao());
        System.out.println("Peridiocidade: " + getPeridiocidade());
    }
}
