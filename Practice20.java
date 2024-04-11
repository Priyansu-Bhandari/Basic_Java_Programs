/*
Types: Set is an interface and an unordered collection of objects in which duplicate values can't be store(add() method returns  false).
HashSet- It is a hash table and HashTable is a data Structure. Searching Complexity is O(n).
- Heteroggenous data can be used. We can increase the load factor(by defact load factor is 75%).
- Size increase by double.
- Methods in Hashset:
HashSet(int capacity)
HashSet(int capacity, Float loadFactore)
HashSet(Collection c)

- Linked HashSet
Child class of HashSet. 
HashSet and double linked list both are used(Hybrid Data Structure).
Same Default load factor as hashset.

- SortedSet
It is also an interface.
Duplicates are not allowed. 
Elements are in sorted ordered.
- Methods in SortSet:
first()                                 subSet(E from element, E to element)                   
last()                                  comparator()
headSet(E to element)                   ceiling()
tailSet(E to element)                   floor()

- Methods in NavalSet:
higher(E e)                             ceiling()
lower(E e)                              floor() 
pullFirst() 
*/

import java.util.*;

class Practice20
{
    public static void main(String[] args)
    {
        HashSet hs = new HashSet(); // Unevev Sequence of the data

        hs.add("C+");
        hs.add("Core Java");
        hs.add("Python");
        System.out.println(hs);
    }
}