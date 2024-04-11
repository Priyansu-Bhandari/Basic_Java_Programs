/*
Exception Handling: It is the process of responding to unwanted or unexpected events when a computer program runs.(To avoid from terminating the program)
Example: 
- Runtime Exceptions (unchecked exception) are Arithmetic, ArrayIndexOutOfBound, NullPointer Exception and so on.
- Compile time exceptions(checked exception) are classNotFound, InputOutputException, SQLException etc.

Syntax mistake then no compile and,
Logical mistake then not execute(run).

- Java exception keywords: try, catch, finally, throw, and throws.

- Throwable class has two methods that are getMessage() and setMessage();

- "finally" will work whether an exception is present or not. But finally is present with the try block. 

- "throw" is used to create the custom error(user defined error) and is also used to set the error message

-"throws" is used to declare an exception or told java, be ready to tackle the given exception. It works with try-catch block. It is used in signature of the method.
*/

class Demo
{
    static void f1() throws Exception // Making whole method error free by using throws keyword which tells the java to handle or tackle the upcoming exception.
    {
        System.out.println(2/0);
    }
}

class Practice16
{
    public static void main(String[] args)
    {
        String s = null;

        // System.out.println(s.length()); It shows an error because it's not present in the try block, so it'll catch by the java only(and terminate the program).
        
        //Using try-catch and finally keywords-
        try
        {
            System.out.println(s.length());
        }
        catch(NullPointerException e) //catch(Exception e): It will catch all the exceptions.
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("I'm a finally body. I don't care about the exception.");
        }

        // Using throw keyword-
        int i = 5;
        try
        {
            if(i > 0)
            {
                throw new Exception("Value is not equal.");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        // Using throws keyword:
        try
        {
            Demo.f1();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}