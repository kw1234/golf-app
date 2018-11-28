import java.util.Random;

public class Golfer {

    Hole[] holes;
    Random rand;

    public Golfer(int numHoles) {
	this.holes = new Hole[numHoles];
	this.rand = new Random();
    }

    public void populateHolesRandomly() {
	for (int i = 0; i < holes.length; i++) {
	    int n = rand.nextInt(2) + 2;
	    this.holes[i] = new Hole(n);
	}
    }

    public void populateScoresRandomly() {
	for (int i = 0; i < holes.length; i++) {
	    int n = rand.nextInt(4)+1;
	    this.holes[i].setScore(n);
	}
    }
    
    public void printCalcScores() {
	for (Hole h: this.holes) {
	    System.out.print(" "+h.calcScore());
	}
	System.out.println();
    }

    public static void main(String[] args) {
	Golfer g = new Golfer(9);
	g.populateHolesRandomly();
	g.populateScoresRandomly();
	g.printCalcScores();
    }
}