package ContaBancaria;

public class ContaCorrente extends Conta {


    public ContaCorrente(Clientes nome) {
        super(nome);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n\n ***** Extrato Conta Corrente *****");
        super.imprimirExtrato();
    }
}
