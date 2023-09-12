import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da agência:");
        int numeroAgencia = input.nextInt();
        System.out.println("Por favor, digite o numero da conta:");
        int numeroConta = input.nextInt();
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = input.next();
        System.out.println("Por favor, digite o saldo inicial da conta:");
        double saldoConta = input.nextDouble();
        System.out.println(imprimirmensagem(nomeCliente, numeroAgencia, numeroConta, saldoConta));

    }

    public static String imprimirmensagem(String nomeCliente, int numeroAgencia, int numeroConta, double saldoConta) {
        return "Olá, " + nomeCliente + "obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                + " conta " + numeroConta + " e o seu saldo: " + saldoConta + " já está disponível para saque";
    }
}
