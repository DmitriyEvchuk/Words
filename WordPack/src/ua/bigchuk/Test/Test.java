package ua.bigchuk.Test;

import ua.bigchuk.wordcounter.*;

abstract class Test {

	public static void main(String[] args) {

		ImplementWordsExtraction wordsextractor = new ImplementWordsExtraction();
		WordsCounterImplement countWords = new WordsCounterImplement();
		FileReaderImplement file = new FileReaderImplement(
				"E:\\work\\rfc2822.txt");
		WordSaveImplement fileSave = new WordSaveImplement("forSun.txt");

		file.readFile();

		wordsextractor.parseString(file.getFileString());

		countWords.wordsCounter(wordsextractor.getWords());

		fileSave.save(countWords);

	}// main

}// class;