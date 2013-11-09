package org.smarttechie;

public class FactoryPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ReaderFactory.getReader("XML").read());
	}

}
