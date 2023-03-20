import java.util.ArrayList;
import java.util.Scanner;

// Classe principal que contém o método main do programa
public class CadastroEquipeTI {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ProfissionalTI> equipe = new ArrayList<ProfissionalTI>(); // Cria um ArrayList vazio para armazenar os profissionais
        
        int opcao;
        do {
            // Exibe as opções do menu principal
            System.out.println("=== CADASTRO DE PROFISSIONAIS DE TI ===");
            System.out.println("1 - Cadastrar profissional");
            System.out.println("2 - Exibir lista de profissionais cadastrados");
            System.out.println("3 - Aumentar salário de um profissional");
            System.out.println("4 - Calcular imposto a pagar");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    // Opção 1 - Cadastrar profissional
                    System.out.print("Digite o código identificador: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consome o caractere de nova linha
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o e-mail: ");
                    String email = sc.nextLine();
                    System.out.print("Digite o salário: ");
                    double salario = sc.nextDouble();
                    
                    // Cria um novo profissional e adiciona na lista
                    ProfissionalTI profissional = new ProfissionalTI(id, nome, email, salario);
                    equipe.add(profissional);
                    
                    System.out.println("Profissional cadastrado com sucesso!");
                    break;
                case 2:
                    // Opção 2 - Exibir lista de profissionais cadastrados
                    System.out.println("=== LISTA DE PROFISSIONAIS CADASTRADOS ===");
                    for (ProfissionalTI p : equipe) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    // Opção 3 - Aumentar salário de um profissional
                    System.out.print("Digite o código identificador do profissional: ");
                    int codigo = sc.nextInt();
                    System.out.print("Digite o percentual de aumento de salário: ");
                    double percentual = sc.nextDouble();
                    
                    // Percorre a lista procurando o profissional com o código informado
                    for (ProfissionalTI p : equipe) {
                        if (p.getId() == codigo) {
                            p.aumentarSalario(percentual);
                            System.out.println("Salário do profissional " + p.getNome() + " atualizado com sucesso!");
                            break;
                        }
                    }
                    break;
                case 4:
                    // Opção 4 - Calcular imposto a pagar
                    System.out.print("Digite o código identificador do profissional: ");
                    int codigo2 = sc.nextInt();
                    
                    // Percorre a lista procurando o profissional com o código informado
                    for (ProfissionalTI p : equipe) {
                        if (p.getId() == codigo2) {
                            double imposto = calcularImposto(p.getSalario()); // Calcula o imposto a partir do salário do profissional
                            System.out.printf("O imposto a pagar é de R$ %.2f%n", imposto);
                            break;
                        }
                    }
                    break;
                case 5:
                    // Opção 5 - Sair