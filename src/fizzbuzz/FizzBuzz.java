package fizzbuzz;

public class FizzBuzz {

	private static final String RES_FIZZBUZZ = "FizzBuzz";
	private static final String RES_FIZZ = "Fizz";
	private static final String RES_BUZZ = "Buzz";

	public static String FB(int i) {
		String s = null;




		if (i % 3 == 0 && i % 5 == 0) {
			s = RES_FIZZBUZZ;
		} else if (i % 3 == 0) {
			s = RES_FIZZ;

		} else if (i % 5 == 0) {
			s = RES_BUZZ;
		} else {
			s = String.valueOf(i);



		}
		return s;
	}

}
