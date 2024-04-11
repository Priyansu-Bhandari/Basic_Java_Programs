/* 
Command line arrgument: pass parameters to a program(command line) when it is executing.

By using command line argument, I'm going to calculate an average of the numbers.
And we can even change the args to any name.
*/

public class Practice4
{
    public static void main(String[] args)
    {
        int i; 
        float sum = 0;
        for(i = 0; i < args.length; i++)
        {
            sum += Integer.parseInt(args[i]);
        }
        float avg = sum/args.length;
        System.out.println("Average is " + avg);
    }
}