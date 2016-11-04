package jpl.ch01.ex10;

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
		final String expected = "1: false\r\n1: false\r\n2: true\r\n3: false\r\n5: false\r\n8: true\r\n13: false\r\n21: false\r\n34: true" + System.lineSeparator();

		assertEquals(expected, actual);
	}

	@After
	public void tearDown() {
		System.setOut(defaultPrintStream);
	}
}
