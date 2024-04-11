package Practice5;

/* Package : It is a collection of multiple classes and method which can be access in any program.
It is created by the "package" keyword.

"javac -d . MyPackage.java" 
This command is used to create package folder in the given directory.
where, -d : Directory and . : current Directory
*/

// package Package1;
public class MyPackage  
{
    private int a;
    private int b;

    public void setValue(int x, int y)
    {
        a = x;
        b = y;
    }

    public void getValue()
    {
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);
    }
}