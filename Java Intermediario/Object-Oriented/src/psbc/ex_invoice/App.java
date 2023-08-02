/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.ex_invoice;

public class App {

    public static void main(String[] args) {
        
        Invoice inv = new Invoice(1, "Mousepad", 10, 50.0f);
        
        System.out.println("Valor total = " + inv.getInvoiceAmount());
    
    }

}
