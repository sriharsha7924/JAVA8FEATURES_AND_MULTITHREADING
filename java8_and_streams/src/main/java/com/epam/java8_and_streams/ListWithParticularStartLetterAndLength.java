package com.epam.java8_and_streams;
import java.util.List;
import java.util.stream.Collectors;
public class ListWithParticularStartLetterAndLength {

	public List<String> SelectedList(List<String> str) {
		List<String> k= str.stream() .filter(x -> x.length()== 3&& x.startsWith("a")).collect(Collectors.toList());
		return k;
	}
	}
