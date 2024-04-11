/* 
Constructor: it is a special function. We don't need to call it, it automatically call when the object of the class is created.

- In this the class name and the method name(constructor name) should be same. And it have no reture type.

- It is used to intialised the variables amd runs when the object is created.

- Here I have also created "constructor overloading": means multiple constructor but different pararmeters.

- Constructor can be private, to restrict the user to make the object(we will not make the object of that constructor).

Note: In every program, the contructor is always created by the compiler but it is not visible because we don't make the use of it.
*/

class Demo 
{
    int x, y;
    Demo()  // Default constructor(No-arg constructor)
    {
        x = 2;
        y = 3;
        System.out.println("Default constructor executed");
    }
    Demo(int p, int q) // Parameterised constructor
    {
        x = p;
        y = q;
        System.out.println("Parameterised constructor executed");
    }
}

public class Practice7
{
    public static void main(String[] args)
    {
        Demo d1 = new Demo();
        Demo d2 = new Demo(1,2);

        System.out.println("Value of x from No-arg const " + d1.x);
        System.out.println("Value of x from parameterised const " + d2.x);
    }
}