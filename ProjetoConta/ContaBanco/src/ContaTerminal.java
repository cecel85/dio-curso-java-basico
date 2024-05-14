import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Início da classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Solicitação e obtenção de dados
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        
        System.out.println("Entre com o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Entre com o número da sua conta: ");
        int conta = scanner.nextInt();
        
        System.out.println("Digite seu saldo atual: ");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta número " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
              
        
    }
}