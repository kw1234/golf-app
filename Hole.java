public class Hole {

    int par;
    int score;

    public Hole(int par) {
	this.par = par;
	this.score = 0;
    }

    public int getPar() {
	return this.par;
    }

    public int getScore() {
	return this.score;
    }

    public int calcScore() {
	return this.score - this.par;
    }

    public void setScore(int score) {
	this.score = score;
    }

}