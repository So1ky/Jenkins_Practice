package Calculator;

public class Calculator {
	
	public static void main(String[] args) {
        System.out.println("Hello, Jenkins!");
        System.out.println("Hello");
        System.out.println("1 + 4 = " + add(1, 4));
        System.out.println("10 - 3 = " + subtract(10, 3));
        System.out.println("2 * 6 = " + multiply(2, 6));
        System.out.println("8 / 2 = " + divide(8, 2));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }
}
