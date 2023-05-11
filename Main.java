import br.com.banco.domain.ContaBancaria;
import br.com.banco.domain.ContaEspecial;
import br.com.banco.domain.ContaPoupanca;
public class Main {
    public static void main(String[] args) {
        System.out.println("\n=============================CONTA SIMPLES===========================\n");
        ContaBancaria contaBancaria_01 = new ContaBancaria("José Luiz", 58260, 2500);
        contaBancaria_01.mostraDadosConta();
        contaBancaria_01.depositar(1500);
        contaBancaria_01.mostraDadosConta();
        contaBancaria_01.sacar(4001);
        contaBancaria_01.mostraDadosConta();
        System.out.println("\n=============================CONTA SIMPLES===========================\n");
        contaBancaria_01.mostraDadosConta();
        contaBancaria_01.depositar(3000);
        contaBancaria_01.mostraDadosConta();
        contaBancaria_01.sacar(2500);
        contaBancaria_01.mostraDadosConta();
        System.out.println("\n==========================CONTA PAUPANÇA=============================\n");
        ContaPoupanca contaPoupanca_01 = new ContaPoupanca("José Luiz", 58772, 3000, 30);
        contaPoupanca_01.mostraDadosConta();
        contaPoupanca_01.depositar(1500);
        contaPoupanca_01.mostraDadosConta();
        contaPoupanca_01.sacar(2000);
        contaPoupanca_01.mostraDadosConta();
        contaPoupanca_01.calcularNovoSaldo();
        System.out.println("\n==========================CONTA EPECIAL==============================\n");
//	    =======================================
        ContaEspecial contaEspecial_01 = new ContaEspecial("José Luiz", 70792, 5500);
        contaEspecial_01.mostraDadosConta();
        contaEspecial_01.depositar(1500);
        contaEspecial_01.mostraDadosConta();
        contaEspecial_01.sacar(9000);

        System.out.println("\n==========================CONTA EPECIAL==============================\n");
        ContaEspecial contaEspecial_02 = new ContaEspecial("José Luiz", 78952, 3500);
        contaEspecial_02.mostraDadosConta();
        contaEspecial_02.depositar(1500);
        contaEspecial_02.mostraDadosConta();
        contaEspecial_02.sacar(6000);
        System.out.println("\n======================================================================");

    }
}