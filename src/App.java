public class App {
    public static void main(String[] args) {
        Livro l1 = new Livro("Harry Potter e o Prisioneiro de Azkaban", 1999, "Livro", "J. K. Rowling", "Fantasia");
        Revista r1 = new Revista("Revista Recreio", 13, "Revista", 703, 6);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionar(l1);
        biblioteca.adicionar(r1);

        System.out.println("Itens cadastrados na biblioteca:");
        biblioteca.listaItens();

        System.out.println("Itens do tipo 'Livro':");
        biblioteca.buscarItensPorTipo("Livro");

        int quantLivros = biblioteca.contarItensPorTipo("Livro");
        System.out.println("Número de Livros cadastrados: " + quantLivros);
    }
}
