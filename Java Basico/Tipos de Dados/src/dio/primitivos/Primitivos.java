package dio.primitivos;

public class Primitivos {

    public static void main(String[] args) {

        /* INTEIROS */

        // byte nullByte = null;
        byte b; // 8 bits
        byte b1 = 127;
        byte b2 = -128;

        /* To large */
        // byte b3 = 129;

        /* 16 bits */
        char c; 

        char c1 = 'A';
        char c2 = 15;

        /* NOK */
        // char c3 = 'AA';
        // char c4 = -100;

        /* 16 bits */
        short s; 

        short s1 = 32767;
        short s2 = -32768;

        /* 32 bits */
        int i = 2147483647;

        int i2 = -2147483648;
        
        /* To large */
        // int i3 = -2147483649;

        /* 64 bits */
        long l = 9223372036854775807l; 

        long l2 = -9223372036854775808L;

        /* To large */
        // long l3 = 9223372036854775808L;

        /* FLUTUANTES */
        
        /* 32 bits    3.402,823,5 E+38 */
        float f = 65f; 

        float f2 = 65.0f;
        
        /* 1.4 E-45 */
        float f3 = -0.5f;

        /* 64 bits  1.797,693,134,862,315,7 E+308 */
        double d = 1024.99;

        /* 4.9 E-324 */
        double d2 = 10.2456; 

        /* Boleano */
        boolean bo = true;
        boolean bo2 = false;

        /* NOK */
        // boolean bo3 = "false";
        // boolean bo4 = 'true';

        /* Palavra reservada */
        // void v;

        /* ERROR */
        // System.out.println("byte : " + b);
        
    }

}
