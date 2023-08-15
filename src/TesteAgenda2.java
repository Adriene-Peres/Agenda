import java.util.Scanner;

public class TesteAgenda2 {
    private static Scanner ent = new Scanner(System.in);
    private static Agenda a = new Agenda();

    public static void main(String[] args) {
        System.out.println("Olá! Bem Vindo!\nEscolha uma das opções abaixo.");
        int opcao;

        do {
            opcao = exibirMenu();

            if (opcao == 1) {
                System.out.println("----------------------------------------------------------");
                System.out.println("\nAdicionar contato");
                System.out.println();

                adicionarContato();

            } else if (opcao == 2) {
                System.out.println("----------------------------------------------------------");
                System.out.println("\nRemover contato");
                System.out.println();

                removerContato();

            } else if (opcao == 3) {
                System.out.println("----------------------------------------------------------");
                System.out.println("\nVisualizar contatos");
                System.out.println();

                a.visualizarContatos();
            } else {
                System.out.println("Digite uma opção valida!");
            }
        } while (opcao != 4);
    }

    // método para criar um menu de opções
    private static int exibirMenu() {
        System.out.println("\n");
        System.out.println("1 - Adicionar Contato");
        System.out.println("2 - Remover Contato");
        System.out.println("3 - Vizualizar Contatos");
        System.out.println("4 - Sair\n");

        System.out.println("\nDigite a opção desejada: ");

        // Objeto da classe Scanner para pedir a entrada do usuário
        Scanner entrada = new Scanner(System.in);
        // Pede entrada pro usuário
        int opcao = entrada.nextInt();
        // Retorna a entrada
        return opcao;
    }

    // metodo para saber o tipo de pessoa que se esta adicionando o contato
    private static int definirTipoDePessoa() {
        System.out.println("Digite 1 para Pessoa Física: ");
        System.out.println("Digite 2 para Pessoa Juridica: ");
        Scanner s = new Scanner(System.in);
        int aux = s.nextInt();

        if (aux == 1) {
            return 1;
        } else if (aux == 2) {
            return 2;
        } else {
            return 0;
        }
    }

    private static void adicionarContato() {
        int contador = definirTipoDePessoa();
        if (contador == 1) {
            a.addContato(new PessoaFisica(lerNome(), lerEndereco(), lerEmail(), lerCpf(), lerEstadoCivil()));
            System.out.println("Contato adicionado com sucesso.");

        } else if (contador == 2) {
            a.addContato(new PessoaJuridica(lerNome(), lerEndereco(), lerEmail(), lerCnpj(), lerIscricaoEstadual()));
            System.out.println("\nContato adicionado com sucesso.");

        } else {
            System.out.println("Opção inválida");
        }
    }

    public static void removerContato() {
        int contador = definirTipoDePessoa();
        if (contador == 1) {
            a.removerContato(lerCpf());
            System.out.println("\nContato removido com sucesso.");

        } else if (contador == 2) {
            a.removerContato(lerCnpj());
            System.out.println("\nContato removido com sucesso.");

        } else {
            System.out.println("Opção inválida");
        }
    }

    public static String lerNome() {
        // nome do contato
        System.out.print("Insira o nome do contato: ");
        return ent.nextLine();
    }

    public static String lerEndereco() {
        // endereço do contato
        System.out.print("Insira o endereco do contato: ");
        return ent.nextLine();
    }

    public static String lerEmail() {
        // email do contato
        System.out.print("Insira o email do contato: ");
        return ent.nextLine();
    }

    public static String lerCpf() {
        // cpf do contato
        System.out.print("Insira o cpf do contato: ");
        return ent.nextLine();
    }

    public static String lerCnpj() {
        // cnpj do contato
        System.out.print("Insira o cnpj do contato: ");
        return ent.nextLine();
    }

    public static String lerEstadoCivil() {
        // estado civil do contato
        System.out.print("Insira o estado civil do contato: ");
        return ent.nextLine();
    }

    public static int lerIscricaoEstadual() {
        // inscricao estatual do contato
        System.out.print("Insira a inscrição estadual do contato: ");
        return ent.nextInt();
    }

}