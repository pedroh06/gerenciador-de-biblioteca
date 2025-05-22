import java.util.Scanner;

public class App {
    private static Biblioteca biblioteca = new Biblioteca();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        while (true) {
            System.out.println("\n___Gerenciador de Biblioteca___");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Adicionar revista");
            System.out.println("3. Listar todos os itens");
            System.out.println("4. Apagar item");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    adicionarRevista();
                    break;
                case 3:
                    listarItens();
                    break;
                case 4:
                    apagarItem();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            if (opcao == 0) {
                break;
            }
        }
        scanner.close();
    }

    private static void adicionarLivro() {
        System.out.println("\n___Adicionar Novo Livro___");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Ano de Publicação: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Gênero: ");
        String genero = scanner.nextLine();

        Livro livro = new Livro(titulo, ano, "Livro", autor, genero);
        biblioteca.adicionar(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    private static void adicionarRevista() {
        System.out.println("\n___Adicionar Nova Revista___");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Ano de Publicação: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Edição: ");
        int edicao = scanner.nextInt();
        System.out.print("Peridiocidade (1=mensal, 2=bimestral, 3=trimestral, 6=semestral, 12=anual): ");
        int peridiocidade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Revista revista = new Revista(titulo, ano, "Revista", edicao, peridiocidade);
        biblioteca.adicionar(revista);
        System.out.println("Revista adicionada com sucesso!");
    }

    private static void listarItens() {
        System.out.println("\n___Lista de Itens___");
        biblioteca.listaItens();
    }

    private static void apagarItem() {
        System.out.println("\n___Apagar Item___");
        System.out.println("Itens disponíveis:");
        biblioteca.listaItens();
        
        System.out.print("\nDigite o título do item que deseja apagar: ");
        String titulo = scanner.nextLine();
        
        if (biblioteca.removerItem(titulo)) {
            System.out.println("Item apagado com sucesso!");
        } else {
            System.out.println("Item não encontrado.");
        }
    }
}
