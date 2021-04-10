package functionalInterfaces1;

import java.util.function.Function;

public class FunctionEg {
	public static void main(String[] args) {
		
		Function<Integer,Integer> obj = (a) -> (a*a*a);
		System.out.println("The cube of the variable " +obj.apply(5));
		
		Function<String,Integer> obj1 = name1 -> name1.length();
		System.out.println("The length of the String " +obj1.apply("Daddy"));
		int j = obj1.apply("DNA");
		System.out.println("The length of the String "+j);

		Function<Integer,Integer> obj2 = a -> a*a;       //36
		//System.out.println("The square of the value is - "+obj2.apply(7));
		
		Function<Integer,Integer> obj3 = b -> b*b;  //36
		//System.out.println("The value of is - "+obj3.apply(3));
		
		Function<Integer,Integer> combo = obj2.andThen(obj3); 
		System.out.println("Using andThen() method "+combo.apply(6));         //36*36 = 1296
		
		Function<Integer,Integer> obj4 = a -> a*2; //2*2 =4
		Function<Integer,Integer> obj5 = b -> b*b*b;  //4*4*4 = 64
	    Function<Integer, Integer> combo1 = obj4.andThen(obj5); 
		System.out.println(combo1.apply(5));
		
		System.out.println("Using compose() method "+obj4.compose(obj5).apply(2));
		
		Function<String,String> obj6 = a -> a.substring(4, 8);
		System.out.println(obj6.apply("Hello World"));
	
}
	public int cube1(int a) {
		return a*a*a;
	}
	
	void FindLength (String name1) {
	//	return name1.length();
		System.out.println(name1.length());
	}
}
