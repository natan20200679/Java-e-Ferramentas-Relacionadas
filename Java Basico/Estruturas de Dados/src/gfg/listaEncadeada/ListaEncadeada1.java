/*
Dada uma lista encadeada individualmente, encontre o meio da lista encadeada. Por exemplo, se a lista 
encadeada fornecida for 1->2->3->4->5, a saída deve ser 3. Se houver nós pares, haverá dois nós do meio, 
precisamos imprimir o segundo meio elemento. Por exemplo, se a lista encadeada fornecida for 
1->2->3->4->5->6, a saída deve ser 4. 
*/

package gfg.listaEncadeada;

import java.util.ArrayList;

class No {

    int dado;
    No proximo;

}

class OperacaoNo {

    public void empurraNo(No[] topoRef, int dadoVal) {

        No novoNo = new No();
        novoNo.dado = dadoVal;
        novoNo.proximo = topoRef[0];
        topoRef[0] = novoNo;

    }
    
}

public class ListaEncadeada1 {

    public static void main(String[] args) {

        System.out.println("\nLista Encadeada(lincada) = [1->2->3->4->5]");

        No[] topo = new No[1];
        OperacaoNo temp = new OperacaoNo();

        for (int i = 5; i > 0; i--) {

            temp.empurraNo(topo, i);

        }

        ArrayList<Integer> v = new ArrayList<Integer>();

        No atual = topo[0];

        while (atual != null) {

            v.add(atual.dado);

            atual = atual.proximo;
        
        }
        
        System.out.println("Valor do meio da lista encadeada: " + v.get(v.size() / 2) + "\n");
    
    }

}