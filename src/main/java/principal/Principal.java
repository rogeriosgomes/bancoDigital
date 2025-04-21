package principal;

import cliente.Cliente;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Principal {

    public static void main(String[] args) {

        Cliente cliente= new Cliente("Eduardo Cavalcanti","121.331.121-99", "eduardo@teste" );

        System.out.println(cliente);

        System.out.println("-------------atualizando dados cadastrais-----------------");

        cliente.setNome("Eduardo da Silva Cavalcanti");
        cliente.setEmail("eduardosilva@teste");

        System.out.println(cliente);

        ContaCorrente contaCorrente = new ContaCorrente(cliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);

        System.out.println("-------------dados Bancarios-----------------");


        System.out.println("-------------Transações-----------------");
        contaCorrente.depositar(1000);
        contaCorrente.sacar(500);
        contaCorrente.transferir(200, contaPoupanca);


        System.out.println("-------------Dados bancarios-----------------");

        contaCorrente.imprimirInfosComuns();
        contaPoupanca.imprimirInfosComuns();

        System.out.println("-------------Relacão de contas do cliente-----------------");

        System.out.println(cliente.getContas());


    }
}
