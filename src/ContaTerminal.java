import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número da conta:");
        Integer numero = scan.nextInt();
        System.out.println("Digite a agência:");
        String agencia = scan.next();
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scan.next();
        System.out.println("Digite o saldo:");
        Double saldo = scan.nextDouble();
        
        
        ContaBanco conta = new ContaBanco(numero, agencia, nomeCliente, saldo);

        System.out.println("--------------------''--------------------");
        System.out.println("Conta criada com sucesso!");
        System.out.println("--------------------''--------------------");
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Nome do cliente: " + conta.getNomeCliente());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("--------------------''--------------------");

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + "e seu saldo " + conta.getSaldo() + "já está disponível para saque!"

        );

        scan.close();
    }
}
