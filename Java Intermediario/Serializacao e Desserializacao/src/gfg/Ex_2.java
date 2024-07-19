/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gfg;

import java.io.*;

class Ex_2 implements Serializable {

    private static final long serialVersionUID = 129348938L;
    transient int a;
    static int b;
    String name;
    int age;

    public Ex_2(String name, int age, int a, int b) {
        
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    
    }

}

class Ex_2_1 {

    public static void printdata(Ex_2 object1) {

        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.age);
        System.out.println("a = " + object1.a);
        System.out.println("b = " + object1.b);
    
    }

    public static void main(String[] args) {
        
        Ex_2 object = new Ex_2("ab", 20, 2, 1000);
        String filename = "shubham.txt";

        // Serialização
        try {

            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized\n"
                    + "Data before Deserialization.");
            printdata(object);

            // Valor da variável estática modificado
            object.b = 2000;
            
            object.age = 40;
            
        } catch (IOException ex) {
            
            System.out.println("IOException is caught");
        
        }

        object = null;

        // Desserialização
        try {

            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            object = (Ex_2) in.readObject();

            in.close();
            file.close();
            System.out.println("Object has been deserialized\n"
                    + "Data after Deserialization.");
            printdata(object);

            // System.out.println("z = " + object1.z);
        } catch (IOException ex) {
            
            System.out.println("IOException is caught");
        
        } catch (ClassNotFoundException ex) {
        
            System.out.println("ClassNotFoundException" + " is caught");
        
        }
    }
}
