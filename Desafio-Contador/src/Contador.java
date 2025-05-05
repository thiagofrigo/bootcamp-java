import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int primeiroNumero = terminal.nextInt();
        System.out.println("Digite o segundo número");
        int segundoNumero = terminal.nextInt();

        try {
            contar(primeiroNumero, segundoNumero);

        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;

        for(int i = 1; i<=contagem; i++){
            System.out.println("Imprimento número " + i);
        }
    }
}
