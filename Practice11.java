/* 
Polymorphism: One thing present in many forms.
Compiler has to decide which process is to be executed during compile time.

Method overloading: Many methods present with a same name but different arguments.

Method Overriding: Method with the same name and argument but present in the different classes(parent and child class).
*/

class Parent
{
    void f1() 
    {
        System.out.println("I'm Parent function 1");
    }

    void f1(int num) 
    {
        System.out.println("I'm Parent function " + num);
    }
}

class Child extends Parent
{
    void f1() 
    {
        System.out.println("I'm Child function 1");
    }
}

class Practice11
{
    public static void main(String[] args)
    {
        System.out.println("Here overriding exectes");
        Child ch = new Child(); 
        ch.f1(); // Overriding

        System.out.println("\nHere overloading exectes");
        Parent pa = new Parent(); 
        pa.f1();  // Overloading
        pa.f1(2); // Overloading
    }
}