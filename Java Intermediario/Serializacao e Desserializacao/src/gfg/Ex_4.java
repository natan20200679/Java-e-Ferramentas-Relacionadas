/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Exemplo com Serialização e Desserialização personalizadas (custom), que podem 
ser implementadas usando os métodos writeObject() e readObject() respectivamente 
para cada processo.
*/

package gfg;

import java.io.*;

class Ex_4 implements Serializable {

    String username = "gfg_admin";
    transient String pwd = "geeks";

    private void writeObject(ObjectOutputStream oos) throws Exception {

        // Serialização do objeto conta
        oos.defaultWriteObject();

        // epwd (encrypted password) -> Senha encriptada 
        String epwd = "123" + pwd;

        // Escrevendo a senha encriptada no arquivo
        oos.writeObject(epwd);
    }

    private void readObject(ObjectInputStream ois) throws Exception {

        // Desserialização do objeto conta
        ois.defaultReadObject();

        // Desserializando a senha encriptada do arquivo
        String epwd = (String) ois.readObject();

        // Descriptografando-o e salvando-o com a senha original. 
        // String iniciando do 3º índice até o último índice
        pwd = epwd.substring(3);
    }
}

class CustomizedSerializationDemo {

    public static void main(String[] args) throws Exception {
        
        Ex_4 gfg_g1 = new Ex_4();

        System.out.println("Username :" + gfg_g1.username + "	 Password :" + 
                gfg_g1.pwd);

        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(gfg_g1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Ex_4 gfg_g2 = (Ex_4) ois.readObject();

        System.out.println("Username :" + gfg_g2.username + "	 Password :" + 
                gfg_g2.pwd);
    }
}
