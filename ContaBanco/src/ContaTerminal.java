import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
              
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        int numero = sc.nextInt();
        
        System.out.print("Digite a Agência: ");
        String agencia = sc.next();

        // Consumir o caractere de quebra de linha pendente
        sc.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Digite o saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo de " + saldo + " R$ já está disponível para saque.");
    }
}
