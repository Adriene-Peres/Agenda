import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Agenda a = new Agenda();

        System.out.println("Olá! Bem Vindo!\nEscolha uma das opções abaixo.");

        int opcao;
        do {
            opcao = exibirMenu();

            if (opcao == 1) {
                System.out.println("----------------------------------------------------------");
                System.out.println("\nAdicionar contato");
                System.out.println();

                // nome do contato
                System.out.print("Insira o nome do contato: ");
                String nome = ent.nextLine();

                // endereço do contato
                System.out.print("Insira o endereco do contato: ");
                String endereco = ent.nextLine();

                // email do contato
                System.out.print("Insira o email do contato: ");
                String email = ent.nextLine();

                int contador = definirTipoDePessoa();

                if (contador == 1) {
                    System.out.print("Insira o cpf do contato: ");
                    String cpf = ent.nextLine();
                    System.out.print("Insira o estado cívil do contato: ");
                    String estado_civil = ent.nextLine();

                    a.addContato(new PessoaFisica(nome, endereco, email, cpf, estado_civil));
                    System.out.println("Contato adicionado com sucesso.");

                } else if (contador == 2) {
                    System.out.print("Insira o cnpj do contato: ");
                    String cnpj = ent.nextLine();
                    System.out.print("Insira a inscrição estatual do contato: ");
                    int inscricao_estadual = ent.nextInt();

                    a.addContato(new PessoaJuridica(nome, endereco, email, cnpj, inscricao_estadual));
                    System.out.println("\nContato adicionado com sucesso.");

                } else {
                    System.out.println("Opção inválida");
                }
            } else if (opcao == 2) {
                System.out.println("----------------------------------------------------------");
                System.out.println("\nRemover contato");
                System.out.println();

                int contador = definirTipoDePessoa();
                if (contador == 1) {
                    System.out.print("\nInsira o cpf do contato: ");
                    String cpf = ent.nextLine();

                    a.removerContato(cpf);
                    System.out.println("\nContato removido com sucesso.");

                } else if (contador == 2) {
                    System.out.print("\nInsira o cnpj do contato: ");
                    String cnpj = ent.nextLine();

                    a.removerContato(cnpj);
                    System.out.println("\nContato removido com sucesso.");

                } else {
                    System.out.println("Opção inválida");
                }

            } else if (opcao == 3) {
                System.out.println("----------------------------------------------------------");
                System.out.println("\nVisualizar contatos");
                System.out.println();

                a.visualizarContatos();
            } else {
                System.out.println("Digite uma opção valida!");
            }
        } while (opcao <= 3);
    }

    // método para criar um menu de opções
    private static int exibirMenu() {
        System.out.println("\n");
        System.out.println("1 - Adicionar Contato");
        System.out.println("2 - Remover Contato");
        System.out.println("3 - Vizualizar Contatos");

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
}