public class Aresta<TIPO> {
    private TIPO nome;
    private int peso;
    private Vertice<TIPO> inicio;
    private Vertice<TIPO> fim;

    public Aresta(TIPO nome, int peso, Vertice<TIPO> inicio, Vertice<TIPO> fim) {
        this.nome = nome;
        this.peso = peso;
        this.inicio = inicio;
        this.fim = fim;
    }

    public TIPO getNome() {
        return nome;
    }

    public void setNome(TIPO nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Vertice<TIPO> getInicio() {
        return inicio;
    }

    public void setInicio(Vertice<TIPO> inicio) {
        this.inicio = inicio;
    }

    public Vertice<TIPO> getFim() {
        return fim;
    }

    public void setFim(Vertice<TIPO> fim) {
        this.fim = fim;
    }
}

