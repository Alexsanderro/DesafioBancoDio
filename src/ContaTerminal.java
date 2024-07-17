import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomecliente;
        Double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nomecliente = scanner.nextLine();

        System.out.println("Digite a sua agencia: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o numero de usuario: ");
        numero = scanner.nextInt();

        System.out.println("Digite o seu saldo: ");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Ola " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque.");
    }
}