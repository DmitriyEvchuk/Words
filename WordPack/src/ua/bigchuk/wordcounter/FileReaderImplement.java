package ua.bigchuk.wordcounter;

import java.io.*;

public class FileReaderImplement {

	private File file;

	private String filestr;

	public FileReaderImplement(String name) {

		file = new File(name);

	}

	public String getFileString() {
		return filestr;
	}

	public void readFile() {

		try {

			FileInputStream in = new FileInputStream(file);
			DataInputStream str = new DataInputStream(in);

			filestr = fileToString(str);

		}// try

		catch (IOException e) {
		}

	}

	private String fileToString(DataInputStream str) {

		String filestr1 = "";
		String s = "";

		try {

			while ((s = str.readLine()) != null) {

				filestr1 = filestr1 + s;
				filestr1 = filestr1 + " ";

			}

		}

		catch (IOException e) {
		}

		return filestr1;

	}// fileToString

}