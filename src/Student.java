
public class Student extends Human {

	private byte grade;
	private float score;

	public Student(String name, String egn, int age) {
		super(name, egn, age);

		this.grade = 1;
		this.score = 2;
	}

	public Student(String name, String egn, int age, int grade) {
		super(name, egn, age);

		setGrade(grade);
		this.score = 2;
	}

	public Student(String name, String egn, int age, int grade, double score) {
		super(name, egn, age);

		setGrade(grade);
		setScore(score);
	}

	public byte getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		if (grade <= 1) {
			this.grade = 1;
		} else if (grade >= 13) {
			this.grade = 13;
		} else {
			this.grade = (byte) grade;
		}
	}

	public float getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score >= 6) {
			this.score = 6;
		} else {
			if (score < 3) {
				this.score = 2;
			} else {
				this.score = (float) Math.round(score * 100) / 100;
			}
		}

	}

	public void printInfo() {
		System.out.println(this.getName() + " is a " + this.getGender() + " student in " + this.grade
				+ " grade with score: " + this.score);
	}

}
