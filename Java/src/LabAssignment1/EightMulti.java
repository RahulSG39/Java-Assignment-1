package LabAssignment1;

public class EightMulti {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 5;
            a = 50 / d;
            int[] c = { 10 };
            c[100] = 5;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index Out of bounds: " + e);
        }
        System.out.println("After catch statement(s)");
    }
}
