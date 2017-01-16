/**
 *
 */
package fizzbuzz;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

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
		assertThat(FizzBuzz.FB(30), is("30"));
	}

	@Test
	public void test3倍数エラー出しチェック() {
		assertThat(FizzBuzz.FB(9), is("9"));
	}

	@Test
	public void test5倍数エラー出しチェック() {
		assertThat(FizzBuzz.FB(20), is("20"));

	}

}