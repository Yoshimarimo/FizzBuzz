
public class FizzBuzz {

	public static String fizzBuzz(int num){


		if( num == 0 ){
			System.out.println("0");
			return "null";
		}else if( num % 3 == 0 && num % 5 == 0 ){
			System.out.println("FizzBuzz");
			return "FizzBuzz";
		}
		else if( num % 3 == 0 ){
			System.out.println("Fizz");
			return "Fizz";
		}
		else if( num % 5 == 0 ){
			System.out.println("Buzz");
			return "Buzz";
		}
		else{
			System.out.println(num);
			String str = String.valueOf(num);
			return str;
		}
	}
}
