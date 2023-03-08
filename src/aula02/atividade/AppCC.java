public class AppCC {

    public static void main(String[] args) {

ContaCorrente conta = new ContaCorrente();
conta.setNome("Maria Gabriela");
conta.depositar(100.0);
conta.sacar(50.0);
System.out.println("Titular da conta: " + conta.getNome());
System.out.println("Saldo da conta: " + conta.getSaldo());

}
