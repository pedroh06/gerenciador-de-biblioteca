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
        for(int i = 0; i < index; i++) {
            biblioteca[i].exibirDetalhes();
            System.out.println("-----------------------------------------------");
        }    
    }

    public boolean removerItem(String titulo) {
        for (int i = 0; i < index; i++) {
            if (biblioteca[i] != null && biblioteca[i].getTitulo().equalsIgnoreCase(titulo)) {
                for (int j = i; j < index - 1; j++) {
                    biblioteca[j] = biblioteca[j + 1];
                }
                biblioteca[index - 1] = null;
                index--;
                aux--;
                return true;
            }
        }
        return false;
    }
}
