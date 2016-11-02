package jpl.ch01.ex16;

import java.io.IOException;
/**
 *  BadDataSetExceptionにフィールドを追加してデータの集まりの名前と、
 *  問題を通知しているI/OException例外を保持する.
 * @author Anna.S
 *
 */
public class BadDataSetException extends Exception {
	private String dataset;
	private IOException io;

	public BadDataSetException(String dataSet, IOException io) {
		this.dataset = dataSet;
		this.io = io;
	}

	public String getDataset() {
		return dataset;
	}

	public IOException getIOException() {
		return io;
	}
}