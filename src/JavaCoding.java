import java.util.HashMap;
import java.util.Set;

public class JavaCoding {

	private static String checkPalindrome(int num) {

		int perm = num;

		int rev = 0;

		String palindromeOrNot = "";

		while (num != 0) {

			int rem = num % 10;

			rev = (rev * 10) + rem;

			num = num / 10;

		}

		return palindromeOrNot = rev == perm ? "Palindrome" : "Not a Palindrome";

	}

	public static String checkPalindromeString(String str) {

		String perm = str;

		String palindromeOrNot = "";

		String rev = "";

		char[] characters = str.toCharArray();

		for (int i = characters.length - 1; i >= 0; i--) {

			rev = rev + characters[i];

		}

		return palindromeOrNot = rev.equals(perm) ? "Palindrome" : "Not a Palindrome";

	}

	public static String checkPalindromeInbuild(String str) {

		String perm = str;

		String rev = new StringBuilder(str).reverse().toString();

		String palindromeOrNot = "";

		return palindromeOrNot = rev.equals(perm) ? "Palindrome" : "Not a Palindrome";
	}

	public static int extractNumbersAdd(String str) {

		int sum = 0;

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (Character.isDigit(charArray[i])) {

				sum = sum + Character.getNumericValue(charArray[i]);
			}

		}

		return sum;

	} // 5 10

	public static void swapTwoVariable(int a, int b) {

		a = a + b;

		b = a - b;

		a = a - b;

		System.out.println(a + " " + b);

	}

	public static void SwapTwoStr(String a, String b) {

		a = a + b; // HelloJava

		b = a.substring(0, a.length() - b.length());

		a = a.substring(b.length());

		System.out.println(a + " " + b);

	}

	public static void printFloydTriangle(int num) {

		int count = 1;

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(count++ + " ");

			}

			System.out.println();

		}

	}

	public static void findIndividualCharactersCount(String str) {

		char[] ch = str.toLowerCase().toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char c : ch) {

			if (!hm.containsKey(c)) {

				hm.put(c, 1);

			}

			else {

				hm.put(c, hm.get(c) + 1);
			}

		}

		Set<Character> keySet = hm.keySet();

		for (char key : keySet) {

			if (hm.get(key) > 1) {

				System.out.println(key + " " + hm.get(key));
			}

		}

	}

	public static void circularStr(String str, int position) {

		String[] split = str.split(" ");

		if (position > 0 && position < split.length) {

			for (int i = position - 1; i < split.length; i++) {

				System.out.print(split[i] + " ");

			}

			for (int i = 0; i < position - 1; i++) {

				System.out.print(split[i] + " ");

			}
		}

		else {

			System.out.println("Invalid ");
		}

	}

	public static void drawEquilateralTraingle(int rows) {

		int noOfSpace = rows - 1;

		for (int rowCount = 0; rowCount < rows; rowCount++) {

			for (int spaceCount = 0; spaceCount < noOfSpace; spaceCount++) {

				System.out.print(" ");

			}

			noOfSpace = noOfSpace - 1;

			for (int starCount = 0; starCount <= rowCount; starCount++) {

				System.out.print("* ");

			}

			System.out.println();

		}

	}

	public static void findPosiitionOfLetter(char c) {

		/*
		 * int postion = 1;
		 * 
		 * for (int i = 'a'; i <c; i++) {
		 * 
		 * postion++;
		 * 
		 * }
		 * 
		 * System.out.println(postion);
		 */

		System.out.println((int) c - 96);

	}

	public static void lengthOfString(String str) {

		System.out.println(str.lastIndexOf(""));

	}

	public static void reverseEachWord(String str) {

		String[] split = str.split(" ");

		String rev = "";

		for (int i = 0; i < split.length; i++) { // Hello Java World --> olleH avaJ dlroW

			char[] ch = split[i].toCharArray();

			for (int j = split[i].length() - 1; j >= 0; j--) {

				rev = rev + ch[j];

			}

			rev = rev + " ";

		}

		System.out.println(rev);

	}

	private static void reversePosition(String str) {

		String[] sp = str.split(" ");

		String rev = "";

		for (int i = sp.length - 1; i >= 0; i--) {

			rev = rev + sp[i]+" ";

		}

		System.out.println(rev);

	}

	// 0 1 1 2 3 5 8 13 21 34 55...

	public static void printFibonacciSeries(int length) {

		int f1 = 0;

		int f2 = 1;

		System.out.println(f1);

		for (int i = 2; i <= length; i++) {

			f1 = f1 + f2;

			f2 = f1 - f2;

			System.out.println(f1);

		}

	}

	public static void main(String[] args) {

		System.out.println("Given number is " + checkPalindrome(55821));

		System.out.println("Given string is " + checkPalindromeString("Flipkart"));

		System.out.println(checkPalindromeInbuild("amma"));

		System.out.println(extractNumbersAdd("45$%&fjuuj12465454saghjmadsfj76328938203945"));

		swapTwoVariable(50, 105);

		SwapTwoStr("Hello", "Java");

		printFloydTriangle(10);

		findIndividualCharactersCount("arithmetic");

		circularStr("I love Java World", 5);

		drawEquilateralTraingle(4);

		findPosiitionOfLetter('y');

		printFibonacciSeries(5);

		lengthOfString("Welcome");

		reverseEachWord("Hello Java World");

		reversePosition("Hello Java World");
	}

}
