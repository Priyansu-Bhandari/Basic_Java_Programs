/* 
this: this keyword is always present in method or constructor and that point to the object variables(instance member variable).
It is used to eliminate the confusion b/w class attributies and parameter with the same name.

Note: this points to the instance member variable or "current object".
*/

class Example
{
    private int x, y;
    void set(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    void get()
    {
        System.out.println("Value of x " + this.x);
        System.out.println("Value of y " + this.y);
    }
}
public class Practice9
{
    public static void main(String[] args) 
    {
        Example ex = new Example();
        ex.set(3,4);
        ex.get();
    }
}