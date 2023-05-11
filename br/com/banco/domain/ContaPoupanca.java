package br.com.banco.domain;

public class ContaPoupanca extends ContaBancaria {
    private int diaDeRendimento;
    private float novoSaldo;

    //construtor
    public ContaPoupanca(String cliente, int numeroConta, float saldo, int diaDeRendimento) {
        super(cliente, numeroConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    public float getNovoSaldo() {
        return novoSaldo;
    }

    public void setNovoSaldo(float novoSaldo) {
        this.novoSaldo = novoSaldo;
    }

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    //	methods
    public void calcularNovoSaldo() {
        float taxaDeRendimento = 0.5f;
        if(diaDeRendimento > 0) {
            novoSaldo = (this.diaDeRendimento * taxaDeRendimento);
            novoSaldo += getSaldo();
            System.out.println("Calculando Novo Saldo com base nos dias de rendimento:");
            System.out.println("Dados da conta: " + getCliente() + " Numero da conta: " + getNumeroConta() +
            " Novo Saldo: R$" + this.novoSaldo);
        }else{
            getSaldo();
        }
    }

}
