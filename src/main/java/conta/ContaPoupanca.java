package conta;

import cliente.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca( Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInfosComuns() {
        System.out.println("Dados das Conta Poupança");
        super.imprimirInfosComuns();
    }
}
