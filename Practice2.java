/*
How to access different variable that are:-
- static member variable: by class name or by class object.
- instance(object) member variable: by class object only.
- private static member variable or private instance member variable: by instance member function then we required class object or by static member function then we required class name only(without class objects also works).

- Static variable and method can be use in statice area as well as instance area and,
- instance variable and method can be use in instance area only.
otherwise we have to make the object for it.

Note: JVM run the main method as Practical2.main();  ,as main() method is a static member function, so it is called with the class name.
*/

class temp
{
    private int a;
    private static int b;
    void setValue() 
    {
        a = 5; // instance member variable and,
        b = 3; // static  member variable
    }

    void getValue()
    {
        System.out.println(a);
        // System.out.println(b); it will run
    }

    static void getValueByStatic()
    {
        // System.out.println(a); it will show error instance variable can't be use in static area.
        System.out.println(b);
    }
}

public class Practice2
{
    public static void main(String[] args) 
    {
        temp obj = new temp();
        obj.setValue(); // method call by using class object
        obj.getValue(); 
        temp.getValueByStatic(); // method call without using class object 
    }
}