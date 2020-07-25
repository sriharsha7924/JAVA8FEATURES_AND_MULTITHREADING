package com.epam.java8_and_streams;
import java.util.Arrays;
import java.util.List;

public class MainClass {
public static void main(String[] args) {
	Average a=new Average();
	List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
	double s=a.calculateaverage(primes);
	System.out.println("Average:" +s);
	List<String> str=Arrays.asList("abc","axe","ball","ant","aeroplane","zebra");
	ListWithParticularStartLetterAndLength sl=new ListWithParticularStartLetterAndLength();
	List<String> k=sl.SelectedList(str);
	System.out.println("List starts with 'a' and of length 3:" + k);
	List<String> p=Arrays.asList("radar","apple","oxo","cedar","pop");
	PalindromeList pal=new PalindromeList();
	List<String> palindrome=pal.palindromes(p);
	System.out.println(palindrome);
}
}
