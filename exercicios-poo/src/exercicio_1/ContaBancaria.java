package exercicio_1;

public class ContaBancaria {
    private String cliente;
    private String cpf;
    private double saldo;
    private double chequeEspecial;
    private double limite;
    private boolean usarChequeEspecial = false;

    public ContaBancaria(String cliente,String cpf, double deposito ){
        this.cliente = cliente;
        this.cpf = cpf;
        this.saldo = deposito;
        this.chequeEspecial = calculaChequeEspecial(deposito);
        this.limite = saldo + chequeEspecial;
    }

    private double calculaChequeEspecial(double deposito){
        if(deposito <= 500){
            return 50.00;
        }else{
            return deposito * 0.5;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double value, boolean deposito) {
        if (deposito){
            this.saldo += value;
            this.limite += value;
        }else {
            this.saldo -= value;
            this.limite -= value;
        }
        getSaldo();
    }

    public double depositar(double value){
        setSaldo(value, true);
        return getSaldo();
    };

    public boolean sacar(double value){
        if(value <= this.limite){
            setSaldo(value, false);
            return true;
        }else {
            return false;
        }
    }
    public String verificarStatusChequeEspecial(){
        if(this.limite  <=  this.chequeEspecial){
            return "O limiete especial esta sendo utilizado";
        }else {
            return "O limite esperical não esta sendo utiliado";
        }
    }
    public double consultarChequeEspecial(){
        return this.chequeEspecial;
    }
}
