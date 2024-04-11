/*
Cursor: It is an iterator, which is used to iterate or traverse or retrieve a collections or streams obj's elements one by one. 
There are 3 types of cursor in java:
- Enumeration
- Iterator
- List Iterator

- Enumeration
It a an interface.
Only available for legacy classes(vector  and stack)
Methods:
boolean hasMoreElements()
E nextElement()

- Iterator
It is also an inteface.
It is available for all collection implemented class. 
Enumeration and interator both can move in single direction.
It has only read and remove operations are available. Not able to add and replace new obj.
Methods:
boolean hasNext()           
obj next()
void remove()

- List Iterator
It is also an inteface.
It is available for all collection implemented class. 
List interator can move in both the direction.
It has multiple operations such as read, remove, add and replace.
Methods:
boolean hasNext()                    void add(E e)    
obj(E) next()                        void set(E e)  
void remove()                        nextIndext()
boolean hasPrevious()                PreviousIndex()
obj precious()
*/

import java.util.*;

class Practice21
{
    public static void main(String[] args)
    {
        Vector v = new Vector();
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
        v.add("F");

        // Enumeration
        System.out.println("Using Enumeration");
        Enumeration k = v.elements(); // Give infomation to k.
        while(k.hasMoreElements())
        {
            System.out.println(k.nextElement());
        }

        // Iterator
        System.out.println("Using Iterator");
        Iterator i = v.iterator();
        while(i.hasNext())
        {
            // System.out.println(i.next());
            String s = (String)i.next();
            if(s == "C" || s == "A")
            {
                i.remove();
            }
            else
            {
            System.out.println(s);
            }
        }

        // List Iterator
        System.out.println("Using List Iterator.");
        ListIterator l = v.listIterator();
        // while(l.hasNext())
        // {
        //     System.out.println(l.next());
        // }

        while(l.hasNext())
        {
            String s = (String)l.next();
            if(s.equals("B"))
            {
                l.set("Java Programming");
            }
            else if(s.equals("D"))
            {
                l.add("C Programming");
            }
            else if(s.equals("E"))
            {
                l.remove();
            }
        }

        l = v.listIterator(); // Point to the first element again

        while(l.hasNext())
        {
            System.out.println(l.next());
        }
        while(l.hasPrevious())
        {
            System.out.println(l.previous());
        }
    }
}