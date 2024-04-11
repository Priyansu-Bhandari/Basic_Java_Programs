/* 
Multithreading: When multiple thread(processes) execute(run) simultaneously.
A thread is a lightweight sub-process, the small unit of processing.

- There are two to achieve it:
1) using runnable interface
2) using thread class

class Thread
{
    Thread(Runnable r1)
    {

    }
}
*/

// Using "Runnable interface"
class Process1 implements Runnable
{
    public void run() // Runnable interface has run method but it is public and abstract by default. So we havr to override it.
    {
        int i;
        for(i = 0; i <= 10; i++)
        {
            System.out.println("Process1: " + i);
        }
    }
}

class Process2 implements Runnable
{
    public void run()
    {
        int i;
        for(i = 0; i <= 10; i++)
        {
            System.out.println("Process2: " + i);
        }
    }
}

// Using "Thread class"
class Process3 extends Thread
{
    public void run() // Runnable interface has run method but it is public and abstract by default. So we havr to override it.
    {
        int i;
        for(i = 0; i <= 10; i++)
        {
            System.out.println("Process3: " + i);
        }
    }
}

class Process4 extends Thread
{
    public void run()
    {
        int i;
        for(i = 0; i <= 10; i++)
        {
            System.out.println("Process4: " + i);
        }
    }
}

class Practice14
{
    public static void main(String
    [] args)
    {
        /* Runnable interface
        Process1 p1 = new Process1();
        Process2 p2 = new Process2();
        Thread t1 = new Thread(p1);  
        Thread t2 = new Thread(p2);
        t1.start(); // Thread has start() method
        t2.start();
        */

       // Thread class
       Process3 p3 = new Process3();
       Process4 p4 = new Process4();
       p3.start();
       p4.start();

    }
}

