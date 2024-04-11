/* 
Interface: It is used with the "interface" keyword. In this, variables are public, static, finalised, and methods are public and abstract by default and static we can make. 
Therefore, object is not created to access the interface.

- We use the "implements" keyword to implement the interface into a class.

- We can achieve multiple inheritance by using interface.

- Interface don't have constructor because interface already assign the value which means it do all the task of constructor then we don't need it.(Interface is not a class and it don't make the object)

- If we have to merge two interface then we have to use "extends" keyword.

- We can inherit static method and variable can be override.

Note: We can't write public, static and final before methods and variable otherwise it will give error because they are already.
*/

interface Demo
{
    int num = 1; // by default final, public and static

    void f1(); // don't define the body as it is by default public and abstract.

    static void f2() // we can define the body of static method after java 8.
    {
        System.out.println("I'm static member function in interface");
    }
}

interface Demo1 extends Demo 
{
    int num1 = 2; // Override the variable
    void f3(); // by default public and abstract
}

class MainDemo implements Demo1
{
    public void f1() // overriding method should be "public" always
    {
        System.out.println("Overriding from demo interface");
    }

    public void f3()
    {
        System.out.println("Overriding from demo1 interface");
    }
}

class Practice13
{
    public static void main(String[] args)
    {
        MainDemo md = new MainDemo();
        //Demo1 md = new MainDemo(); // we can make the reference variable of interface but can't make the object(only child class object possible). And only parent(that refered interface's) members are accessible only.
        md.f1();
        md.f3();
    }
}