/* Another Package which is having the main method. And I will import my Package1(User defined package) which is already create by me.
*/

package Practice5;

public class MyPackage2
{
    public static void main(String[] args)
    {
        MyPackage my = new MyPackage();
        my.setValue(3,4);
        my.getValue();
    }
}
