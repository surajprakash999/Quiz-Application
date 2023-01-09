package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    
    
    JButton rules, back;// global declaration to access further from not only local 
    JTextField tfname;
    
    
    Login(){
        
        getContentPane().setBackground(Color.white);
        setLayout(null);// for custom layout other than default swing layout by further writhing setbounds
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,480);// custom layout
        add(image);
        
        //to write in frame ie heading
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        //to write name 
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        
        name.setForeground(new Color(30,144,254));
        add(name);
        
        // to make box for user input
        
          tfname = new JTextField();
        tfname.setBounds(735,200,300,35);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tfname.setBackground(Color.LIGHT_GRAY);
        tfname.setForeground(Color.BLACK);
        add(tfname);
        
        // creating buttons
        
        //creting rules button 
          rules = new JButton("RULES*");
         rules.setBounds(735,270,120,25);
         rules.setBackground(new Color(30,144,254));
         rules.setForeground(Color.red);
         
         rules.addActionListener(this);
         
         add(rules);
         
         // creatin back button
         
          back = new JButton("Back");
         back.setBounds(915,270,120,25);
         back.setBackground(new Color(30,144,254));
         back.setForeground(Color.white);
         
         back.addActionListener(this);
         
         add(back);
        
        setSize(1200,500);
        setLocation(50,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            
            String name = tfname.getText();
            
           setVisible(false);
           new Rules(name);
        }else if(ae.getSource() == back){
            setVisible(false);
            
        }
        
    }
    
    public static void main (String[] args){
        new Login();//announomous object
    }
       
}
