public class AppCC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do titular da conta: ");
        String titular = scanner.nextLine();
        ContaCorrente conta = new ContaCorrente(titular);

        System.out.print("Informe o valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        System.out.print("Informe o valor a ser sacado: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);
    }
}
