public class Biblioteca {
    private ItemBiblioteca[] biblioteca = new ItemBiblioteca[100];
    private int index = 0;
    private int tipoDeItens = 0;
    private int aux = 0;

    public void adicionar(ItemBiblioteca item) {
        biblioteca[index] = item;
        index++;
        aux++;
    }

    public void listaItens() {
        for(int i = 0; i <= index -1; i++) {
            biblioteca[i].exibirDetalhes();
            System.out.println("-----------------------------------------------");
        }    
    }

    public void buscarItensPorTipo(String tipo) {
        for (ItemBiblioteca biblio : biblioteca) {
            if (biblio != null && biblio.getTipoItem().equals(tipo)) {
                biblio.exibirDetalhes();
            }
        }
    }

    public int contarItensPorTipo(String tipo) {
        if(index == 0) {
            index = aux;
            return tipoDeItens;
        }
        if (biblioteca[index - 1].getTipoItem().equals(tipo)) {
            tipoDeItens++;
        }

        index--;
        return contarItensPorTipo(tipo);
    }
}
