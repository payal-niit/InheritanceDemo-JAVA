package com.bank.transaction;

import java.util.Scanner;

public class IString {

	StringBuffer iString = null;

	public IString(StringBuffer s) {
		this.iString = s.reverse();
	}

	public boolean equals(Object o) {
		boolean value = false;

		if (o instanceof IString) {
			IString is = (IString) o;

			StringBuffer iString_1 = is.getValue();

			int length_1 = iString.length();
			int length_2 = iString.length();

			int min = Math.min(length_1, length_2);
			int max = Math.max(length_1, length_2);

			if ((max - min) > 1)
				value = false;

			// note that index starts with '0'
			for (int i = 0; i < min; i = i + 2)
				if (iString.charAt(i) == iString_1.charAt(i))
				{
					System.out.println(iString.charAt(i));
					System.out.println(iString_1.charAt(i));
					
					value = true;
				}
		} else {
		return value;
		}
		
		return value;
	}

	public StringBuffer getValue() {
		return iString;
	}

	public void setValue(StringBuffer s) {
		iString = s.reverse();
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value one");
		IString i = new IString(new StringBuffer(scanner.nextLine()));
		
		System.out.println("Enter value two");
		IString j = new IString(new StringBuffer(scanner.nextLine()));
		try {
			if (i.equals(j))
				System.out.println("Strings are equal");
			else
				System.out.println("Strings are not equal");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
