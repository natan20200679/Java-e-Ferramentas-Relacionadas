/**
 * Wrappers são classes internas que empacotam dados primitivos como objetos, ou seja, representam 
 * tipos primitivos, que são instanciados como objetos. A maior vantagem do seu uso é poder atribuir 
 * valor nulo (null), bem como permitir conversões entre dados primitivos e entre estes e strings. 
 * Tipos primitivos convertidos em wrappers possuem primeira letra maiúscula
 */

package dio.wrappers;

public class Wrappers {

    public static void main(String[] args) {

        /*Autoboxing: */

        /* Byte */
        Byte b = 127;
        Byte b2 = -128;
        Byte nullByte = null;

        /* Char */
        Character c = 'A';
        Character c2 = 15;

        /* Short */
        Short s = 32767;
        Short s2 = -32768;

        /* Int */
        Integer i = 2147483647;
        Integer i2 = -2147483648;

        /* Long */
        Long l = 9223372036854775807L;
        Long l2 = -9223372036854775808L;

        /* Float */
        Float f = 65f;
        Float f2 = 65.0f;
        Float f3 = -0.5f;

        /* Double */
        Double d = 1024.99;
        Double d2 = 10.2456;

        /* Boolean */
        Boolean bo = true;
        Boolean bo2 = false;
        Boolean bo3 = Boolean.getBoolean("false");  
        Boolean bo4 = Boolean.valueOf("true"); 

        /*
         * @author ${natan} 
         * 
         * Exemplos de Conversões entre Wrappers, Tipos Primitivos e Strings, com 
         * conversões de valores tipos primitivos para valores tipos objetos wrappers associados aos tipos 
         * primitivos, e conversões de valores tipo não primitivo string para valores tipos primitivos e o 
         * contrário:
         */
        
        /* Autoboxing -> Primitivo inteiro para objeto wrapper inteiro */
        Integer num1 = 200;  
        
        /* Unboxing -> Objeto wrapper inteiro para primitivo inteiro */
        int num2 = num1.intValue();     
        System.out.println("<----Exemplos de Conversões entre Wrappers, Tipos Primitivos e Strings---->\n");
        System.out.println("Wrapper Inteiro: " + num1);
        System.out.println("Primitivo Inteiro: " + num2);

        /* Autoboxing -> Primitivo double para objeto wrapper double */
        Double num3 = 200.25;        

        /* Unboxing -> Objeto wrapper double para primitivo inteiro */
        int num4 = num3.intValue();
        System.out.println("\nWrapper Double: " + num3);
        System.out.println("Primitivo Inteiro: " + num4);

        /* Autoboxing -> Primitivo float para objeto wrapper float */
        Float num5 = 200.25f;

        /* Unboxing -> Objeto wrapper float para primitivo double */
        double num6 = num5.doubleValue();                                      
        System.out.println("\nWrapper Float: " + num5);
        System.out.println("Primitivo Double: " + num6);

        /* Necessário conhecimento prévio do tipo de dado do valor atribuído (neste caso, o valor entre 
        aspas é do tipo inteiro) 
        */
        String num7 = "400";

        /* Não primitivo string para primitivo inteiro */
        int num8 = Integer.parseInt(num7);                                           
        System.out.println("\nNão Primitivo String: " + num7);
        System.out.println("Primitivo Inteiro: " + num8);

        /* Necessário conhecimento prévio do tipo de dado do valor atribuído (neste caso, o valor entre 
        aspas é do tipo double) 
        */
        String num9 = "400.25";

        /* Não primitivo string para primitivo double */
        double num10 = Double.parseDouble(num9);                                           
        System.out.println("\nNão Primitivo String: " + num9);
        System.out.println("Primitivo Double: " + num10);
        
        float num11 = 100.25f;

        /* Primitivo float para não primitivo string */
        String num12 = Float.toString(num11);                                               
        System.out.println("\nPrimitivo Float: " + num11);
        System.out.println("Não Primitivo String: " + num12);
        
    }

}
