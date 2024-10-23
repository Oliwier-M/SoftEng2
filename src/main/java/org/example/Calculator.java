package src.main.java.org.example;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(division(5, 2));
    }

    public static int addition(int x, int y){
        return x + y;
    }

    public static int subtraction(int x, int y){
        return x - y;
    }

    public static int multiplication(int x, int y){
        return x * y;
    }

    public static double division(double x, double y){
        if(y==0){
            throw new RuntimeException("Cannot divide by 0");
        }else {
            return x / y;
        }
    }
}
