package dio.tipagem;

public class TipagemForte {

    public static void main(String[] args) {

        String texto = "meu texto";

        /* NOK */
        // texto = 1000;

        Integer numero = Integer.valueOf("1024");

        /* OK */
        numero = 512;   
            
    }

}
