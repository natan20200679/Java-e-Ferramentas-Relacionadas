/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Crie uma lista de um objeto complexo e execute as operações abaixo:

- Adicione elementos nesta lista (R)
- Ordende implementando a interface java.Util.Comparator no seu objeto complexo (R)
- Ordende implementando um novo objeto com a interface java.Util.Comparable (R)
- Ordene usando uma expressão lambda na chamada de SuaLista.sort() (R)
- Ordene usando referências de métodos e os métodos estáticos de Comparator (R)
- Ordene coleçoes TreeSet e TreeMap (R)
*/

package dio;

import java.util.*;

public class Comparator_Comparable {
    
    public static void main(String[] args) {

        System.out.println("\n-- Ordem Natural (Inserção de Dados) --\n");

        List<Estudante> estudantes = new ArrayList<>();
        
        estudantes.add(new Estudante("Natan", 40));
        estudantes.add(new Estudante("Chico", 25));
        estudantes.add(new Estudante("Klailton", 28));
        System.out.println(estudantes + "\n");

        System.out.println("-- Ordem por Idade (Comparator) --\n");

        estudantes.sort(new Estudante2());
        System.out.println(estudantes + "\n");

        System.out.println("-- Ordem por Idade (Comparator) (Referências de Métodos) --\n");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes + "\n");

        System.out.println("-- Ordem por Idade (Comparator) (Lambda) --\n");
        estudantes.sort((Estudante e1,Estudante e2) -> e1.getIdade() - e2.getIdade());
        System.out.println(estudantes + "\n");

        System.out.println("-- Ordem Natural (Comparable) --\n");
        Collections.sort(estudantes);
        System.out.println(estudantes + "\n");

        System.out.println("-- Ordem Natural (TreeSet) --\n");

        Set<Estudante> estudantes1 = new TreeSet<>(estudantes);

        System.out.println(estudantes1 + "\n");

        System.out.println("-- Ordem Natural (TreeMap) --\n");

        Map<String,Integer> estudantes2 = new TreeMap<>();

        estudantes2.put("Natan",40);
        estudantes2.put("Chico",25);
        estudantes2.put("Klailton",28);
        System.out.println(estudantes2);

    }

    public static class Estudante implements Comparable<Estudante> {

        private final String nome;
        private final Integer idade;
        
        public Estudante(String nome, Integer idade) {

            this.nome = nome;
            this.idade = idade;

        }

        public Integer getIdade() {

            return idade;

        }

        @Override
        public String toString() {

            return "Estudante{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    '}';

        }

        @Override
        public int compareTo(Estudante estudante) {

            return this.getIdade() - estudante.getIdade();

        }
    }

    public static class Estudante2 implements Comparator<Estudante> {

        @Override
        public int compare(Estudante e1, Estudante e2) {

            return Integer.compare(e1.getIdade(),e2.getIdade());

        }

    }

}
