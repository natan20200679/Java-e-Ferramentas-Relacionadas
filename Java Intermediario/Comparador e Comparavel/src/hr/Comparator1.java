/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Nota: Foi escolhido "1" no nome desta classe para evitar conflito com o uso da 
Interface Comparator
*/

package hr;

import java.util.*;

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {

        int comparation = Integer.compare(b.score, a.score);

        if (comparation == 0) comparation = a.name.compareTo(b.name);

        return comparation;

    }

}

class Player {

    String name;
    int score;

    Player(String name, int score){

        this.name = name;
        this.score = score;

    }

}

public class Comparator1 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++) {

            player[i] = new Player(scan.next(), scan.nextInt());

        }

        scan.close();
        Arrays.sort(player, checker);

        for(int i = 0; i < player.length; i++){

            System.out.printf("%s %s\n", player[i].name, player[i]
                    .score);

        }
    }
    
}
