
public class EGNExtractor {

	public static boolean isMale(String egn) {
		byte genderDigit = (byte) egn.charAt(8);

		return (genderDigit % 2 == 0) ? true : false;
	}
}
