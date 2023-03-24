import java.util.ArrayList;

public class Grafo<TIPO> {
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;

    public Grafo() {
        this.vertices = new ArrayList<Vertice<TIPO>>();
        this.arestas = new ArrayList<Aresta<TIPO>>();
    }

    public void adicionarVertice(TIPO dado) {
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.vertices.add(novoVertice);
    }


    public void RemoverVertice(TIPO dado) {
        for (int i = 0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).getDado().equals(dado)) {
                for (int j = 0; j < this.arestas.size(); j++){
                    if(this.arestas.get(j).getInicio().getDado().equals(dado) || this.arestas.get(j).getFim().getDado().equals(dado)){
                        this.arestas.remove(arestas.get(j));
                    }
                }
                this.vertices.remove(vertices.get(i));
                break;
            }
        }
    }

    public void MostrarVertices(){
        for (int i = 0; i < vertices.size(); i++) {
            System.out.println(vertices.get(i).getDado());
        }
    }
    public void MostrarArestas(){
        for (int i = 0; i < arestas.size(); i++) {
            System.out.println(arestas.get(i).getNome());
        }
    }

    public void adicionarAresta(TIPO nome, int peso, TIPO DadoInicio, TIPO DadoFim) {
        Vertice<TIPO> inicio = this.getVertice(DadoInicio);
        Vertice<TIPO> fim = this.getVertice(DadoFim);
        Aresta<TIPO> aresta = new Aresta<>(nome, peso, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }

    public void RemoverAresta(TIPO Nome) {
        Aresta<TIPO> aresta = null;
        for (int i = 0; i < this.arestas.size(); i++) {
            if (this.arestas.get(i).getNome().equals(Nome)) {
                this.arestas.remove(arestas.get(i));
                break;
            }
        }
    }

    public Vertice<TIPO> getVertice(TIPO dado) {
        Vertice<TIPO> vertice = null;
        for (int i = 0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).getDado().equals(dado)) {
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
}

    public Aresta<TIPO> getAresta(TIPO nome){
        Aresta<TIPO> aresta = null;
        for(int i = 0; i < this.arestas.size(); i++){
            if(this.arestas.get(i).getNome().equals(nome)){
                aresta = this.arestas.get(i);
                break;
            }
        }
        return aresta;
    }

    public void buscaEmLargura(int inicio){
        ArrayList<Vertice<TIPO>> Marcados = new ArrayList <Vertice<TIPO>>();
        ArrayList<Vertice<TIPO>> Fila = new ArrayList <Vertice<TIPO>>();
        Vertice<TIPO> Atual = this.vertices.get(inicio);
        Marcados.add(Atual);
        System.out.println(Atual.getDado());
        Fila.add(Atual);
        while(Fila.size() > 0){
            Vertice<TIPO> visitado = Fila.get(0);
            for(int i=0; i < visitado.getArestasSaida().size(); i++) {
                Vertice<TIPO> proximo = visitado.getArestasSaida().get(i).getFim();
                if(!Marcados.contains(proximo)){
                System.out.println(proximo.getDado());
                Fila.add(proximo);
            }
        }
        Fila.remove(0);
     }
    }

    public void buscaEmProfundidade(int inicio) {
        ArrayList<Vertice<TIPO>> marcados = new ArrayList<Vertice<TIPO>>();
        Vertice<TIPO> atual = this.vertices.get(inicio);
        buscaEmProfundidadeRecursiva(atual, marcados);
    }

    private void buscaEmProfundidadeRecursiva(Vertice<TIPO> atual, ArrayList<Vertice<TIPO>> marcados) {
        marcados.add(atual);
        System.out.println(atual.getDado());
        for (Aresta<TIPO> aresta : atual.getArestasSaida()) {
            Vertice<TIPO> proximo = aresta.getFim();
            if (!marcados.contains(proximo)) {
                buscaEmProfundidadeRecursiva(proximo, marcados);
            }
        }
    }

    public void CriarListaAdjacencia(){
        for (int i = 0; i < vertices.size(); i++) {
            System.out.println(vertices.get(i).getDado());
        }
    }

}
