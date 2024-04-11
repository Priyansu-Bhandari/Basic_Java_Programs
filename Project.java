// Digital Clock Project

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.*;

class Project extends JFrame
{
    Project(String Title)
    {
        super(Title);
    }

    JLabel l1, l2;
    SimpleDateFormat d1, d2;

    void setComponents()
    {
        
        l1 = new JLabel();
        l2 = new JLabel();
        l1.setFont(new Font("Verdana", Font.BOLD, 40));
        l2.setFont(new Font("Verdana", Font.BOLD, 40));
        Color c = Color.RED;
        Color c1 = c.brighter();
        l1.setForeground(c1);
        l2.setForeground(c1);
        l1.setBackground(Color.BLACK);
        l2.setBackground(Color.BLACK);
        l1.setOpaque(true);
        l2.setOpaque(true);
        setLayout(null);
        add(l1);
        add(l2);
        l1.setBounds(50,50,290,100);
        l2.setBounds(70,250,220,100);

        d1 = new SimpleDateFormat("hh:mm:ss a");
        d2 = new SimpleDateFormat("EEEEE");

        String time = d1.format(Calendar.getInstance().getTime());
        l1.setText(time);
        String day = d2.format(Calendar.getInstance().getTime());
        l2.setText(day);

        while(true)
        {
            time = d1.format(Calendar.getInstance().getTime());
            l1.setText(time);
            day = d2.format(Calendar.getInstance().getTime());
            l2.setText(day);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args)
    {
        Project pj = new Project("Digital Clock");
        pj.setVisible(true);
        pj.setSize(500,500);
        pj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pj.setComponents();
    }


}