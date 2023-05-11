package br.com.banco.domain;

public class ContaEspecial extends ContaBancaria {
    private float limiteEspecial;
    private int diasDeUso;

    //construtor
    public ContaEspecial(String cliente, int numeroConta, float saldo) {
        super(cliente, numeroConta, saldo);
    }
    //	getters and setters
    public float getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(float limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public int getDiasDeUso() {
        return diasDeUso;
    }

    public void setDiasDeUso(int diasDeUso) {
        this.diasDeUso = diasDeUso;
    }

    //	methods
    public void limiteDaConta(float valor) {
        limiteEspecial = 1500;

    }
    @Override
    public void sacar(float valor) {
        System.out.println("Sacando R$: " + valor);
        if(((this.getSaldo() - valor) >= -1500) && ((this.getSaldo() - valor) < 0.0f)) {
            System.out.println("Você Utilizou Cheque Especial e tem 10 dias para cubrir o saldo devedor, seu saldo " +
            "atual é R$: " + (this.getSaldo() - valor));
        }else if((this.getSaldo() - valor) < -1500){
            System.out.println("Saque não pemitido!, O valor solicitado ultrapassa o seu Limite Epecial!");
            this.setSaldo(this.getSaldo());
        }
    }

    public void calcularJuros() {
        float taxaDeJuros = 0;
        if(this.diasDeUso <= 10){
            taxaDeJuros = 0;
        }else {
            taxaDeJuros = 0.5f;
        }

    }

}