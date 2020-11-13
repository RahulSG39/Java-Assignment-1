package LabAssignment1;

interface FiveStack {
    void push(int item);
    int pop();
}
public class FixedStack implements FiveStack {
    private int[] stack;
    private int tos;
    FixedStack(int size)
    {
        stack=new int[size];
        tos=-1;
    }
    public void push(int item)
    {
        if(tos==stack.length-1)
            System.out.println("stack is full");
        else
            stack[++tos]=item;
    }
    public int pop()
    {
        if(tos<0)
        {
            System.out.println("stack underflow");
            return 0;
        }
        else
            return stack[tos--];
    }
    public static void main(String[] args) {
        FixedStack mystack1=new FixedStack(5);
        FixedStack mystack2=new FixedStack(8);
        for(int i=0;i<5;i++) mystack1.push(i);
        for(int i=0;i<8;i++) mystack2.push(i);
        System.out.println("stack in mystack1");
        for(int i=0;i<5;i++)
            System.out.println(mystack1.pop());
        System.out.println("stack in mystack2");
        for(int i=0;i<8;i++)
            System.out.println(mystack2.pop());

    }
}