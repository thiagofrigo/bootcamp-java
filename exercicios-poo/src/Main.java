import exercicio_1.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        System.out.println("Acesse sua conta");
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite seu CPF");
        String cpf = scanner.nextLine();
        System.out.println("Digite o valor do depósito inical: ");
        double depositoInicial = scanner.nextDouble();
        ContaBancaria cliente = new ContaBancaria(nomeCliente, cpf, depositoInicial);
        System.out.println("Login efetuado");
        System.out.println("==============");
        do {

            System.out.println("Selecione a opção que deseja");
            System.out.println("[1] - Para consultar saldo");
            System.out.println("[2] - Para consultar cheque especial");
            System.out.println("[3] - Para Depositar dinheiro");
            System.out.println("[4] - Para sacar dinheiro");
            System.out.println("[5] - Para verificar a situação do cheque especial");
            System.out.println("[6] - Para sair da sua conta");
            int escolha = scanner.nextInt();

            switch(escolha){
                case 1:
                    System.out.println("Saldo: " + cliente.getSaldo());
                    break;
                case 2:
                    System.out.println("Cheque especial:" + cliente.consultarChequeEspecial());
                    break;
                case 3:
                    System.out.println("Informe o valor a ser depositado ");
                    double deposito = scanner.nextDouble();
                    cliente.depositar(deposito);
                    System.out.println("Deseposito realizado com sucesso");
                    break;
                case 4:
                    System.out.println("Informe o valor a ser sacado");
                    double saque = scanner.nextDouble();
                    boolean saqueCompletado = cliente.sacar(saque);
                    if(saqueCompletado){
                        System.out.println("Saque realizado");
                    }else{
                        System.out.println("O valor informado excede o valor do saldo");
                    }
                    break;
                case 5:
                    System.out.println(cliente.verificarStatusChequeEspecial());
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Logout efetuado com sucesso");
            }

        }while (continuar == true);
    }
}
