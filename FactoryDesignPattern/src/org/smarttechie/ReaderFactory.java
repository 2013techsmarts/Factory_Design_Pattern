package org.smarttechie;

public class ReaderFactory {

	public static Reader getReader(String readerType) {
		Reader reader = null;
		if (readerType.equalsIgnoreCase("XML")) {
			reader = new XMLReader();
		} else if (readerType.equalsIgnoreCase("CSV")) {
			reader = new CSVReader();
		} else if (readerType.equalsIgnoreCase("DB")) {
			reader = new DataBaseReader();
		}
		return reader;
	}
}
