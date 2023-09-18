import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //To-do:Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //exibir as mensagens para o usuario e Obter pelo scanner os valores digitados pelo terminal
        System.out.println("Seja bem vindo ao seu novo Banco!");
        System.out.println("Para começar, precisamos de algumas informações.");
        System.out.println("Numero da conta: (ex: 1021)");
        int numeroDaConta = scanner.nextInt();
        System.out.println("Agencia: (ex: 067-8)");
        String agencia = scanner.next();
        System.out.println("Nome:");
        String nomeDoCliente = scanner.next();
        System.out.println("Saldo: (ex: 250.55)");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem de conta criada

        System.out.println("Olá "+nomeDoCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numeroDaConta +" e seu saldo de "+ saldo +" já está disponível para saque.");
    }
}
