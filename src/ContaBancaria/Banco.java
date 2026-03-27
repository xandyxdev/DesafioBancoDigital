package ContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contaCorrente;
    private List<Conta> contaPoupanca;

    public Banco() {
        this.contaCorrente = new ArrayList<>();
        this.contaPoupanca = new ArrayList<>();
    }

    public void adicionarContaCorrente(Conta conta) {
        contaCorrente.add(conta);
    }

    public void adicionarPoupanca(Conta conta) {
        contaPoupanca.add(conta);
    }

    public List<Conta> getContaCorrente() {
        return contaCorrente;
    }

    public List<Conta> getContaPoupanca() {
        return contaPoupanca;
    }
}
