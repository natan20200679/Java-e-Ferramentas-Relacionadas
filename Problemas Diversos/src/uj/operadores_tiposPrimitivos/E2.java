/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
O que acontece se tentarmos compilar e executar o seguinte código?
 
   class Teste {
     public static void main(String args) {
        System.out.println(args);
     }
   }
   
   a) Não imprime nada. 
   b) Erro de compilação na linha 2 
   c) Imprime o valor de args 
   d) Exceção na thread “main” java.lang.NoSuchMethodError: main 
   e) Erro em tempo de execução.
 */

package operadores_tiposPrimitivos;

public class E2 {

  public static void main(String args) {
    
    /* Ocorre o ítem d), pois há erro na assinatura do método main (falta [] após o termo String) */
    
    System.out.println(args);
  
  }

}
