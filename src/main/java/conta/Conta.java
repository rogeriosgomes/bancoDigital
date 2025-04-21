package conta;

import cliente.Cliente;

public abstract class Conta  {

    private static int SEQUENCIAL = 1;
    private static int AGENCIA_PADRAO = 1;

    private int numero ;
    private int agencia;
    private double saldo;
    private Cliente cliente;

    public Conta(  Cliente cliente) {
        this.numero = SEQUENCIAL++;
        this.agencia = AGENCIA_PADRAO;
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        this.saldo += valor;

    }

    public void sacar(double valor) {
        this.saldo -= valor;

    }

    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public void saldo() {
        System.out.println("Saldo: " + this.saldo);
    }

    public void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }




}
