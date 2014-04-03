package listacircular;

public class Lista {

    public Node cabeca;
    public Node cauda;

    public Lista() {
        cabeca = cauda = null;
    }

    public void imprime_down() {
        if (isEmpty()) {
            System.out.println("Lista Vazia");
            System.exit(0);
        }

        Node corrente = cabeca;
        int cont = 0;

        while (cont != 1) {
            System.out.print(corrente.info + " , ");
            corrente = corrente.proximo;
            if (corrente == cabeca) {
                cont++;
            }
        }
        System.out.println("");
    }

    public void imprime_up() {
        if (isEmpty()) {
            System.out.println("Lista Vazia");
            System.exit(0);
        }

        Node corrente = cauda;
        int cont = 0;

        while (cont != 1) {
            System.out.print(corrente.info + " , ");
            corrente = corrente.anterior;
            if (corrente == cauda) {
                cont++;
            }
        }
        System.out.println("");
    }

    public void insereInicio(String Item) {
        if (isEmpty()) {
            cabeca = cauda = new Node(Item);
            cabeca.proximo = cauda;
            cauda.anterior = cabeca;
        } else {
            cabeca = cauda.proximo = cabeca.anterior = new Node(Item, cabeca, cauda);
        }
    }

    public boolean isEmpty() {
        return cabeca == null;
    }

    public void removeSorteio(int numero, String inicio) {
        Node corrente;
        corrente = cabeca;
        int cont = 1;

        while (cabeca != cauda) {
            imprime_down();
            System.out.println("Inicio: " + inicio);

            while (corrente.info.equals(inicio)) {
                corrente = corrente.proximo;
            }

            while (cont != numero) {
                corrente = corrente.proximo;
                cont++;
            }
            inicio = corrente.proximo.info;
            System.out.println("Soldado fora: " + corrente.info +"\n");

            if (corrente == cabeca) {
                cabeca = cabeca.proximo;
                cauda.proximo = cabeca;
                cabeca.anterior = cauda;
            } else if (corrente == cauda) {
                cauda.anterior.proximo = cabeca;
                cabeca.anterior = cauda.anterior;
                cauda = cauda.anterior;
            } else {
                corrente.anterior.proximo = corrente.proximo;
                corrente.proximo.anterior = corrente.anterior;
            }
            corrente = cabeca;
            cont = 1;
        }
        System.out.println("Soldado que vai pegar o cavalo: " + cabeca.info);
    }
}
