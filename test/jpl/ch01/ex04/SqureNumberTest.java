package jpl.ch01.ex04;

import static org.junit.Assert.*;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SqureNumberTest {
	private PrintStream defaultPrintStream;
	private ByteArrayOutputStream byteArrayOutputStream;

	@Before
	public void setUp() {
		defaultPrintStream = System.out;
		byteArrayOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(new BufferedOutputStream(byteArrayOutputStream)));
	}

	/** 期待値を設定する.*/
	private String getExpected_Result(int[] numArray) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= numArray.length; i++) {
			sb.append(i + ":" + i * i);
			if (i != numArray.length)
				sb.append("\r\n");
		}
		return sb.toString();
	}

	@Test
	public void mainメソッドを実行() {
		// main()メソッドを実行
		SqureNumber.main(new String[] {});

		// 標準出力の内容を取得
		System.out.flush();
		final String actual = byteArrayOutputStream.toString();

		// 期待値を設定
		int[] numArray = new int[10];
		for (int i = 1; i < numArray.length; i++) {
			numArray[i - 1] = i;
		}
		String expected = getExpected_Result(numArray);
		expected += System.lineSeparator();
		assertEquals(expected, actual);
	}

	@After
	public void tearDown() {
		System.setOut(defaultPrintStream);
	}
}