package ua.bigchuk.wordcounter;

import ua.bigchuk.Tree.*;

import java.io.*;

import ua.bigchuk.arrayLists.MyArray;

public class WordsCounterImplement {

	MyTree words;

	public void wordsCounter(String[] words) {

		char caser =  readTerminal();

		if (caser == 'n')
			WithOutCaseSensitive(words);
		if (caser == 'y')
			CaseSensitive(words);
		// log();
	}

	private void CaseSensitive(String[] words) {

		this.words = new MyTree(new WordSaveImplement("forAnton.txt"));

		for (int i = 0; i < words.length; i++) {

			Integer count = this.words.get(words[i]);
			this.words.add(words[i], count == null ? 1 : count + 1);
		}
		// time 30-34ms in base version WordsCounterImplement 1454ms
		this.words.treeTraversal();

	}

	private void WithOutCaseSensitive(String[] words) {

		this.words = new MyTree(new WithOutCaseSensitive(),
				new WordSaveImplement("forSun.txt"));

		for (int i = 0; i < words.length; i++) {

			Integer count = this.words.get(words[i]);
			this.words.add(words[i], count == null ? 1 : count + 1);
		}
		// time 30-34ms in base version WordsCounterImplement 1454ms
		this.words.treeTraversal();

	}

	// this methods I will bee create when I count size MyTree it's be when I do
	// balancing
	/*
	 * public Integer getWordCount() {
	 * 
	 * return finalWord.length; }
	 */

	// public String getFinalWord(int indx) {

	// }

	// public Integer getFinalWordCount() {

	// }

	// private void log() {
	// System.out.println("In this file use " + getWordCount()
	// + " differnt word");
	// }

	private char readTerminal() {

		Character s = null;

		try {

			BufferedReader stdin = new BufferedReader(new InputStreamReader(
					System.in));

			System.out.println("count word case sensitive Y or N");
			s = (char) stdin.read();

		} catch (IOException e) {
		}

		return Character.toLowerCase(s);
	}

};