import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Eduardo Freitas Machado
 *  Esta classe representa uma aplicação de terminal para gerenciar contas bancárias.
 *  Ela lê dados de entrada do usuário e exibe uma mensagem formatada com as informações da conta.
 *  Ela foi feita em razão do Bootcamp da Santander em parceira com a Digital Innovation One (DIO) no desafio 'Simulando uma conta Bancária Através do Terminal/Console'
 */
public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o nome do cliente");
        String nomeCliente = scanner.nextLine();


        System.out.println("Por favor digite o número da Agência");
        String agencia = scanner.nextLine();

        System.out.println("Por favor digite o número da sua conta bancária");
        int numeroContaBancaria = scanner.nextInt();

        System.out.println("Por favor digite o saldo da conta bancária");

        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
                nomeCliente, agencia, numeroContaBancaria, saldo
        );

    }

}
