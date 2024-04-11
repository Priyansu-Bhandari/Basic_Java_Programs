/*
The program is created to understand the static and non-static members whether a variable or function(method).
In static, members are used with or without the class object(mostly used with class name) but,
Non-static members are always used with the class object.

Note: In class, The first alphabet of a class name should be in uppercase.
*/

class External
{
    int temp;  // non-static member variable
    void method1()  // non-static(object/ instance) member function
    {
        System.out.println("Method1 under the non-static member function.");
    }	

    static void method2()  // static member function
    {
        System.out.println("Method2 under the static member function.");
    } 
} 

public class Practice1 
{
    static int temp = 1; 
    void method1()
    {
        System.out.println("Method1 under the non-static member function.");
    }	

    static void method2()
    {
        System.out.println("Method2 under the static member function.");
    }

    public static void main(String[] args)
    {
        System.out.println("In internal class");
        Practice1 obj1 = new Practice1();
        obj1.method1();
        Practice1.method2();
        System.out.println(Practice1.temp + "\n");

        System.out.println("In external class");
        External obj2 = new External();
        obj2.method1();
        External.method2();
        System.out.println(obj2.temp);
    }
}