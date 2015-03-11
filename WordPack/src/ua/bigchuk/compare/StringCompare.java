package ua.bigchuk.compare;

abstract public class StringCompare {

	public static boolean equalsString(String first, String second) {

		if (first.length() == second.length()) {// if0

			int symbolEquals = 0;

			for (int i = 0; i < first.length(); i++)// for0
			{
				char valFirst = first.charAt(i);
				char valSecond = second.charAt(i);

				if (Chars.charCompare(valFirst, valSecond))
					symbolEquals++;

			}// for0

			if (symbolEquals == first.length())
				return true;

		}// if0

		return false;

	}

}