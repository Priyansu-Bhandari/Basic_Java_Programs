/*
A thread is a lightweight sub-process, the small unit of processing.

- States of thread:
1) New thread(Born)- Whenever the new thread is created then it is in born state. And after this it will go to the runnable state only.
It has only two methods start() and stop() otherthen that it will show illegal thread exception.

2) Runnable- When thread is going to run then it is in the runnable state.
Running state is calling by run() method.

3) Not Runnable- When thread is not running or waiting.

4) Switching from not runnable to runnable- resume(), notify() and notifyAll() and when the process taken the inputs from the user then this state also come.

5) Dead- when the thread is going to ends its all function. 
Thread calls the stop() method to end that thread.

- Thread Priority: Give the priority to a thread. Some of it's functions(methods) are:
1. setPriority()
2. getPriority()
3. MIN_PRIORITY (predefine static variable) or we can use 0 during object creation: lowest Priorty set
4. NORM_PRIORITY or 5: Default priority
5. Max_PRIORITY or 8: Highest priority

Note: Synchronized keyword is used to sync the two different thread or processing.
*/

// Creating a program in which two customer withdraw the ammount from a single account but in a synchronized manner.
// Note: When we start two or more threads within a program, there my be a situationwhen multiple threads try to access the same resource. So there is a need of synchronization, the action of multiple treads and make sure that the only one thread can access the resource at a given point in time.

import java.util.*;

class Account
{
    int balance;
    Account(int bal)
    {
        balance = bal;
    }

    boolean isSufficientBal(int withdrawBal)
    {
        if(balance >= withdrawBal) return true;

        else return false;
    }

    void withdraw(int amt, String customerName)
    {
        balance -= amt;
        System.out.println(customerName + " Transaction Successful.");
        System.out.println(customerName + " Current balance is " + balance + "\n");
    }
}

class Customer implements Runnable
{
    Account a1;
    String customerName;
    Customer(Account x1, String customerName)
    {
        this.a1 = x1;
        this.customerName = customerName;
    }

    public void run()
    {
        Scanner sc = new Scanner(System.in);
        synchronized(a1)
        {
            System.out.print("Enter amount to withdraw for " + customerName + " : ");
            int amt = sc.nextInt();
            if(a1.isSufficientBal(amt))
            {
                a1.withdraw(amt, customerName);
            }
            else
            {
                System.out.println("Insufficient Balance.");
            }
        }
    }
}

class Practice15
{
    public static void main(String[] args)
    {
        Account acc = new Account(10000);
        Customer c1 = new Customer(acc, "Customer 1");
        Customer c2 = new Customer(acc, "Customer 2");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}