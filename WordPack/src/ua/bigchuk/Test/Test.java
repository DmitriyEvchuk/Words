package ua.bigchuk.Test;

import ua.bigchuk.wordcounter.*;

abstract class Test {

	public static void main(String[] args) {

		// for total time
		long totalT = -System.currentTimeMillis();

		ImplementWordsExtraction wordsextractor = new ImplementWordsExtraction();
		WordsCounterImplement countWords = new WordsCounterImplement();

		// for file read time
		long readT = -System.currentTimeMillis();

		FileReaderImplement file = new FileReaderImplement(
				"E:\\work\\rfc2822.txt");

		file.readFile();

		String fileString = file.getFileString();

		// for file read time
		readT += System.currentTimeMillis();

		// for word extract time
		long extractT = -System.currentTimeMillis();

		wordsextractor.parseString(fileString);
		String[] f = wordsextractor.getWords();

		// for word extract time
		extractT += System.currentTimeMillis();

		// for word counter time
		long countT = -System.currentTimeMillis();

		countWords.wordsCounter(f);

		// //for word counter time
		countT += System.currentTimeMillis();

		// for save time
		long saveT = -System.currentTimeMillis();

		WordSaveImplement fileSave = new WordSaveImplement("forSun.txt");
		fileSave.save(countWords);

		// for save time
		saveT += System.currentTimeMillis();
		// for total time
		totalT += System.currentTimeMillis();

		System.out.println("total " + totalT);
		System.out.println("read " + readT);
		System.out.println("extract " + extractT);
		System.out.println("count " + countT);
		System.out.println("save " + saveT);

	}// main

}// class;