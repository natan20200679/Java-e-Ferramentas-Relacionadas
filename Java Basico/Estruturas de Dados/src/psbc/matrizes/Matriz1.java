package psbc.matrizes;

import javax.swing.JOptionPane;

public class Matriz1 {

    public static void main(String[] args) {

        // Declarando o Array de países
        String[] paises = new String[4];
        
        // Declarando o array de números
        int[] numeros = new int[10];
        
        // Abastecendo o array de países
        for (int i = 0; i < 4; i++) {
        
            paises[i] = JOptionPane.showInputDialog("Informe um país");
        
        }
        
        // Listando o array de países
        for (String listaPaises : paises) {
        
            System.out.println(listaPaises);
        
        }
        
        // Abastecendo o array de números
        for (int i = 0; i < 10; i++) {
        
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        
        }
        
        // Listando o array de números antes do cálculo
        for (int listaNumeros : numeros) {
        
            System.out.println(listaNumeros);
        }
        
        // Listando o array de números depois do cálculo
        int novoValor = 11;
        numeros[8] = novoValor + 4;
        
        for (int listaNumeros : numeros) {
        
            System.out.println(listaNumeros);
        
        }
    
    }

}
