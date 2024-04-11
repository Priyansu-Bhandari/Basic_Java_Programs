/* 
Inheritance: it gives the feature that is reusability.
It is used with the "extends" keyword.

- Types: single level, multi level, hierarchical and hybrid.

- multiple inheritance is also there but the main drawback is that if the parents have the same member then child will be confused. So it can be achieved only with the interface.

- Interface: It is used with the "interface" keyword. In this, variables are public, static, finalised, and methods are public and abstract by default and static we can make. 

- super(): It is always used in the child class and is used to call the parent class(Parent constructor). 
*/

class Nokia // Parent class
{
    int camera;
    int video;

    void feature() 
    {
        camera = 1;
        System.out.println("Parent method exexuted");
        System.out.println("camera is "+ camera);
        System.out.println("video is "+ video);
    }
}

class Nokia2 extends Nokia  // Child class
{
    // super(); This super keyword is already created by the compiler for the parent class constructor.
    int mic;
    int senser;

    void features()
    {
        senser = 1;
        mic = 1;
        System.out.println("Child method exexuted");
        System.out.println("Mic is " + mic);
        System.out.println("Senser is "+ senser);
    }
}

public class Practice8
{
    public static void main(String[] args)
    {
        Nokia2 n2 = new Nokia2();
        n2.feature();
        n2.features();
    }
}