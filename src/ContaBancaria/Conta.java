package ContaBancaria;

public class Conta implements IConta{

    private static int SEQUENCIAL = 1;
    private static int AGENCIA_PADRAO = 001;

    protected int agencia;
    protected int numero;
    protected Clientes nome;
    protected double saldo;



    public Conta(Clientes nome) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.nome = nome;
    }

    @Override
    public void transferir(double valor, Conta contadestino) {
        if (saldo > valor) {
            contadestino.saldo += valor;
            saldo -= valor;
        } else {
            System.out.printf("Saldo insuficiente para transferencia, seu saldo atual é: R$%.2f\n", saldo);
        }
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saldo atual após o saque: R$%.2f\n", saldo);
        } else {
            System.out.printf("Saldo insuficiente, seu saldo atual é: R$%.2f\n", saldo);
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Saldo atual após o depósito: R$%.2f\n", saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "Tipo=" + this.getClass().getSimpleName() +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", nome=" + nome +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("Titular: %s\n", this.nome.getNome());
        System.out.printf("Agência: %d\n", this.agencia);
        System.out.printf("Número: %d\n", this.numero);
        System.out.printf("Saldo: R$%.2f\n", this.saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }



}
