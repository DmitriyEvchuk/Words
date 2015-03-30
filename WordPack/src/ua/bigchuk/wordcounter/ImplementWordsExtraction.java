package ua.bigchuk.wordcounter;

import ua.bigchuk.arrayLists.MyArray;

public class ImplementWordsExtraction {

	private MyArray words = new MyArray();

	public void parseString(String data) {

		String toArray = "";
		String apostrToArray = "";
		char last = ' ';

		// if apostrophe in buffer string 'apostrToArray' x=true
		Boolean x = false;

		final char apostrophe = '\'';

		for (int i = 0; i < data.length(); i++) {

			Character val = data.charAt(i);

			// if apostrophe
			if (val == apostrophe) {// 4

				// if last val is letter inside apostrophe in buffer string
				if (Character.isLetter(last)) {// 5

					apostrToArray = "";
					apostrToArray = apostrToArray + val.toString();
					x = true;

				}// 5

				// if many apostrophe between words with out space
				if ((!Character.isLetter(last)) && (x == true)) {// 7

					words.add(toArray);
					x = false;
					toArray = "";
				}// 7

			}// 4

			// if all cases except for the apostrophe
			if (val != apostrophe) {// if3

				// inside apostrophe
				if ((Character.isLetter(val)) && (x == true)) {// if6

					toArray = toArray + apostrToArray;
					x = false;

				}// if6

				// exclusion apostrophe
				if ((!Character.isLetter(val)) && (x == true)) {// if6

					words.add(toArray);
					toArray = "";
					x = false;

				}// if6

				// if letter add in words
				if (Character.isLetter(val)) {

					String buf = val.toString();
					toArray = toArray + buf;

				}// if0

				// if letter
				if (Character.isLetter(last)) {
					// if current val is not letter and words
					if (!Character.isLetter(val)) {

						words.add(toArray);
						toArray = "";

					}// if2

				}// if1

			}// if3

			last = val;

		}// for

		log();
	};// parse

	public int getWordsCount() {

		return words.length();
	};// getWordsCount

	public String[] getWords() {

		String[] buf = new String[words.length()];

		for (int i = 0; i < words.length(); i++) {
			buf[i] = ((String) words.getVal(i));
		}

		return buf;
	};// getWords

	private void log() {

		System.out.println("get " + getWordsCount() + " words");

	}

};// clas