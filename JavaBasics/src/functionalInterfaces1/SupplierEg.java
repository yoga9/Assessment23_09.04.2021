package functionalInterfaces1;

import java.util.Date;
//import java.util.Random;
import java.util.function.Supplier;
//import java.util.stream.Stream;

public class SupplierEg {
	
	public static void main(String[] args) {
		
//		SupplierEg obj = new SupplierEg();         //Date cannot be resolved to a variable
//		obj.getDate();
		
		// () -> Date;
		
	  Supplier<Date> result = () -> new Date();   //Example1 -- Date
	  System.out.println(result.get());	
	  
	  Date a = result.get();
	  System.out.println(a);
		
//		() -> {
//			return Date;
//		};
	  
	  Supplier<String> o1 = () -> {             //Example2 -- OTP
			String otp = "";
		
		for(int i = 0; i<4; i++ ) {         //Otp -- 4digit no for iteration we use thz
			// otp = otp + i;
			otp = otp + (int) (Math.random() * 10);     //0.2*10 = 2 , 0.2*100 = 20
		}
		return otp;
	  };
	  System.out.println("The OTP Number is : "+o1.get());
	  System.out.println("The OTP Number is : "+o1.get());
	  System.out.println("The OTP Number is : "+o1.get());
	  System.out.println("The OTP Number is : "+o1.get());
	  
	System.out.println();
	
	  Supplier<Integer> empId = () -> {         // //Example2 -- EmployeeId
		  int EmployeeId = 0;
		  
		  for(int i = 1; i<7; i++) {
			  EmployeeId = EmployeeId + (int) (Math.random() * 100000);
		  }
		  return EmployeeId;
	  };
		  System.out.println("The EmployeeId is : "+empId.get());
		  System.out.println("The EmployeeId is : "+empId.get());
		  System.out.println("The EmployeeId is : "+empId.get());
	 
	  
	
	
	//  Supplier<Integer> EmpId1 = () -> new Random().nextInt(10);    //generate no's
	 // Stream.generate(EmpId1).limit(5).forEach(System.out::println);
	
	}

	//	Date getDate() {
//		return Date;
//	}
	
	
	
}
