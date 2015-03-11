package ua.bigchuk.wordcounter;

import static ua.bigchuk.compare.StringCompare.*;
import ua.bigchuk.arrayLists.MyArray;

public class WordsCounterImplement {

	private Object[][] finalWord;
	private Integer indxWorldCount = -1;

	public void wordsCounter(String[] words) {

		MyArray word = new MyArray();
		MyArray count = new MyArray();

		int countWords = 0;
		//if word is in object MyArray "word" this is true
		Boolean inWord = false;

		for (int i = 0; i < words.length; i++)// for
		{

			String buf = words[i];

			// if it's first val
			if (i == 0) {// if 0

				word.add(buf);

				for (int k = 0; k < words.length; k++) {

					if (equalsString(buf, words[k])) {
						countWords++;
					}
				}// for
				count.add(countWords);

				countWords = 0;
			}// if0

			// if not first val
			if (i != 0) {// if2

				for (int j = 0; j < word.length(); j++)// for1
				{

					if (equalsString(buf, ((String) word.getVal(j)))) {// if

						inWord = true;

					}// if1

				}// for1

				if (inWord == false) {// if3

					for (int z = 0; z < words.length; z++) {// for2

						if (equalsString(buf, words[z])) {
							countWords++;
						}

					}// for2

					count.add(countWords);
					word.add(buf);
					countWords = 0;

				}// if3

			}// if2

			inWord = false;

		}// for

		createFinalWord(word, count);

	}

	public Integer getWordCount() {

		return finalWord.length;
	}

	public String getFinalWord(int indx) {

		indxWorldCount = indx;

		return ((String) finalWord[indx][0]);

	}

	public Integer getFinalWordCount() {

		return ((Integer) finalWord[indxWorldCount][1]);

	}

	private void createFinalWord(MyArray word, MyArray count) {

		int row = word.length();
		int col = 2;

		finalWord = new Object[row][col];

		for (int i = 0; i < finalWord.length; i++) {

			finalWord[i][0] = word.getVal(i);
			finalWord[i][1] = count.getVal(i);

		}

	}

};