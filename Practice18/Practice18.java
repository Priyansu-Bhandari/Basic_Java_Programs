/* 
File Handling: How we store the available data or info in a file with the help of a program.

- Three logical steps of File Handling:
Opening a file: bring it to the RAM.
Processing
Closing a file: save and close the file.
*/

import java.io.*;

class Practice18
{
    public static void main(String[] args) throws IOException
    {
        // File f = new File("demo.txt");
        // System.out.println(f.exists());
        // System.out.println(f.canWrite());
        // System.out.println(f.length());

        // f.createNewFile(); // It is used to create a file and name of the file mention in the object creation time.

        // FileOutputStream operations:
        // FileOutputStream(File f)
        // FileOutputStream(File f, Boolean append) // by default append is false
        // FileOutputStream(String path)
        // FileOutputStream(String path, Boolean append) 

        // FileOutputStream file = new FileOutputStream(f);

        // file.write('c'); // we can write only single character

        FileOutputStream file1 = new FileOutputStream("demo.txt", true); // now append is true which means, it will not erase the previous data.

        String s = "I am back";
        char ch[] = s.toCharArray();
        int i;

        for(i = 0; i < ch.length; i++)
        {
            file1.write(ch[i]);
        }
        
        file1.close();
    }
}