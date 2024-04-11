/* 
Introduction to GUI(Graphical user interface)
It can be achieve by two ways:
- using awt(Abstract windowing toolkit) : An API to develop GUI aoolications in java. It is a plateform-dependent API to develop GUI or window-based applications in java.

- using Swing(come after AWT): A part of java foundation classes and is used to create various applications. It has plateform-independent components.
AWT act as a parent class and swing has a child classes of AWT parent classes such as:
Label -> JLabel
TextField -> JTextField and soon.

Swing flowchart:
object - Components 
Container - JFrame, JPanel
JComponents - JLabel, JButton, JCheckbox, JRadioButton, JTextField, JTextArea and many more.

- I'm using ActionListener interface, MouseListener interface and used one of it's abstract method that is actionPerformed(ActionEvent e) and mouceClicked(MouseEvent e) respectively.
*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Practice17 extends JFrame
{
    public static void main(String[] args)
    {
        // Directly using the swing classes-
        // JFrame frame = new JFrame("Welcome to Swing");
        // frame.setSize(500,500);
        // frame.setVisible(true);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Now using by creating the objects of the main class and inherit the classes of the swing components.
        Practice17 frame = new Practice17("Welocme to Swing");
        frame.setSize(700, 700);
        frame.setVisible(true);
        frame.setComponents();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    JLabel l1, l2, l3, l4, l5;
    JTextField t1;
    JPasswordField t2; // for bullet points(during compile it will show notes, just ignore and run)
    JButton b1, b2, b3;

    Practice17(String title)
    {
        super(title);
    }

    void setComponents()
    {
        // Cursor Setting
        Cursor c1 = new Cursor(Cursor.HAND_CURSOR); // Cursor class is present in the awt package.
        Cursor c2 = new Cursor(Cursor.WAIT_CURSOR);
        Cursor c3 = new Cursor(Cursor.CROSSHAIR_CURSOR);

        // Font Setting
        Font f1 = new Font("Times New Roman", Font.BOLD, 28);
        Font f2 = new Font("Callibri", Font.ITALIC, 16);

        // Image Setting
        // ImageIcon img = new ImageIcon(PicURL);
        // l1.setIcon(img);

        l1 = new JLabel("Loging Screen");
        l1.setFont(f1);
        l1.setForeground(Color.BLUE); // Changing the text(label) color.

        l2 = new JLabel("USERNAME");
        l2.setFont(f2);
        l2.setForeground(Color.RED); 

        l3 = new JLabel("PASSWORD");
        l3.setFont(f2);
        l3.setForeground(Color.RED); 

        l4 = new JLabel();
        l5 = new JLabel();
        t1 = new JTextField();
        t2 = new JPasswordField();
        
        b1 = new JButton("Login");
        b1.setCursor(c1);
        // b1.setBackground(Color.RED); // Changing button background color
        // b1.setForeground(Color.ORANGE); // Changing button text color

        b2 = new JButton("Clear");
        b2.setCursor(c2);

        b3 = new JButton("ADD");
        b3.setCursor(c3);
        // b3.setBackground(Color.RED);
        // b3.setForeground(Color.ORANGE);

        setLayout(null);
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);

        // Seting the position and size of the components
        l1.setBounds(260,50,300,30); //(x-coordinate, y-coordinate, width, height)
        l2.setBounds(200,200,100,30);
        l3.setBounds(200,350,100,30);
        l4.setBounds(300,550,300,30);
        l5.setBounds(300,580,400,30);
        t1.setBounds(400,200,100,30);
        t2.setBounds(400,350,100,30);
        b1.setBounds(150,450,100,30);
        b2.setBounds(300,450,100,30);
        b3.setBounds(450,450,100,30);

        // Adding actionListener
        b1.addActionListener(new log());
        b2.addActionListener(new clear());
        b3.addActionListener(new add());

        // Adding mouseListener
        l1.addMouseListener(new mousel());
    }

    class log implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String s1 = t1.getText();
            String s2 = t2.getText();

            if(s1.equals("coding") && s2.equals("123"))
            {
                JOptionPane.showMessageDialog(null, "Login Successful"); // Prompt screen
                l4.setText("Login Successful");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Login Unsuccessful");
                l4.setText("Login Unsuccessful");
            }
        }
    }

    class clear implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            t1.setText("");
            t2.setText("");
        }
    }

    class add implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());

                int sum = num1 + num2;

                l5.setText("Addition is: " + sum);
            }
            catch(Exception ex)
            {
                l5.setText("Please enter the number");
            }
        }
    }

    class mousel implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {
            
        }
        public void mouseEntered(MouseEvent e)
        {
            l1.setForeground(Color.BLACK);
        }

        public void mouseExited(MouseEvent e)
        {

        }

        public void mousePressed(MouseEvent e)
        {
            l1.setText("");
        }

        public void mouseReleased(MouseEvent e)
        {
            l1.setText("USERNAME");
        }

    }
}