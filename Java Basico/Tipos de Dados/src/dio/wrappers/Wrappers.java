/**
 * Wrappers são classes internas que empacotam dados primitivos como objetos, ou seja, representam 
 * tipos primitivos, que são instanciados como objetos. A maior vantagem do seu uso é poder atribuir 
 * valor nulo (null), bem como permitir conversões entre dados primitivos e entre estes e strings. 
 * Tipos primitivos convertidos em wrappers possuem primeira letra maiúscula
 */

package dio.wrappers;

public class Wrappers {

    public static void main(String[] args) {

        // Autoboxing:

        Byte b = 127; // Byte
        Byte b2 = -128;
        Byte nullByte = null;

        Character c = 'A'; // Char
        Character c2 = 15;

        Short s = 32767; // Short
        Short s2 = -32768;

        Integer i = 2147483647; // Int
        Integer i2 = -2147483648;

        Long l = 9223372036854775807L; // Long
        Long l2 = -9223372036854775808L;

        Float f = 65f; // Float
        Float f2 = 65.0f;
        Float f3 = -0.5f;

        Double d = 1024.99;  // Double
        Double d2 = 10.2456;

        Boolean bo = true;  // Boolean
        Boolean bo2 = false;
        Boolean bo3 = Boolean.getBoolean("false");  
        Boolean bo4 = Boolean.valueOf("true"); 

        // @author ${natan} -> Exemplos de Conversões entre Wrappers, Tipos Primitivos e Strings, 
        // com conversões de valores tipos primitivos para valores tipos objetos wrappers associados 
        // aos tipos primitivos, e conversões de valores tipo não primitivo string para valores 
        // tipos primitivos e o contrário:
        
        Integer num1 = 200; // Autoboxing -> Primitivo inteiro para objeto wrapper inteiro                           
        int num2 = num1.intValue(); // Unboxing -> Objeto wrapper inteiro para primitivo inteiro                                    
        System.out.println("<----Exemplos de Conversões entre Wrappers, Tipos Primitivos e Strings---->\n");
        System.out.println("Wrapper Inteiro: " + num1);
        System.out.println("Primitivo Inteiro: " + num2);

        Double num3 = 200.25; // Autoboxing -> Primitivo double para objeto wrapper double                             
        int num4 = num3.intValue(); // Unboxing -> Objeto wrapper double para primitivo inteiro
        System.out.println("\nWrapper Double: " + num3);
        System.out.println("Primitivo Inteiro: " + num4);

        Float num5 = 200.25f; //Autoboxing -> Primitivo float para objeto wrapper float
        double num6 = num5.doubleValue(); //Unboxing -> Objeto wrapper float para primitivo double                                      
        System.out.println("\nWrapper Float: " + num5);
        System.out.println("Primitivo Double: " + num6);

        String num7 = "400"; //Necessário conhecimento prévio do tipo de dado do valor atribuído 
        //(neste caso, o valor entre aspas é do tipo inteiro)
        int num8 = Integer.parseInt(num7); //Não primitivo string para primitivo inteiro                                            
        System.out.println("\nNão Primitivo String: " + num7);
        System.out.println("Primitivo Inteiro: " + num8);

        String num9 = "400.25"; //Necessário conhecimento prévio do tipo de dado do valor atribuído 
        //(neste caso, o valor entre aspas é do tipo double)
        double num10 = Double.parseDouble(num9); //Não primitivo string para primitivo double                                           
        System.out.println("\nNão Primitivo String: " + num9);
        System.out.println("Primitivo Double: " + num10);
        
        float num11 = 100.25f;
        String num12 = Float.toString(num11); //Primitivo float para não primitivo string                                               
        System.out.println("\nPrimitivo Float: " + num11);
        System.out.println("Não Primitivo String: " + num12);
        
    }

}
