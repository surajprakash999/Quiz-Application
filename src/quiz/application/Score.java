package quiz.application;

import java.awt.*;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JLabel;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    
    Score(String name, int score){
        setBounds(300,130,750,550);
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);// custom layout
        add(image);
        
        
        //  displaying 
        JLabel heading = new JLabel("Thankyou "+ name + " for playing Simple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(heading);
        // too display score 
        JLabel lblscore = new JLabel("Your Score is "+ score);
        
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(lblscore);
        
        
        JButton submit = new JButton("Close");
        submit.setBounds(370,270,140,30);
        submit.setFont(new Font("Tahoma",Font.PLAIN,23));
        submit.setBackground(new Color(50,140,155));
        submit.setForeground(Color.white);
        
        submit.addActionListener(this);
        //making submit disabled
       // submit.setEnabled(false);
        add(submit);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        setVisible(false);
       // new Login();
    }
    
    public static void main (String[] args){
        new Score("User",0);
}}
