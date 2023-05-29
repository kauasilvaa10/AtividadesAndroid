package devandroid.kauasilva.myapplication.model;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cursodesejado;
    private int telefonecontato;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCursodesejado() {
        return cursodesejado;
    }

    public void setCursodesejado(String cursodesejado) {
        this.cursodesejado = cursodesejado;
    }

    public int getTelefonecontato() {
        return telefonecontato;
    }

    public void setTelefonecontato(int telefonecontato) {
        this.telefonecontato = telefonecontato;
    }
}