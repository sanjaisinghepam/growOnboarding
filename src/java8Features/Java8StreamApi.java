package java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Java8StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> gamesList = Arrays.asList(12,60,30,48,50);
		
		//gamesList.stream().forEach(value -> System.out.println(value));
		
		//map , reduce , filter, findfirst , orelse method of stream api
		BinaryOperator<Integer> bo = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return u=t+u;
			}
		};
		
		System.out.println(gamesList.stream()
				 .filter(i -> i%5==0)
				 .filter(i -> i >= 100)
				 .findFirst()
				 .orElse(100));
				 
		
		
		
		

	}

}
