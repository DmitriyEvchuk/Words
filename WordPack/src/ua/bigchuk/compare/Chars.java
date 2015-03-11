package ua.bigchuk.compare;

abstract public class Chars {

	static boolean charCompare(char a, char b) {

		if (Character.isLetter(a) && Character.isLetter(b)) {
			// 32 the difference between the uppercase and loweercase
			if ((a - b) == 32)
				return true;

			if (a == b)
				return true;

			if ((a - b) == (-32))
				return true;
		}

		if ((a == '\'') && (b == '\''))
			return true;

		return false;
	}

}