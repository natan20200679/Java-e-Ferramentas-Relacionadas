/*
 * Método que consiste na inicialização do elemento médio como sendo o elemento topo e na inicialização de 
 * um contador em 0.
 */

package gfg.listaEncadeada;

public class ListaEncadeada1_3 {

    public static void main(String[] args) {

        ListaEncadeada1_3 lista = new ListaEncadeada1_3();

        for (int i = 5; i > 0; i--) {

            lista.push(topo, i);
            lista.printList(topo);
            lista.imprimeMeio(topo);

        }
    }

    static No topo;

    class No {

        int dado;
        No proximo;

        /* Construtor */
        public No(No proximo, int dado) {

            this.dado = dado;
            this.proximo = proximo;

        }
    }

    /*  Função para acessar o meio da lista encadeada */
    void imprimeMeio(No topo) {

        int cont = 0;
        No meio = topo;

        while (topo != null) {

            /* Atualiza o meio, quando 'cont' é número ímpar */
            if ((cont % 2) == 1) {

                meio = meio.proximo;

            }

            ++cont;
            topo = topo.proximo;

        }
        
        /* Se a lista vazia é fornecida */
        if (meio != null) {

            System.out.println("The meiodle element is [" + meio.dado + "]\n");

        }
    }

    void push(No topo_ref, int new_dado) {

        /* Nó alocado */
        No novoNo = new No(topo_ref, new_dado);

        /* Move o topo para o ponto do novo nó */
        topo = novoNo;

    }

    /* Uma função útil para imprimir a lista encadeada fornecida */
    void printList(No topo) {

        while (topo != null) {

            System.out.print(topo.dado + "-> ");

            topo = topo.proximo;
        }

        System.out.println("null");
    
    }

}
