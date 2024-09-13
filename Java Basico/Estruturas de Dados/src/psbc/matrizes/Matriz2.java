package psbc.matrizes;

import javax.swing.JOptionPane;

public class Matriz2 {

    public static void main(String[] args) {
        
        /* Declarando o array */
        String[] paises = new String[5];

        /* Inicializando o array */
        paises[0] = "Brasil";
        paises[1] = "Alemanha";
        paises[2] = "Itália";
        paises[3] = "Áustria";
        paises[4] = "Polônia";

        for (String lista : paises) {
            
            System.out.println(lista);
        
        }
        
        /* Inserindo dados no array */
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
        
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        
        }
        
        /* Listando os valores do array com um ForEach */
        System.out.println("Após a entrada de dados");
        
        for (int listaNumeros : numeros) {
        
            System.out.print(listaNumeros + " ");
        
        }
        
        /* Calculando os valores para armazenar no array */
        numeros[8] = numeros[7] + 4;
        
        System.out.println("\nApós a alteração do valor na posição 8");
        
        /* Listando os valores do array com um ForEach */
        for (int listaNumeros : numeros) {
        
            System.out.print(listaNumeros + " ");
        
        }
    
    }

}
