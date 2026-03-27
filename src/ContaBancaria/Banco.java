package ContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
