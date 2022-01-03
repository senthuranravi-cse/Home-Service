package Project;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.*;    
import java.awt.event.*; 
import com.opencsv.CSVWriter;
import java.io.FileReader;  
import com.opencsv.CSVReader;  
import java.awt.Desktop;
import java.io.*;
import java.net.URI;
import java.util.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  
class employee1{
    void add() throws Exception
    {
        JFrame f;  
        CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\Senthuran Ravi\\AppData\\Employee.csv"));
        String line1[] = {"Name", "E-mail", "Phone-no","Address","Department","Age","Experience","Salary","Degree","Time-Stamp"};
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date); 
        int count=0,cou=0;
        f=new JFrame("Details");    
        String Name=JOptionPane.showInputDialog(f,"Enter Name");
        String Email=JOptionPane.showInputDialog(f,"Enter Your E-mail");
        String Address=JOptionPane.showInputDialog(f,"Enter Your Address");
        String phone=JOptionPane.showInputDialog(f,"Enter your phone-no");
        String Age=JOptionPane.showInputDialog(f,"Enter your Age");
        String Department=JOptionPane.showInputDialog(f,"Enter your Department");
        String Salary=JOptionPane.showInputDialog(f,"Enter your salary Expected");
        String Experience=JOptionPane.showInputDialog(f,"Enter your Experience");
        String degree=JOptionPane.showInputDialog(f,"Enter your Degree");
        JFrame myFrame1 = null; 
        myFrame1 = new JFrame("NEEDY");    
        myFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame1.setSize(1650,1080);    
        JEditorPane myPane1 = new JEditorPane();    
        myPane1.setContentType("Guide");    
        myPane1.setText("<h1>Enter the google forms</h1>");    
        myFrame1.setContentPane(myPane1);    
        myFrame1.setVisible(true); 
        try { 
            Thread.sleep(10000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        } 
        Desktop desk = Desktop.getDesktop();
		desk.browse(new URI("https://docs.google.com/forms/d/e/1FAIpQLSd7iX_RRBj8rQ-ilARAc1fZDpE37MuanQwS7m2_PPgRCZQkAg/viewform?usp=sf_link"));
        for(int i=0;i<Email.length();i++)
        {
            if(Email.charAt(i)=='@')
            {
              count+=1;
            }
        }
        if(count!=1)
        {
            JFrame myFrame = null; 
            myFrame = new JFrame("NEEDY");    
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
            myFrame.setSize(1650,1080);    
            JEditorPane myPane = new JEditorPane();    
            myPane.setContentType("Error Window");    
            myPane.setText("<h1>Please enter valid Email</h1>");    
            myFrame.setContentPane(myPane);    
            myFrame.setVisible(true); 
        }
        for(int i=0;i<9;i++)
        {
            int num=phone.charAt(i);
            if(num>=48&&num<=57)
            {
              cou+=1;
            }
        }
        if(phone.length()!=10&&cou!=10)
        {
            JFrame myFrame = null; 
            myFrame = new JFrame("NEEDY");    
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
            myFrame.setSize(1650,1080);    
            JEditorPane myPane = new JEditorPane();    
            myPane.setContentType("Error Window");    
            myPane.setText("<h1>please enter valid mobile number</h1>");    
            myFrame.setContentPane(myPane);    
            myFrame.setVisible(true); 
            
        } 
        String line2[] = {Name,Email,phone,Address,Department,Age,Experience,Salary,degree,strDate};
        List list = new ArrayList();
        list.add(line1);
        list.add(line2);
        writer.writeAll(list);
        writer.flush();
        JFrame myFrame = null; 
        myFrame = new JFrame("NEEDY");    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame.setSize(1650,1080);    
        JEditorPane myPane = new JEditorPane();    
        myPane.setContentType("Success Window");    
        myPane.setText("<h1>Add Employee Successfully</h1>"+"<p>Now you will become our new employee....</p>"+"<p>Congratulation!!!!</p>"+"<p>For Login you must enter Password</p>"
        +"<p>Your password is</p><h1>MAY01tillend</h1>"+"<h1>EVERY BOSS STARTED AS WORKER</h1>");    
        myFrame.setContentPane(myPane);    
        myFrame.setVisible(true); 
    }
    void adminadd() throws Exception
    {
        JFrame f;  
        CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\Senthuran Ravi\\AppData\\AdminAdd.csv"));
        String line1[] = {"Name", "E-mail", "Phone-no","Address","Age","Degree","Time-Stamp"};
        Scanner sc=new Scanner(System.in);
        int count=0,cou=0;
        f=new JFrame("Details");    
        String Name=JOptionPane.showInputDialog(f,"Enter Name");
        String Email=JOptionPane.showInputDialog(f,"Enter Your E-mail");
        String Address=JOptionPane.showInputDialog(f,"Enter Your Address");
        String phone=JOptionPane.showInputDialog(f,"Enter your phone-no");
        String Age=JOptionPane.showInputDialog(f,"Enter your Age");
        String degree=JOptionPane.showInputDialog(f,"Enter your Degree");
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);
        JFrame myFrame1 = null; 
        myFrame1 = new JFrame("NEEDY");    
        myFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame1.setSize(1650,1080);    
        JEditorPane myPane1 = new JEditorPane();    
        myPane1.setContentType("Guide");    
        myPane1.setText("<h1>Enter the google forms</h1>");    
        myFrame1.setContentPane(myPane1);    
        myFrame1.setVisible(true); 
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        }  
        Desktop desk = Desktop.getDesktop();
		desk.browse(new URI("https://docs.google.com/forms/d/e/1FAIpQLSfRIHbaM0di8_xIpha2uEMOgyjss0yf6fglccfd7ojhxXQ_vw/viewform?usp=sf_link"));
        for(int i=0;i<Email.length();i++)
        {
            if(Email.charAt(i)=='@')
            {
              count+=1;
            }
        }
        if(count!=1)
        {
            JFrame myFrame = null; 
            myFrame = new JFrame("NEEDY");    
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
            myFrame.setSize(1650,1080);    
            JEditorPane myPane = new JEditorPane();    
            myPane.setContentType("Error Window");    
            myPane.setText("<h1>Please enter valid Email</h1>");    
            myFrame.setContentPane(myPane);    
            myFrame.setVisible(true); 
        
        }
        for(int i=0;i<9;i++)
        {
            int num=phone.charAt(i);
            if(num>=48&&num<=57)
            {
              cou+=1;
          }
        }
        if(phone.length()!=10&&cou!=10)
        {
            JFrame myFrame = null; 
            myFrame = new JFrame("NEEDY");    
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
            myFrame.setSize(1650,1080);    
            JEditorPane myPane = new JEditorPane();    
            myPane.setContentType("Error Window");    
            myPane.setText("<h1>please enter valid mobile number</h1>");    
            myFrame.setContentPane(myPane);    
            myFrame.setVisible(true); 
        }
        String line2[] = {Name,Email,phone,Address,Age,degree,strDate};
        List list = new ArrayList();
        list.add(line1);
        list.add(line2);
        writer.writeAll(list);
        writer.flush(); 
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        } 
        JFrame myFrame = null; 
        myFrame = new JFrame("NEEDY");    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame.setSize(1650,1080);    
        JEditorPane myPane = new JEditorPane();    
        myPane.setContentType("Success Window");    
        myPane.setText("<h1>Successfully add new Admin</h1>"+"<p> If you login into our admin panel then you need a Password"+"Password is NEEDY648566");    
        myFrame.setContentPane(myPane);    
        myFrame.setVisible(true); 

    }

}
class Adminn extends JFrame implements ActionListener{    
    JRadioButton rb1,rb2;    
    JButton b;    
    Adminn(){      
    rb1=new JRadioButton("1)Add employee");    
    rb1.setBounds(100,50,100,30);      
    rb2=new JRadioButton("2)Add Admin");    
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
        JFrame myFrame2 = null;    
        myFrame2 = new JFrame("Employee Add");    
        myFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame2.setSize(1650,1080);    
        JEditorPane myPane2 = new JEditorPane();    
        myPane2.setContentType("text/html");    
        myPane2.setText("<h1>......NEEDY....</h1><p>1)Enter employee details</p>"+"<p>2)Fill the given google form </p>"+"<p>3)After fill the google form you wil become our service man");    
        myFrame2.setContentPane(myPane2);    
        myFrame2.setVisible(true);  
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        } 
        employee1 obj1 =new employee1();  
        try {
            obj1.add();
        } 
        catch (Exception e1) {
            e1.printStackTrace();
        }  
    }    
    if(rb2.isSelected()){ 
        JFrame myFrame2 = null;    
        myFrame2 = new JFrame("Employee Add");    
        myFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame2.setSize(1650,1080);    
        JEditorPane myPane2 = new JEditorPane();    
        myPane2.setContentType("text/html");    
        myPane2.setText("<h1>......NEEDY....</h1><p>1)Enter Admin details</p>"+"<p>2)Fill the given google form </p>"+"<p>3)After fill the google form you wil become our admin");    
        myFrame2.setContentPane(myPane2);    
        myFrame2.setVisible(true);  
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        } 
        employee1 obj1 =new employee1();     
        try {
            obj1.adminadd();
        } 
        catch (Exception e1) {
            e1.printStackTrace();
        }   
    }  
    } 
} 

