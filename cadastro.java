import java.util.Scanner;

public class cadastro {
    private static String nome;
    private int idade;
    private String curso;

    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Remover Aluno");
            System.out.println("3 - Editar informações");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int funcao = sa.nextInt();
            sa.nextLine();

            switch (funcao) {
                case 1:
                    System.out.println("\nCadastro de Aluno:");
                    System.out.print("Digite seu nome: ");
                    nome = sa.nextLine().toUpperCase();
                    System.out.print("Digite sua idade: ");
                    int idade = sa.nextInt();
                    sa.nextLine(); // Limpa o buffer do scanner
                    System.out.print("Digite seu Curso: ");
                    String curso = sa.nextLine();

                    System.out.println("Usuário cadastrado! Prazer, " + nome);
                    break;

                case 2:
                    System.out.println("\nRemoção de Aluno:");
                    System.out.print("Digite o nome da pessoa que você deseja remover: ");
                    String nomeRemover = sa.nextLine().toUpperCase();

                    if (nomeRemover.equals(nome)) {
                        nome = null;
                        System.out.println("Usuário removido com sucesso!");
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("\nEdição de Informações:");
                    if (nome != null) {
                        System.out.println("Nome atual: " + nome);
                        System.out.print("Digite o novo nome: ");
                        nome = sa.nextLine().toUpperCase();
                        System.out.println("Nome atualizado com sucesso!");
                    } else {
                        System.out.println("Nenhum usuário cadastrado para editar.");
                    }
                    break;

                case 4:
                    System.out.println("\nEncerrando o programa.");
                    executando = false;
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        }

        sa.close();
    }
}

