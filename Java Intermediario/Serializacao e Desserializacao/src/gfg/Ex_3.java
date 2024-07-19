/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gfg;

import java.io.*;

class Ex_3 implements Serializable {

    int i = 10;
    transient final int j = 20; // aqui o termo "final" invalida a determinação...
    // do "transient"

}

class Ex_3_1 {

    public static void main(String[] args) 
            throws IOException, ClassNotFoundException {
        
        Ex_3 d1 = new Ex_3();
        
        System.out.println("serialization started");
        
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(d1);
        
        System.out.println("Serialization ended");
        System.out.println("Deserialization started");
        
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Ex_3 d2 = (Ex_3) ois.readObject();
        
        System.out.println("Deserialization ended");
        System.out.println("Ex_3 object data");
        System.out.println(d2.i + "\t" + d2.j);
    }
}
