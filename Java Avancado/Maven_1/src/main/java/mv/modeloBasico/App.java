/*
Exemplo de Projeto baseado em https://www.youtube.com/watch?v=ZQICkNszEuI.
*/

package mv.modeloBasico;

import org.apache.commons.lang3.StringUtils;

public class App {

    public static void main( String[] args ) {

        System.out.println( "Hello World!" );
        
        String nome = "Natanael Medrado";

        /* 
        Utilização da classe "StringUtils" possível após inclusão da dependência "commons", carregada no 
        "import org.apache.commons" 
        */
        System.out.println(StringUtils.abbreviate(nome,10));
    
    }

}
