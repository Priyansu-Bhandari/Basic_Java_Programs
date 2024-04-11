/* 
Java is almost 100% oop and to make the java pure oop(100% oop) we use wrapper class.
Wrapper class: wrap the primitive datatypes in an object.

In oop, there should be a class and object and every member in a class can be access only by the object of the class.(But in class to initalise the variable we can do, int x = 5; which voilates the oop concept.)

class Integer
{
    static int parseInt()
    {

    }
    static Integer valueOf()
    {
        It is also used to convert into an integer but the value is pointed by an object, which can't be print directly, so we have to use intvalue method.
    }
    int intvalue() 
    {
        It is used with object as it is an instance member function.
    }
}

Integer.parseInt(): convert into an integer.
Double.parseDouble(): convert into a double.
Float.parseFloat(): convert into a float.
*/

public class Practice3
{
    public static void main(String[] args)
    {
        // Converting string into an integer.
        int num = Integer.parseInt("123");
        System.out.println(num);

        // Now converting binary into an integer.
        Integer ref = Integer.valueOf("111",2); //ref is a reference variable.
        int num2 = ref.intValue();
        System.out.println(num2);

        // Coverting integer into double.
        double num3 = Double.parseDouble("65");
        System.out.println(num3);

        // Coverting integer into double.
        float num4 = Float.parseFloat("6");
        System.out.println(num4);
    }
}