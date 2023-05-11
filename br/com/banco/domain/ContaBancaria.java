package br.com.banco.domain;

public class ContaBancaria {
    private String cliente;
    private int numeroConta;
    private float saldo;

    //construtor e execussão
    public ContaBancaria(String cliente, int numeroConta, float saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;

    }

    //	getters and setters
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    //	methods
    public void sacar(float valor) {
//		condição para saque ser efetuado sem saldo ficar negativo
        System.out.println("Sacando R$: "+ valor);
        if((this.saldo - valor) < 0.0f) {
            System.out.println("Saque Negado!!! Saldo Insuficiente!!! ");
        }else {
            this.saldo -= valor;
        }
    }

    public void depositar(float valor) {
        System.out.println("Deposintando R$: "+ valor);
        this.saldo += valor;

    }
    public void mostraDadosConta() {
        System.out.println("Dados da conta: " + this.cliente + " Numero da conta: " + this.numeroConta +
        " Saldo: R$" + this.saldo);
    }


}
