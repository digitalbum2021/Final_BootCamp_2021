package part_1;

public class Methods {

	public static void main(String[] args) {
		
		//Calling methods
		methodNWithoutArgument();
		methodWithArgument(2022);
		//capturing the return value from third method
		String capture = methodWithArgumentAndReturn(2021);
		System.out.println(capture);

	}
	//Method without argument
	public static void methodNWithoutArgument() {
		System.out.println("Happy New Year");
	}
	//Method with argument
	public static void methodWithArgument(int year) {
		System.out.println("Happy New Year, "+ year);
	}
	//Method with argument and return value
	public static String methodWithArgumentAndReturn(int a) {
		String wish = "Goodbye "+a;
		return wish;
	}

}
