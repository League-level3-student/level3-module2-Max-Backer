package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		String product = num1 + " x " + num2 + " = " + Math.multiplyExact(num1, num2);
		return product;
	}

	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;
			}
		}
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> list) {
		Double biggestNumber = list.get(0);

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > biggestNumber) {
				biggestNumber = list.get(i);
			}
		}
		return biggestNumber;
	}

	public static String findLongestWord(List<String> words) {
		int longestWord = words.get(0).length();
		String word = words.get(0);

		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longestWord) {
				longestWord = words.get(i).length();
				word = words.get(i);
			}
		}
		return word;
	}

	public static boolean containsSOS(List<String> code) {
		for (int i = 0; i < code.size(); i++) {
			if (code.get(i).equals("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int j = 0; j < results.size(); j++) {
			for (int i = 0; i < results.size() - 1; i++) {
				if (results.get(i) > results.get(i + 1)) {
					double temp = results.get(i);
					results.set(i, results.get(i + 1));
					results.set(i + 1, temp);
				}
			}
		}
		return results;
	}

	public static List<String> sortDNA(List<String> dna) {
		for (int i = 0; i < dna.size(); i++) {
			for (int j = 0; j < dna.size() - 1; j++) {
				if (dna.get(j).length() > dna.get(j + 1).length()) {
					String temp = dna.get(j);
					dna.set(j, dna.get(j + 1));
					dna.set(j + 1, temp);
				}
			}
		}
		return dna;
	}

	public static List<String> sortWords(List<String> words) {
		return words;
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSquare(int num) {
		int root = (int) Math.sqrt(num);

		return root * root == num;
	}

	public static boolean isCube(int num) {
		int root = (int)Math.cbrt(num);
		
		return root * root * root == num;
	}
}
