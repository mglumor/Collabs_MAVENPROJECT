package collabs_javacode_March_26_2023;

public class MethodsInJava {
	
	//Methods are also known as functions
	//Methods are known as independent units of execution
	//accessmodifier static/non-static returnType nameOfTheMethod(){
	//}

	public static void main(String[] args) {
		System.out.println("This is the main method");
		hello();
		
	}
	
	
	private static void hello() {
		System.out.println("Hello");
		
	}


	public static int sample(int i, int j) {
		i = 10;
		j = 20;
		int k = 30;
		
		int sum = i+j+k; //60
		System.out.println(sum);
		return sum; //what are we trying to return??
	}
	
	public static void Stringtest() {
		
	}
	
	public static void clickOnSigninLink() {
		
	}
	
	public static void enterLoginCredentials() {
		
	}

}
