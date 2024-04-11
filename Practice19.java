/*
Collection in java is the base interface. It represent the set of classes and interfaces.
The collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

- Types are:
1) List : ArrayList, LinkedList, Vector->Stack(Legacy Class) (Mentain the order using index)
2) Set : HashSet->LinkedHashSet, SortedSet->NavigableSet->TreeSet (Set can't mentain the order)
3) Queue : Priority Queue, Blocking Queue->Priority Blocking Queue and Linked Blocking Queue

- Java has "collections class", which is very used for different operations as it has pre-defined methods.
- Every child class(list, set, vector and many) hold the features of parent class as well.

- Methods in collection interface:
boolean add(obj)                        int size()
boolean addAll(collection)              boolean conatins(obj)
boolean remove(obj)                     void clear()
boolean removeAll(collection)           boolane isEmpty()
boolean retaiinAll(collection)          Iterator iterator()

- Methods in list:
void add(int index, E element)          datatype remove(int index)
datatype get(int index)                 List<datatype> subList(int from index, int to index)
int indexOF(obj)
int lastIndexOF(obj)

- Methods in ArrayList:
defined using dynamic arrays            order of elements are preserved
resizable                               null insertion possible
duplicates are allowes                  Heterogenous obj are allowed

- Methods in LinkedList:
void addFirst(obj)                      obj removeFirst()
void addLast(obj)                       obj removeLast()
obj.getFirst()
obj.getLast()


- Array is faster in terms of searching but linded list faster in terms of insertions and deletion.
- Vector is thread safe and its methods are synchronized, low performance as compare to ArrayList.

- Mehods in Vector:
void addElement(obj)                    copyInto(obj[] array)
clear()                                 elements()
clone()                                 int capacity()
contain(obj)                            boolean equals(obj)
containAll(obj)

- Stack works on LIFO approach.
- Methods in stack:
obj.push()                             obj.empty()
obj.pop()                              obj.search()
obj.peek() 

Note: ArrayList size increases automaitcally(one by one) after mentioning the size and any type of date can be store. 
In Vetor, the size increases exponentially(double the original size).

*/

import java.util.*;
class Practice19
{
    public static void main(String[] args) 
    {
        // ArrayList
        ArrayList arr = new ArrayList(5);
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add(2, "G");
        
        Iterator i1 = arr.iterator();
        while(i1.hasNext())
        {
            String s = (String)i1.next();
            if(s != "B")
            {
                System.out.println(s);
            }
        }

        System.out.println(arr);

        // LinkedList
        LinkedList l1 = new LinkedList();
        l1.addFirst("Hello");;
        l1.addLast("World");
        l1.add(1, "Welcome");
        System.out.println(l1.getFirst());
        System.out.println(l1.get(1));
        System.out.println(l1.getLast());

        // Vector
        Vector v = new Vector(); // During size increase, Double size increases of the previous size.

        // Stack
        Stack st = new Stack();
        st.push(10);
        st.push(30);
        st.push(40);
        st.push(20);
        System.out.println(st.search(40));
    }
}