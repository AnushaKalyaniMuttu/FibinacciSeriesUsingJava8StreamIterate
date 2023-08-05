package com.demo;

import java.util.stream.Stream;

public class FibonacciSeriesUsingJava8StreamIterate {

	public static void main (String [] args) {
			
        int n = 10; // The number of Fibonacci numbers you want to generate
        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(n)
                .map(fib -> fib[0])
                .forEach(System.out::println);
	}
}
