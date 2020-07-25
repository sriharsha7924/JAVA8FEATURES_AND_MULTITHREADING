package com.epam.java8_and_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PalindromeList {
public List<String> palindromes(List<String> p) {
	List<String> s=new ArrayList<>();
	for(int k=0;k<p.size();k++) {
		if(isPalin(p.get(k))) {
			s.add(p.get(k));
		}
	}
	
	return s;
}
private boolean isPalin(String string) {
	   String tempString = string.replaceAll("\\s+", "").toLowerCase();
		 
       return IntStream.range(0, tempString.length() / 2).noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));
}

}