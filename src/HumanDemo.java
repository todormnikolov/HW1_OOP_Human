
public class HumanDemo {

	public static void main(String[] args) {
		Student student = new Student("Ivan Ivanov", "9292929229", 14, 5, 3.789);
		Teacher teacher = new Teacher("Ivanka Ivanova", "2020202010", 55, 5202, 12);
		student.printInfo();
		teacher.printInfo();
	}

}
