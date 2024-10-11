/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.macoscal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author dmitripower
 */
public class Cal extends JFrame implements ActionListener{
    
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, perButton, clrButton, negButton;
    JPanel panel;

    Font myFont = new Font("Inter", Font.PLAIN, 20); // change font descriptions

    double num1 = 0, num2 = 0, result = 0;
    char operator;
    
    
    Cal(){
        frame = new JFrame("MacOS Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(420,550);
        
        frame.getContentPane().setBackground(new Color(59,59,59));
        frame.setLocationRelativeTo(null);
        
        textfield = new JTextField();
        textfield.setBounds(50,30,300,80);
        textfield.setFont(myFont);
        textfield.setBackground(new Color(59,59,59));
        textfield.setForeground(Color.WHITE);
        String placeNumber = "0";
        textfield.setText(placeNumber);
        
        textfield.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(textfield.getText().equals(placeNumber)) {
                    textfield.setText("");
                }
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
       
        
        textfield.setEditable(false);
        
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("x");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        perButton = new JButton("%");
        clrButton = new JButton("AC");
        negButton = new JButton("(-)");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = perButton;
        functionButtons[7] = clrButton;
         functionButtons[8] = negButton;

        for(int i = 0; i < 9;i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);

        }
        
        for (int i = 6; i < 9; i++){
            functionButtons[i].setOpaque(true);
            functionButtons[i].setContentAreaFilled(true);
            functionButtons[i].setBorderPainted(false);
            functionButtons[i].setBackground(new Color(59,59,59));
            functionButtons[i].revalidate();
            functionButtons[i].repaint();
        }
        
        
        
        for(int i = 0; i < 6; i++){
            functionButtons[i].setOpaque(true);
            functionButtons[i].setContentAreaFilled(true);
            functionButtons[i].setBorderPainted(false);
            functionButtons[i].setBackground(new Color(255,165,0));
            functionButtons[i].revalidate();
            functionButtons[i].repaint();
        }
        
        for(int i = 4; i < 5; i++){
            functionButtons[i].setOpaque(true);
            functionButtons[i].setContentAreaFilled(true);
            functionButtons[i].setBorderPainted(false);
            functionButtons[i].setBackground(new Color(171,171,171));
            functionButtons[i].revalidate();
            functionButtons[i].repaint();
        }
        
        for (int i = 0; i < 10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setOpaque(true);
            numberButtons[i].setContentAreaFilled(true);
            numberButtons[i].setBorderPainted(false);
            numberButtons[i].setForeground(Color.BLACK);
            numberButtons[i].setBackground(new Color(171, 171, 171));
            numberButtons[i].revalidate();
            numberButtons[i].repaint();
        }
        
        
        
        
        
        //numberButtons[9].setPreferredSize(new Dimension(100,250));
        negButton.setBounds(50,430,100,50);
        perButton.setBounds(150,430,150,50);
        clrButton.setBounds(250,430,100,50);
        
        
        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(5,4,1,1));
        panel.setBackground(new Color(211, 211, 211));
        panel.setOpaque(true);
        //panel.setVisible(true);
        panel.setBackground(Color.BLACK);
        
        
        
        //frame.add(clrButton);
        //frame.add(perButton);
        //frame.add(negButton);
        //panel.add(clrButton);
        //panel.add(perButton);
        panel.add(clrButton);
        panel.add(perButton);
        panel.add(negButton);
        panel.add(divButton);
        
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        
        panel.add(numberButtons[0]);
        panel.add(decButton);
        panel.add(equButton);
        
        
        
        
        
        
        
        frame.add(panel);
        frame.add(textfield);
        
        
        frame.setVisible(true);
    }
    
    public static void main(String[] args){
        Cal calc = new Cal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //String command = e.getActionCommand();
        
        //Number
        for(int i = 0;i<10;i++)
        {
            if(e.getSource() == numberButtons[i])
            {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        
        }
        
        if(e.getSource()==decButton){
            textfield.setText(textfield.getText().concat("."));
        }
        
        
        if(e.getSource()==addButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }
        
        if(e.getSource()==subButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }
        if(e.getSource()==mulButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = 'x';
            textfield.setText("");
        }
        
        if(e.getSource()==divButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }
        
        if(e.getSource()==perButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '%';
            textfield.setText("");
        }
        if(e.getSource()==negButton){
            double temp = Double.parseDouble(textfield.getText()); // get the value present within the textfield
            temp*=-1;
            textfield.setText(String.valueOf(temp));
        }
        
        if(e.getSource() == equButton){
        num2 = Double.parseDouble(textfield.getText());
        switch(operator){
        case'+':
            result = num1 + num2;
            break;
        case'-':
            result = num1 - num2;
            break;
        case'x':
            result = num1 * num2;
            break;
        case'/':
            result = num1 / num2;
            break;
        case'%':
            result = num1 * (num1 / 100);
            break;
        }
        
        textfield.setText(String.valueOf(result));
        num1 = result;
        
        }
        if(e.getSource()==clrButton){
            textfield.setText("");
        }
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
