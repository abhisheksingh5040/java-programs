package java_dsa.basic;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {

	public static void main(String[] args) {
		// int[] arr = {1,4,3,6,18,9};
		// number(arr);
//		List<String> list  = Arrays.asList("Java","Hibernate","Spring");
//		String join = String.join(";", list);
//		System.out.println(join);
//		
//		List<String> asList = Arrays.asList(join.split(";"));
//		System.out.println(asList);
//		int count = 1;	
//		}

	}

	public static void number(int[] arr) {
		List<Integer> number = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Integer max = Arrays.stream(arr).boxed().max((a, b) -> (a - b)).get();
		Integer min = Arrays.stream(arr).boxed().min((a, b) -> (a - b)).get();

		IntStream.rangeClosed(min, max).filter(num -> !number.contains(num)).forEach(System.out::println);
	}
}
