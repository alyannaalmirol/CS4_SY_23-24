/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4_ex4_almirol;

/**
 *
 * @author macbookair
 */
import java.util.Scanner;

public class CS4_Ex4_Almirol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int choices;
        int pChoice;       
        int random;        
        
        //import roundsToWin
        RockPaperScissors rounds = new RockPaperScissors();
        int round = rounds.getroundsToWin();
        
        int computerPoints = 0;
        int playerPoints = 0;        
        
        Move player = null;
        Move computer = null;
        
        Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
                
        int result; // Move player vs Move computer
        
        
        
        // TODO code application logic here
        System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
        System.out.println("1. Start game");
        System.out.println("2. Change number of rounds");
        System.out.println("3. Exit application");
        System.out.print("> ");
        choices = sc.nextInt();
        
        if (choices == 1) {
            System.out.printf("This match will be first to %d wins.\n", round);
            while (round > 1) {              
                System.out.println("The computer has selected its move. Select your move:");
                System.out.println("1. Rock");
                System.out.println("2. Paper");
                System.out.println("3. Scissors");
                System.out.print("> ");
                pChoice = sc.nextInt();
                 
                switch (pChoice) {
                    case 1:
                        player = rock;
                        break;
                    case 2:
                        player = paper;
                        break;
                    case 3:
                        player = scissors;
                        break;
                    default:
                        break;
                }
            
                random = (int) Math.floor(Math.random()*3) + 1;
            
                switch (random) {
                    case 1:
                        computer = rock;
                        break;
                    case 2:
                        computer = paper;
                        break;      
                    case 3:
                        computer = scissors;
                        break;
                    default:
                        break;
                }   
            
                result = Move.compareMoves(player, computer);
                
                switch (result) {
                    case 0:
                        playerPoints++;                        
                        System.out.println("Player chose " + player + ". Computer chose " + computer + ". Player wins!");
                        System.out.println("Player: " + playerPoints + " - Computer: " + computerPoints);
                        break;
                    case 1:
                        computerPoints++;
                        System.out.println("Player chose " + player + ". Computer chose " + computer + ". Computer wins!");
                        System.out.println("Player: " + playerPoints + " - Computer: " + computerPoints);
                        break;
                    case 2:
                        System.out.println("Player chose " + player + ". Computer chose " + computer + ". Round is tied!");
                        System.out.println("Player: " + playerPoints + " - Computer: " + computerPoints);
                        break;
                }                               
                round--;             
            }
            if (round == 1) {
                System.out.println("The computer has selected its move. Select your move:");
                System.out.println("1. Rock");
                System.out.println("2. Paper");
                System.out.println("3. Scissors");
                System.out.print("> ");
                pChoice = sc.nextInt();
                 
                switch (pChoice) {
                    case 1:
                        player = rock;
                        break;
                    case 2:
                        player = paper;
                        break;
                    case 3:
                        player = scissors;
                        break;
                    default:
                        break;
                }
            
                random = (int) Math.floor(Math.random()*3) + 1;
            
                switch (random) {
                    case 1:
                        computer = rock;
                        break;
                    case 2:
                        computer = paper;
                        break;      
                    case 3:
                        computer = scissors;
                        break;
                    default:
                        break;
                }   
            
                result = Move.compareMoves(player, computer);
                
                switch (result) {
                    case 0:
                        playerPoints++;
                        System.out.println("Player chose " + player + ". Computer chose " + computer + ". Player wins!");
                        System.out.println("Player: " + playerPoints + " - Computer: " + computerPoints);
                        break;
                    case 1:
                        computerPoints++;
                        System.out.println("Player chose " + player + ". Computer chose " + computer + ". Computer wins!");
                        System.out.println("Player: " + playerPoints + " - Computer: " + computerPoints);
                        break;
                    case 2:
                        System.out.println("Player chose " + player + ". Computer chose " + computer + ". Round is tied!");
                        System.out.println("Player: " + playerPoints + " - Computer: " + computerPoints);
                        break;
                }
                
                if (playerPoints == round) {
                    System.out.println("\nPlayer wins!");
                } else if (computerPoints == round) {
                    System.out.println("\nComputer wins!");
                } 
            }
        } 
        else if (choices == 2) {
            System.out.println("How many wins are needed to win a match?");
            System.out.print("> ");
            round = sc.nextInt();
            
            System.out.println("New setting has been saved!");
        } 
        else if (choices == 3) {
            System.out.println("\nThank you for playing!");
        }
        
       /*
        Notes!
        public int compareMoves(Move m1, Move m2) //Margaret?
        Move rock; Move scissors; Move paper
        Random??????
        var player
        if (input == 1) {
        player = rock;
        }
        */
    }
    
}
