/**
 *
 */
package fizzbuzz;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test3と5の倍数チェック() {
		assertThat(FizzBuzz.FB(15), is("FizzBuzz"));
	}

	@Test
	public void tesut3の倍数チェック() {
		assertThat(FizzBuzz.FB(3), is("Fizz"));
	}

	@Test
	public void tesut5の倍数チェック() {
		assertThat(FizzBuzz.FB(10), is("Buzz"));
	}

	// 数値の表示

	@Test
	public void tesut3と5の倍数以外の数値チェック1() {
		assertThat(FizzBuzz.FB(2), is("2"));
	}

	@Test
	public void tesut3と5の倍数以外の数値チェック2() {
		assertThat(FizzBuzz.FB(4), is("4"));
	}

	@Test
	public void tesut3と5の倍数以外の数値チェック3() {
		assertThat(FizzBuzz.FB(101), is("101"));
	}

	// エラー出し

	@Test
	public void test3と5の倍数エラー出しチェック() {
		assertThat(FizzBuzz.FB(30), not(is("30")));

	}

	@Test
	public void test3倍数エラー出しチェック() {
		assertThat(FizzBuzz.FB(9), not(is("9")));
	}

	@Test
	public void test5倍数エラー出しチェック() {
		assertThat(FizzBuzz.FB(20), not(is("20")));
	}

	@Test
	public void test3と5の倍数ランダムチェック() {

		// Randomクラスのインスタンス化

		Random rnd = new Random();

		int ran = rnd.nextInt(999);
		System.out.println(ran);

		assertThat(FizzBuzz.FB(15 * ran), not(is("FizzBuzz")));
	}

	@Test
	public void test３の倍数ランダムチェック() {

		// Randomクラスのインスタンス化

		Random rnd = new Random();

		int ran = rnd.nextInt(999);
		System.out.println(ran);

		assertThat(FizzBuzz.FB(3 * ran), not(is("Fizz")));
	}

	@Test
	public void test5の倍数ランダムチェック() {

		// Randomクラスのインスタンス化

		Random rnd = new Random();

		int ran = rnd.nextInt(999);
		System.out.println(ran);

		assertThat(FizzBuzz.FB(5 * ran), not(is("Buzz")));
	}

}
