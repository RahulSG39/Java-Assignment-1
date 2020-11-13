package LabAssignment1;
class A {
    int i,j;
    void showij(){
        System.out.println("i= "+i+" j= "+j);
    }
}

class B extends A{
    int a,b;
    void showab(){
        System.out.println("a= "+a+" b= "+b);
    }
    void sum(){ // Method to demonstrate Inheritance from class A
        System.out.println("Sum of i,j,a,b = "+ (i+j+a+b));
    }
    void sum(int a, int b){ //Method overloading the method sum()
        System.out.println("Sum of given 2 numbers = "+ (a+b));
    }
    void showij(){ //Method to demonstrate method Overriding
        System.out.println("Overridden value of i= "+500+" ,j= "+600);
    }
}

abstract class C{ // Abstract class
    int i = 5;
    abstract void  printMe(); // Abstract Method which will be implemented in child class D
}

class D extends C{
    final int z = 10; // Value of final variable z cannot be changed
    void printMe() {
        System.out.println("This is a method of class C implemented in class D ");
    }
//    void change(){  // This method when called with produce an error
//        z=100; // Error because final variable cannot be overriden
//    }

}

public class FourDemo{
    public static void main(String[] args) {
        A superObj = new A();
        B subObj = new B();
        D absObj = new D();
        superObj.i = 10;
        superObj.j= 20;
        System.out.println("Contents of superclass object are");
        superObj.showij();
        System.out.println();
        subObj.i = 7;
        subObj.j = 8;
        subObj.a = 9;
        subObj.b = 10;
        System.out.println("----INHERITANCE----");
        System.out.println("Members of the super class A can be inherited by subclass B");
        System.out.println("Contents of sub class objects are: ");
        subObj.showij();
        subObj.showab();
        System.out.println();
        System.out.println("Sum of i, j , a and b in subObj:");
        subObj.sum();
        System.out.println();
        System.out.println("----FUNCTION OVERLOADING----");
        System.out.println("Overloading the method sum in class B:");
        subObj.sum(5,10);
        System.out.println();
        System.out.println("----FUNCTION OVERRIDING----");
        subObj.showij();
        System.out.println();
        System.out.println("----ABSTRACT CLASS AND FUNCTION----");
        absObj.printMe();
//        absObj.change();
    }
}
