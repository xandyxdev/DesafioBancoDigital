package ContaBancaria;

public interface IConta {

    void transferir(double valor , Conta contadestino);

    void sacar (double valor);

    void depositar(double valor);

    void imprimirExtrato();
}
