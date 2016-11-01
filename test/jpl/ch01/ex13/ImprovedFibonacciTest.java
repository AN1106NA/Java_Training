package jpl.ch01.ex13;

import static org.junit.Assert.*;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ImprovedFibonacciTest {
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
		ImprovedFibonacci.main(new String[] {});

		// 標準出力の内容を取得
		System.out.flush();
		final String actual = byteArrayOutputStream.toString();

		// 期待値を設定
		final String expected = "1: 1\r\n2: 1 \r\n3: 2 *\r\n4: 3 \r\n5: 5 \r\n6: 8 *\r\n7: 13 \r\n8: 21 \r\n9: 34 *" + System.lineSeparator();

		assertEquals(expected, actual);
	}

	@After
	public void tearDown() {
		System.setOut(defaultPrintStream);
	}
}
