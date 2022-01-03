package Project;  
import java.util.*;
import Project.*;
import javax.swing.*;    
import java.awt.event.*;    
class RadioButtonExamp extends JFrame implements ActionListener{    
JRadioButton rb1,rb2;    
JButton b;
private String[] args;    
RadioButtonExamp(){      
rb1=new JRadioButton("Customer");    
rb1.setBounds(100,50,100,30);      
rb2=new JRadioButton("Admin/Employee");    
rb2.setBounds(100,100,100,30);     
ButtonGroup bg=new ButtonGroup();    
bg.add(rb1);bg.add(rb2);
b=new JButton("OK");    
b.setBounds(100,150,80,30);    
b.addActionListener(this);    
add(rb1);add(rb2);add(b);    
setSize(300,300);    
setLayout(null);    
setVisible(true);  
}    
public void actionPerformed(ActionEvent e){    
if(rb1.isSelected()){    
    Customerblock obj1=new Customerblock();
    obj1.main(args);
}    
if(rb2.isSelected()){  
    EmployeeLogin obj2=new EmployeeLogin();
        try {
            obj2.main(args);
            } 
        catch (Exception e1) {
            e1.printStackTrace();
            }   
}    
}    
}
public class Mainblock {
    public static void main(String[] args)
    {
        JFrame myFrame = null;    
        myFrame = new JFrame("Guide Window");    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame.setSize(1650,1080);    
        JEditorPane myPane = new JEditorPane();    
        myPane.setContentType("text/html");    
        myPane.setText("<h1>.......NEEDY....</h1><p>Please follow the below steps........</p>"+"<p>1)First choose your option admin or customer</p>"
        +"<p>2)And then choose login if you are already login then choose sign-in</p>"+"<p>3)Enter your problem and your need</p>"
        +"<p>4)And pay amount...</p>"
        +"<p>5)Within 25mins our service member take care of your problems</p>");    
        myFrame.setContentPane(myPane);    
        myFrame.setVisible(true);  
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        } 
        new RadioButtonExamp(); 
    }
}
//end..