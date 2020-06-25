package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02Card {
	public static void main(String[] args) {
		List<String> first = Arrays.asList("2 cơ", "xì rô", "10 bích");
		List<String> second = Arrays.asList("3 cơ", "xì cơ", "8 bích");
		List<String> third = Arrays.asList("4 cơ", "xì chuồn", "2 bích");
		// List<String> fourth = Arrays.asList("5 cơ","xì bích","7 rô");

		List<List<String>> all = Arrays.asList(first, second, third);
		String result = all.stream().flatMap(list -> list.stream()).filter(card -> card.startsWith("2"))
				.collect(Collectors.joining(", "));
		System.out.println("result: " + result);
		System.out.println("======================");
		Arrays.stream(squareOf(1,2,3,4,5)).forEach(System.out::println);
	}

	private static int[] squareOf(int... numbers) {
		return Arrays.stream(numbers).map(num -> num * num).toArray();
	}

	private static List<Integer> squareOf(List<Integer> numbers) {
		return numbers.stream().map(num -> num * num).collect(Collectors.toList());
	}
}
