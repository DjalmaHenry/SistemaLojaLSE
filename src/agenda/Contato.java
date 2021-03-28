// Classe Cliente
package agenda;

import br.unicap.c3.ed1.listas.LSESemRepetidosOrdenada;

public class Contato implements Comparable<Contato> {

    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato(String nome) {
        this.nome = nome;
    }

    private String getNome() {
        return this.nome;
    }

    private String getTelefone() {
        return this.telefone;
    }

    private void setTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
    }

    private String getEmail() {
        return this.email;
    }

    private void setEmail(String novoEmail) {
        this.email = novoEmail;
    }

    public void atualizaEmail(String email) {
        this.setEmail(email);
    }

    public void atualizaTelefone(String telefone) {
        this.setTelefone(telefone);
    }

    public String toString() {
        return "Nome: " + this.getNome() + " Telefone: " + this.getTelefone()
                + " E-mail: " + this.getEmail();
    }

    public int compareTo(Contato contato) {
        int result;
        result = this.nome.compareTo(contato.nome);
        return result;
    }
}
