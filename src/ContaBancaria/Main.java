package ContaBancaria;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Clientes alexandre = new Clientes();
        Clientes davi = new Clientes();
        alexandre.setNome("Alexandre");
        davi.setNome("Davi");

        Conta correnteAlexandre = new ContaCorrente(alexandre);
        Conta correnteDavi= new ContaCorrente(davi);
        Conta poupancaAlexandre = new ContaPoupanca(alexandre);
        Conta poupancaDavi = new ContaPoupanca(davi);

        banco.adicionarConta(correnteAlexandre);
        banco.adicionarConta(correnteDavi);
        banco.adicionarConta(poupancaAlexandre);
        banco.adicionarConta(poupancaDavi);

        correnteAlexandre.depositar(500);
        correnteDavi.depositar(250);
        correnteAlexandre.transferir(300, poupancaAlexandre);
        correnteDavi.transferir(300, poupancaDavi);

        correnteAlexandre.imprimirExtrato();
        poupancaAlexandre.imprimirExtrato();

        System.out.println(banco.getContas());
    }
}

