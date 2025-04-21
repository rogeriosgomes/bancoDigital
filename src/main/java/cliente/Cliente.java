package cliente;

import conta.Conta;

import java.util.List;


public class Cliente {


    private static int IDCLIENTE = 0;
    private int id = IDCLIENTE++;
    private String nome;
    private String cpf;
    private String email;
    private List<Conta> contas;

    public Cliente( String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", contas=" + contas +
                '}';
    }
}
