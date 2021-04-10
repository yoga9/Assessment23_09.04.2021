package functionalInterfaces1;

import java.util.Date;
import java.util.function.Consumer;

//interface disp1{
//	public String disp(String name);
//}
public class ConsumerEg {
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
	/* disp1 o = name -> {
		return name;
	};
	System.out.println(o.disp("France"));
  */
		
//		 ConsumerEg obj = new  ConsumerEg();
//		 System.out.println(obj.disp("VeeTech"));
		
		
	 Consumer <String> conObj = (name) -> System.out.println("The name of the String is - " +name);
	 // System.out.println(conObj.accept("Hello World !!! Thz is amazing"));	//error 
	 conObj.accept("Hello World !!!");
	
	
	Consumer <Integer> conInt = (i) -> System.out.println("The Integer1 value is equals to zero " +(i%2 == 0));
	conInt.accept(2);
	
	

	Consumer <Integer> conInt1 = (i) -> {
	if(i%2 == 0) {
		System.out.println("Even");
		//return true;          //error  -- Void methods cannot return a value;
	}
	else 
		System.out.println("Odd");
	    //return false;
	};
	//System.out.println("Even");
	
	conInt1.accept(3);
	
    Consumer <String> conStr1 = s -> System.out.println("The String value is having " +s.contains("Vee"));
    conStr1.accept("VeeTech");
    
    Consumer <Integer> conInt2 = i1 -> System.out.println("The Integer2 value is " +5*5*i1);
    conInt2.accept(6);
    
    Consumer <Integer> conInt3 = i2 -> System.out.println("The Integer3 value is " +4*i2);  
    Consumer <Integer> conInt4 = i2 -> System.out.println("The Integer4 value is " +4+i2);   
    
//    Consumer <Integer> conIntObj = conInt3.andThen(conInt4); //cant able to do thz wzy
//   System.out.println(conIntObj.accept(2));
    
    conInt3.andThen(conInt4).accept(3);   //method 1
    
    conInt3.andThen(i-> System.out.println("The Integer5 value is "+ 3*i)).accept(5);    //method 2
    
    Consumer <Integer> dObj = i -> System.out.println("The Date is - "+i);
    dObj.accept(new Date().getDate());
    
    
    Consumer<Boolean> val = i -> System.out.println("The boolean value is - "+i);
    val.accept(5%2 == 0);
    
	}
//	public String disp(String name) {
//		return name;
//	}

}
	
