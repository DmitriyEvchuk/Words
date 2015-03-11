package ua.bigchuk.arrayLists;

public class MyArray {

	private Object[] array;

	private Integer realSize = 0;

	public void add(Object val) {

		final int controlSize = 5;

		if (array == null) {

			array = new Object[controlSize];

		}// if0

		if (array != null) {

			if (realSize == (array.length)) {

				Object buf[] = array;
				array = new Object[array.length + controlSize];

				for (int i = 0; i < buf.length; i++) {

					array[i] = buf[i];

				}// for

			}// if1
		}// if0

		array[realSize] = val;
		realSize++;

	}

	public Integer length() {

		if (realSize == 0) {

			array[array.length] = "";
		}

		return realSize;
	}

	public Object getVal(Integer indx) {

		if (indx >= realSize) {

			array[array.length] = "";
		}

		return array[indx];
	}

};