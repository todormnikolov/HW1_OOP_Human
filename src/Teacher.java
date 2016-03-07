
public class Teacher extends Human {

	private float salary;
	private byte yearsOfExpirience;

	public Teacher(String name, String egn, int age) {
		super(name, egn, age);

		this.yearsOfExpirience = 0;
		this.salary = 420;
	}

	public Teacher(String name, String egn, int age, double salary, int yearsOfExpirience) {
		super(name, egn, age);

		setSalary(salary);
		setYearOfExpirience(yearsOfExpirience);
		;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary < 0) {
			this.salary = 420;
		} else {
			this.salary = (float) Math.round(salary * 100) / 100;
		}
	}

	public byte getYearOfExpirience() {
		return yearsOfExpirience;
	}

	public void setYearOfExpirience(int years) {
		if (years <= 0 || years > this.getAge() - 18) {
			this.yearsOfExpirience = 0;
		} else {
			this.yearsOfExpirience = (byte) years;
		}
	}

	public void printInfo() {
		System.out.println(this.getName() + " is a " + this.getGender() + " teacher with " + this.yearsOfExpirience
				+ " years of expirience and " + this.salary + " salary");
	}
}
