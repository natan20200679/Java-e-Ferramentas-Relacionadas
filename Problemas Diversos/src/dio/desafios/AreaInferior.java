/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. 
Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na 
área inferior da matriz.

Entrada:

A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a 
operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 
valores de ponto flutuante de dupla precisão (double) que compõem a matriz.

Saída:

Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
*/

package desafios;

import java.util.Scanner;

public class AreaInferior {

    private static final int MATRIX_SIZE = 12;

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var O = scanner.next().toUpperCase().charAt(0);
        var M = readEntries(scanner);

        System.out.printf("%.1f", O == 'S' ? getSum(M) : getAverage(M));

    }

    public static double getAverage(double[][] M) {

        return getSum(M) / 30.0;

    }

    public static double[][] readEntries(Scanner scanner) {

        var M = new double[MATRIX_SIZE][MATRIX_SIZE];

        for (int i = 0; i < MATRIX_SIZE; i++) {
            
            for (int j = 0; j < MATRIX_SIZE; j++) {
            
                M[i][j] = scanner.nextDouble();
            
            }
        
        }

        return M;

    }

    public static double getSum(double[][] M) {
        
        double sum = 0;
        
        for (int i = 0; i < MATRIX_SIZE; i++) {
        
            for (int j = 0; j < MATRIX_SIZE; j++) {
            
                if (isOnDelimitedBottom(i, j)) {
                
                    sum += M[i][j];
                
                }
            
            }
        }
        
        return sum;
    
    }

    private static boolean isOnDelimitedBottom(int line, int column) {
    
        return (isOnLeftSide(column) && isOnDiagonalRight(line, column)) || (isOnRightSide(column) && 
        isOnDiagonalLeft(line, column));
    
    }

    public static boolean isOnLeftSide(int column) {
    
        return column < MATRIX_SIZE / 2;
    
    }

    public static boolean isOnRightSide(int column) {
    
        return column >= MATRIX_SIZE / 2;
    
    }

    public static boolean isOnDiagonalRight(int line, int column) {
    
        return line + column > MATRIX_SIZE - 1;
    
    }

    public static boolean isOnDiagonalLeft(int line, int column) {
        
        return column < line;
    
    }

}
