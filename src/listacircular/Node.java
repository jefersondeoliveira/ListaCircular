package listacircular;

public class Node {

    String info;
    Node proximo;
    Node anterior;

    Node(String dado) {
        this.info = dado;
        this.proximo = null;
        this.anterior = null;
    }

    Node(String dado, Node next, Node ant) {
        this.info = dado;
        this.proximo = next;
        this.anterior = ant;
    }

    public String getDado() {
        return info;
    }

    public void setDado(String dado) {
        info = dado;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node prox) {
        proximo = prox;
    }

    public Node getAnteior() {
        return anterior;
    }

    public void setAnterior(Node ant) {
        anterior = ant;
    }
}
