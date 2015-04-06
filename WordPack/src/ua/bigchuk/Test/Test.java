package ua.bigchuk.Test;

import ua.bigchuk.wordcounter.*;

abstract class Test {

	public static void main(String[] args) {

		FileReaderImplement file = new FileReaderImplement();
		ImplementWordsExtraction wordsextractor = new ImplementWordsExtraction();
		WordsCounterImplement countWords = new WordsCounterImplement();

		// for total time
		long totalT = -System.currentTimeMillis();
		// for file read time
		long readT = -System.currentTimeMillis();

		file.readFile();

		String fileString = file.getFileString();

		// for file read end time
		readT += System.currentTimeMillis();

		// for word extract begin time
		long extractT = -System.currentTimeMillis();

		wordsextractor.parseString(fileString);
		String[] f = wordsextractor.getWords();

		// for word extract end time
		extractT += System.currentTimeMillis();

		// for word counter time
		long countT = -System.currentTimeMillis();

		countWords.wordsCounter(f);

		// //for word counter time
		countT += System.currentTimeMillis();

		// for total time
		totalT += System.currentTimeMillis();

		System.out.println("total " + totalT);
		System.out.println("read " + readT);
		System.out.println("extract " + extractT);
		System.out.println("count " + countT);
		// E:\work\rfc2822.txt

	}// main

}// class;