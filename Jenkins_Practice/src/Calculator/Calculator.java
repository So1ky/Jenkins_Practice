package Calculator;

public class Calculator {
	
	public static void main(String[] args) {
        System.out.println("Hello, Jenkins!");
        System.out.println("1 + 4 = " + add(1, 4));
    }

    static int add(int a, int b) {
        return a + b;
    }
}
