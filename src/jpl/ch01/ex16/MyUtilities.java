package jpl.ch01.ex16;

import java.io.FileInputStream;
import java.io.IOException;

class MyUtilities {
	public double[] getDataSet(String setName) throws BadDataSetException {
		String file = setName + ".dest";
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			return readDataSet(in);
		} catch (IOException e) {
			throw new BadDataSetException(setName, e);
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				; // 無視 : データの読み込みは成功しているか，あるいは
					// BadDataSetExceptoin をスローしようとしている
			}
		}
	}
	private double[] readDataSet(FileInputStream in) {
		// 適当に書いておく.
		return new double[] {0.0};
	}
}
