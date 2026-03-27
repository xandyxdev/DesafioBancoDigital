package ContaBancaria;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Clientes nome) {
        super(nome);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n\n ***** Extrato Conta Poupança *****");
        super.imprimirExtrato();
    }
}
