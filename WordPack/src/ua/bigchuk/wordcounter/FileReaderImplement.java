package ua.bigchuk.wordcounter;

import java.io.*;

public class FileReaderImplement {

	private File file;

	private String filestr;

	public FileReaderImplement() {

		try {

			BufferedReader stdin = new BufferedReader(new InputStreamReader(
					System.in));

			System.out.println("Enter path File");
			String s = stdin.readLine();

			file = new File(s);

			System.out.println("get the files in the specified path "
					+ file.getPath());

		} catch (IOException e) {
		}

	}

	public String getFileString() {
		return filestr;
	}

	public void readFile() {

		try {

			BufferedReader in = new BufferedReader(new FileReader(file));
			filestr = fileToString(in);

		}// try

		catch (IOException e) {
		}

	}

	private String fileToString(BufferedReader str) {

		String filestr1 = "";
		String s = "";

		try {

			while ((s = str.readLine()) != null) {

				filestr1 = filestr1 + s;
				filestr1 = filestr1 + " ";

			}
			str.close();
		}

		catch (IOException e) {
		}

		return filestr1;

	}// fileToString

}