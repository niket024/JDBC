package util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 33, 6, 78);
		int secondMax = list.stream().sorted().skip(list.size() - 2).findFirst().get();
		System.out.println(secondMax);

		int secondMax1 = list.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().get();
		System.out.println(secondMax1);
	}
}
