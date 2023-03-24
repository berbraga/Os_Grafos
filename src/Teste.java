public class Teste {

    public static void main(String[] args){

        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("V1");
        grafo.adicionarVertice("V2");
        grafo.adicionarVertice("V3");
        grafo.adicionarVertice("V4");
        grafo.adicionarVertice("V5");
        grafo.adicionarVertice("V6");

        grafo.adicionarAresta("A1",2, "V1", "V2");
        grafo.adicionarAresta("A2",1, "V1", "V3");
        grafo.adicionarAresta("A3",2, "V1", "V4");
        grafo.adicionarAresta("A4",4, "V2", "V5");
        grafo.adicionarAresta("A5",2, "V4", "V6");
        grafo.adicionarAresta("A6",6, "V3", "V6");
        grafo.adicionarAresta("A7",2, "V5", "V6");
        grafo.CriarListaAdjacencia();
    }
}