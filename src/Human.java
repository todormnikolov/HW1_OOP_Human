
public class Human {

	private String name;
	private String egn;
	private byte age;

	public Human(String name, String egn, int age) {
		setName(name);
		setEgn(egn);
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEgn() {
		return egn;
	}

	public void setEgn(String egn) {
		this.egn = egn;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = (byte) age;
	}

	public String getGender() {
		if (EGNExtractor.isMale(this.egn)) {
			return "male";
		} else {
			return "female";
		}
	}

}
