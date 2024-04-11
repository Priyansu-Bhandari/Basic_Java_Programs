/* 
Abstraction: Object is not created for abstract class. And abstract class is created by using abstract keyword.
- Method can also be abstract but it shouldn't have any body.
- If a member in a class found to be abstract then we have to make that class as abstract class.

Note: Is construct present in abstract class i.e. Demo? 
Answer is Yes, but it will execute with the help of child class constructor and by using super() method in it.
*/

abstract class Demo
{
    int x, y;
    abstract void f1();

    Demo() // It will execute with the help of child class constructor.
    {
        System.out.println("Parent's constructor");
    }
}

class Demo1 extends Demo // Demo1 also contains the abstract method f1 and because of it Demo1 also become an abstract class, so to avoid this i have use the concept overriding.
{
    void f1() // Overriding, to avoid the abstract method problem.
    {

    } 

    void f1(int a, int b) 
    {
        x = a;
        y = b;
    }

    void get()
    {
        System.out.printf("Value of a is %d \nValue of b is %d", x, y);
    }

    Demo1()
    {
        //super(); // Abstract class constructor calling
        System.out.println("Child's constructor");
    }
}

class Practice12
{
    public static void main(String[] args)
    {
        Demo1 d1 = new Demo1();
        d1.f1(2,3);
        d1.get();
    }
}