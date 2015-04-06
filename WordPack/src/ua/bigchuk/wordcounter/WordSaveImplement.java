package ua.bigchuk.wordcounter;

import java.io.*;

import ua.bigchuk.Tree.TreeItemProcess;
import ua.bigchuk.Tree.MyTree.MyTreeItem;

public class WordSaveImplement implements TreeItemProcess {

	private File file;
	// private PrintWriter save;
	private FileWriter save;

	public WordSaveImplement(String name) {

		file = new File(name);
		try {

			if (file.exists())
				file.delete();

			file.createNewFile();
			System.out.println("Result save in  " + file.getPath());
		} catch (IOException e) {
		}

	}

	public void process(MyTreeItem current) {

		try {

			save = new FileWriter(file, true);
			save.write(current.getWord() + " " + current.getCount().toString()
					+ " " + "\n");
			save.close();
		}

		catch (IOException e) {
		}

	}// save

};