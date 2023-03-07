import java.util.Scanner;

public class testadorascanner {
    public static void main(String[] args) {
        // Instanciando um objeto do tipo Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo: ");
        String nome = sc.next();
        System.out.println("Seu nome é: "+ nome);
        int idade = sc.nextInt();
        System.out.println("E sua idade é:" + idade);

        // Utilizamos a classe scanner para ler no terminal.
    }
}
