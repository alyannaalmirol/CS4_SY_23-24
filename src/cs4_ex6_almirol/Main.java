/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_ex6_almirol;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author macbookair
 */

/* Create the main method in a separate java file. In the main method, create 
three Monsters, one of each type (you may choose the values for the Monsters). 
Simulate 3 separate battles, Grass vs Fire, Fire vs Water, and Water vs Grass. 
Create a loop so that they repeatedly attack each other until one or both HP is 
reduced to 0. There is no need for user input in the main method, 
so you may hardcode the entire process. */

public class Main {
    public static Random random = new Random();
    
    public static void rng(Monster m1, Monster m2) {
        int rand = random.nextInt(1, 5);
        switch(rand){
            case 1:
                m1.attack(m2);
                break;
            case 2:
                m1.charge();
                break;
            case 3:
                m1.rest();
                break;
            case 4:
                m1.guard();
                break;
            case 5:
                m1.special();
                break;
        }
    }
    public static void main(String[] args) {
        FireType solaris = new FireType("Solaris", 400, 200);
        WaterType vanessa = new WaterType("Vanessa", 300, 100);
        GrassType eclair = new GrassType("Eclair", 500, 400);
        
        while (true) {
          if (solaris.getHP() == 0.0 || eclair.getHP() == 0.0) {
              break;
          }
          rng(solaris, eclair);
          if (solaris.getHP() == 0.0 || eclair.getHP() == 0.0) {
              break;
          }
          rng(eclair, solaris);
          //System.out.printf("Confirm %s HP: %f\n", solaris.name, solaris.hp);
        }
        
        System.out.println("done!");
        
        while (true) {
          if (solaris.getHP() > 0 || vanessa.getHP() > 0) {
              break;
          }
          rng(solaris, vanessa);
          if (solaris.getHP() == 0.0 || eclair.getHP() == 0.0) {
              break;
          }
          rng(vanessa, solaris);
        }
        
        System.out.println("done!");
        
        while (true) {
          if (vanessa.getHP() > 0 || eclair.getHP() > 0) {
              break;
          }
          rng(vanessa, eclair);
          if (solaris.getHP() == 0.0 || eclair.getHP() == 0.0) {
              break;
          }
          rng(eclair, vanessa);
        }
        
        System.out.println("done!");
    }
}