public class Admin {
    public static void main(String args[])
    {
        JFrame myFrame2 = null;    
        myFrame2 = new JFrame("Admin Welcome");    
        myFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame2.setSize(1650,1080);    
        JEditorPane myPane2 = new JEditorPane();    
        myPane2.setContentType("text/html");    
        myPane2.setText("<h1>......Welcome Sir....</h1><p>Enter your password </p>");    
        myFrame2.setContentPane(myPane2);    
        myFrame2.setVisible(true);  
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        } 
        JFrame f;  
        f=new JFrame("Password");    
        String Password=JOptionPane.showInputDialog(f,"Enter PASSWORD");
        String OriginalPassword="NEEDY4856";
        if(Password.equals(OriginalPassword))
        {
           new Adminn();
        }
        else{
            try { 
                Thread.sleep(3000);
            } catch(InterruptedException ex){ 
             
                System.exit(0); 
            } 
        JFrame myFrame = null;    
        myFrame = new JFrame("Guide Window");    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame.setSize(1650,1080);    
        JEditorPane myPane = new JEditorPane();    
        myPane.setContentType("text/html");    
        myPane.setText("<h1>.......!!!!!!ERROR!!!!....</h1>");    
        myFrame.setContentPane(myPane);    
        myFrame.setVisible(true);  
        }
        
    }                                            
}
//end