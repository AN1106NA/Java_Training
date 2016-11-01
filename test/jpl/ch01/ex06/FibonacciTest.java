package jpl.ch01.ex06;

import static org.junit.Assert.*;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FibonacciTest {
	private PrintStream defaultPrintStream;
	private ByteArrayOutputStream byteArrayOutputStream;

	@Before
	public void setUp() {
		defaultPrintStream = System.out;
		byteArrayOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(new BufferedOutputStream(byteArrayOutputStream)));
	}

	@Test
	public void mainメソッドを実行() {
		// main()メソッドを実行
		Fibonacci.main(new String[] {});

		// 標準出力の内容を取得
		System.out.flush();
		final String actual = byteArrayOutputStream.toString();

		// 期待値を設定
		final String expected = "Fibonacci 1\r\nFibonacci 1\r\nFibonacci 2\r\nFibonacci 3\r\nFibonacci 5\r\n"
				+ "Fibonacci 8\r\nFibonacci 13\r\nFibonacci 21\r\nFibonacci 34" + System.lineSeparator();

		assertEquals(actual, expected);
	}

	@After
	public void tearDown() {
		System.setOut(defaultPrintStream);
	}
}
