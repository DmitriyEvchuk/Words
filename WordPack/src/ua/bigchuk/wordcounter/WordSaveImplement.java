package ua.bigchuk.wordcounter;

import java.io.*;

import ua.bigchuk.Tree.MyTree;

public class WordSaveImplement {

	private File file;

	public WordSaveImplement(String name) {

		file = new File(name);
	}

	public void save(MyTree wordscounter) {

		try {

			file.createNewFile();

			PrintWriter save = new PrintWriter(file);

			for (String keyVal:wordscounter) {

				save.println(keyVal + " "
						+ wordscounter.get(keyVal));

			}

			save.close();

		} catch (IOException e) {
		}

	}// save

};