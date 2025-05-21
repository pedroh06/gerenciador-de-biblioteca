public abstract class ItemBiblioteca {
    private String titulo;
    private int anoPublicacao;
    private String tipoItem;

    public ItemBiblioteca(String titulo, int anoPublicacao, String tipoItem) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.tipoItem = tipoItem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public abstract void exibirDetalhes();
}
