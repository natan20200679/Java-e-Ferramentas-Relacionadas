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
 - Ordene coleçoes TreeSet e TreeMap
*/

package dio;

import java.util.*;

public class Comparator_Comparable {
    
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Natan",40));
        estudantes.add(new Estudante("Chico",25));
        estudantes.add(new Estudante("Klailton",28));
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("-- Ordem Natural Idade --\n" + estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("-- Ordem Natural Idade (Referências de Métodos) --\n" 
                + estudantes);
        // System.out.println("-- Ordem Natural dos Estudantes (TreeSet) --\n" + );
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

}
