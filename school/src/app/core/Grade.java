package app.core;

public  class Grade {

	private profession profession;
	private int score = 40;
	public static final int MIN_SCORE = 40;
	public static final int MAX_SCORE = 100;

	public Grade() {
	}

	public Grade(profession profession, int score) {
		super();
		this.profession = profession;
		setScore(score);
	}

	public profession getProfession() {
		return profession;
	}

	public void setProfession(profession profession) {
		this.profession = profession;
	}

	public int getScore() {
		return score;
	}

	public boolean setScore(int score) {
		if(score >= MIN_SCORE && score <= MAX_SCORE) {
			this.score = score;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Grade [profession=" + profession + ", score=" + score + "]";
	}
	
	

}
