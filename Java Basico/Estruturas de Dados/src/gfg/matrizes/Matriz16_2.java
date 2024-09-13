/*
Método que consiste na manutenção da ordem de aparecimento dos elementos. Obs.: A matriz usada como exemplo 
nesta solução pelo autor é arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}, além de envolver Orientação à Objetos. 
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz16_2 {

    public static void main(String[] args) {

        Matriz16_2 rearranjo = new Matriz16_2();
        
        System.out.println("\nMatriz = [-1, 2, -3, 4, 5, 6, -7, 8, 9]");
        
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr.length; 
        
        rearranjo.rearranjo(arr, n); 
        rearranjo.mostrarMatriz(arr, n);
    
    }

    void rotacaoDireita(int arr[], int n, int foraDoLugar, int atual) {
    
        int temp = arr[atual];
    
        for (int i = atual; i > foraDoLugar; i--) {
    
            arr[i] = arr[i - 1];
    
        }
    
        arr[foraDoLugar] = temp;
    
    }

    void rearranjo(int arr[], int n) {
    
        int foraDoLugar = -1; 
    
        for (int index = 0; index < n; index++) {
    
            if (foraDoLugar >= 0) {
    
                if (((arr[index] >= 0)  && (arr[foraDoLugar] < 0)) || ((arr[index] < 0)  
                && (arr[foraDoLugar] >= 0))) {
    
                    rotacaoDireita(arr, n, foraDoLugar, index);                   
    
                    if (index - foraDoLugar >= 2) {
    
                        foraDoLugar = foraDoLugar + 2;
    
                    } else {
    
                        foraDoLugar = -1;
    
                    }
    
                }
    
            } 
    
            if (foraDoLugar == -1) {
    
                if (((arr[index] >= 0) && ((index & 0x01) == 0)) || ((arr[index] < 0) 
                && (index & 0x01) == 1)) {
    
                    foraDoLugar = index;
    
                }
    
            }
    
        }
    
    }

    void mostrarMatriz(int arr[], int n) {
    
        int arr2[] = new int[n];
    
        for (int i = 0; i < n; i++) {
    
            arr2[i] = arr[i];
    
        }
    
        System.out.println("Matriz após rearranjo = " + Arrays.toString(arr2) + "\n");
    
    }  
      
}
