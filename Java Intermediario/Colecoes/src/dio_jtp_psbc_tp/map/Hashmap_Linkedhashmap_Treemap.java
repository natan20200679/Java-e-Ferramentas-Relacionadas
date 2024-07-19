/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Dadas as seguintes informações  de id e contato, crie um dicionário e ordene este dicionário exibindo
(Nome id - Nome contato):

id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
 */

package dio_jtp_psbc_tp.map;

import java.util.*;
import java.util.function.Function;
import java.util.Objects;

class Contato {

    private String nome;
    private Integer numero;

    public Contato(String nome, Integer numero) {

        this.nome = nome;
        this.numero = numero;

    }

    public String getNome() {

        return nome;

    }

    public Integer getNumero() {

        return numero;

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Contato contato = (Contato) o;

        return nome.equals(contato.nome) && numero.equals(contato.numero);

    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, numero);

    }

    @Override
    public String toString() {

        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                '}';

    }

}

public class Hashmap_Linkedhashmap_Treemap {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {
                {
                    put(1, new Contato("Simba", 5555));
                    put(4, new Contato("Cami", 1111));
                    put(3, new Contato("Jon", 2222));
                }
        };
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("----------------------");

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {
                {
                    put(1, new Contato("Simba", 5555));
                    put(4, new Contato("Cami", 1111));
                    put(3, new Contato("Jon", 2222));
                }
        };
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry : agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("----------------------");

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("----------------------");

        System.out.println("--\tOrdem número telefone\t--");
        // Implementação com Classe Anônima, Interface Function e Função Lambda
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry
                    .getValue().getNome());
        }

        // Outro Método
        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
                    }
        });
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set2) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " +
                    entry.getValue().getNome());
        }

        // Implementação com Classe Anônima e Interface Function
        Set<Map.Entry<Integer, Contato>> set3 = new TreeSet<>
                (Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set3) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " +
                    entry.getValue().getNome());
        }

        System.out.println("----------------------");

        System.out.println("--\tOrdem nome contato\t--");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorOrdemNomeContato());
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

    }

}

class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {

        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());

    }

}

class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {

        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());

    }

}