package functionalInterfaces1;

import java.util.function.BiFunction;

public class BiFunctionEg {
	public static void main(String[] args) {
		
		BiFunction<String,String,String> biObj = (a,b) -> {
			return a.concat(b);
		};
		System.out.println("The concatnation of string - "+biObj.apply("Hello ", "World"));
		
		BiFunction<Integer,Integer,Boolean> biObj1 = (a,b) -> (a>b);
		System.out.println(biObj1.apply(4, 5));
		BiFunction<Integer,Integer,Boolean> biObj2 = (a,b) -> (a%b == 0);
		System.out.println(biObj2.apply(2, 3));
	}
}
