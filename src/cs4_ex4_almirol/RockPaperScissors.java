package cs4_ex4_almirol;

public class RockPaperScissors{
    int roundsToWin = 2;
    public int getRoundsToWin() {
       return roundsToWin;
    }
    public static void main(String[] args){
	Move rock = new Move("Rock");
	Move paper = new Move("Paper");
	Move scissors = new Move("Scissors");
		
	rock.setStrongAgainst(scissors);
	paper.setStrongAgainst(rock);
	scissors.setStrongAgainst(paper);
		
	
    }
}