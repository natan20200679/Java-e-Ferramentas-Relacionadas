/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package drWaka;

import drWaka.user.User;

public class App {
    
    public static void main(String[] args) {
        
        System.out.println(User.builder("id", "DrWaka", "email@email").toString());
    
    }

}