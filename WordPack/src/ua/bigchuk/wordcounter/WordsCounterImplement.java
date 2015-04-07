package ua.bigchuk.wordcounter;

import ua.bigchuk.Tree.*;
import ua.bigchuk.compare.*;
import java.io.*;



public class WordsCounterImplement {

	MyTree words;

	public void wordsCounter(String[] words) {

		char caser = readTerminal();

		if (caser == 'n')
			WithOutCaseSensitive(words);
		if (caser == 'y')
			CaseSensitive(words);
		 log();
	}

	private void CaseSensitive(String[] words) {

		this.words = new MyTree();

		for (int i = 0; i < words.length; i++) {

			Integer count = this.words.get(words[i]);
			this.words.add(words[i], count == null ? 1 : count + 1);
		}
		// time 30-34ms in base version WordsCounterImplement 1454ms
		

	}

	private void WithOutCaseSensitive(String[] words) {

		this.words = new MyTree(new WithOutCaseSensitive());

		for (int i = 0; i < words.length; i++) {

			Integer count = this.words.get(words[i]);
			this.words.add(words[i], count == null ? 1 : count + 1);
		}
		// time 30-34ms in base version WordsCounterImplement 1454ms
		

	}

	public MyTree getFinalWord() {

		return words;
	}

	public Integer getWordCount() {

		return words.size();
	}

	private void log() {
		System.out.println("In this file use " + getWordCount()
				+ " differnt word");
	}

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