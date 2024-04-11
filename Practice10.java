/* 
super(): It is always used in the child class and is used to call the parent class(Parent constructor) member function.
And it is always written in the constructor only.

- super keyword: It is used to access the parent class variable.
- this keyword: It is used to access the current class variable.
*/

class One
{
    int x, y;

    void getParent()
    {
        System.out.println("Value of x in Parent class is " + x);
        System.out.println("Value of y in Parent class is " + y);
    }

    // Parent Constructor is called by the super() method.
    One(int a, int b)
    {
        System.out.println("Super() method is used for the addition " + (a+b));
    }
}

class Two extends One
{
    int x, y;

    void setParent(int x, int y)
    {
        super.x = x; // it point to the parent variable
        super.y = y;
    }

    void setChild(int x, int y)
    {
        this.x = x; // it point to the child or currect variable
        this.y = y;
    }

    void getChild()
    {
        System.out.println("Value of x in child class is " + x);
        System.out.println("Value of y in child class is " + y);
    }

    // It is child constructor which is used to calling the parent constructor using super() method.
    Two()
    {
        super(4,4);
    }

}

public class Practice10 
{
    public static void main (String[] args)
    {
        Two t = new Two();
        t.setParent(3,2);
        t.setChild(4,5);
        t.getParent();
        t.getChild();
    }
}