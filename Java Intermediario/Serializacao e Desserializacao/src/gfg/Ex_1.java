/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gfg;

import java.io.*;

public class Ex_1 implements java.io.Serializable {

    public int a;
    public String b;

    public Ex_1(int a, String b) {
        
        this.a = a;
        this.b = b;
    
    }

}

class Test {

    public static void main(String[] args) {
        
        Ex_1 object = new Ex_1(1, "geeksforgeeks");
        String filename = "file.ser";

        // Serialização
        try {
            
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(object);
            out.close();
            file.close();

            System.out.println("Object has been serialized");

        } catch (IOException ex) {
            
            System.out.println("IOException is caught");
        
        }

        Ex_1 object1 = null;

        // Desserialização
        try {
            
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            object1 = (Ex_1) in.readObject();
            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        
        } catch (IOException ex) {
        
            System.out.println("IOException is caught");
        
        } catch (ClassNotFoundException ex) {
        
            System.out.println("ClassNotFoundException is caught");
        
        }

    }
}
