package com.epam.java8_and_streams;
import java.util.*;
public class Average {
	public double calculateaverage(List<Integer> primes) {
		//List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
	    OptionalDouble average = primes
	            .stream()
	            .mapToDouble(a -> a)
	            .average();
      return average.getAsDouble();
	  
	}
}
