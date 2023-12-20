package cn.cxy.exec;

public class ex03 {
	
	int score;
	char level;
	
	public Score(int score) {
		this.score = score;
		
		this.level = setLevel(score);
	}

	private char setLevel(int s) {
		char r = 0;
		switch(s/10) {
		case 10:case 9:
			r = 'A';break;
		case 8:case 7:
			r = 'B';break;
		case 6:
			r = 'C';break;
		case 5:case 4:case 3:case 2:
			r = 'D';break;
		case 1:case 0:
			r = 'E';break;
		}
		return r;

	}

	public String toString() {
		return score+", "+level;
	}
}
