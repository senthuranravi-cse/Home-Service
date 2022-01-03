package Project;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;
import com.opencsv.CSVWriter;
import com.opencsv.CSVReader;  
import java.awt.Desktop;
import java.io.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import javax.swing.*;  
import java.awt.event.*; 

class email extends Exception
{
    int num;
    email(int num)
    {
        this.num=num;
    }
    public String toString()
    {
        return ("Email is Wrong");
    }
}

class phone extends Exception
{
    int num;
    phone(int num)
    {
        this.num=num;
    }
    public String toString()
    {
        return ("Email is Wrong");
    }
}

class Feedback extends JFrame implements ActionListener{    
    JRadioButton rb1,rb2;    
    JButton b;    
    private String[] args;   
    Feedback(){  
    JFrame f=new JFrame("Choose your option");       
    rb1=new JRadioButton("Refund/rate us");    
    rb1.setBounds(100,50,100,30);      
    rb2=new JRadioButton("Nothing");    
    rb2.setBounds(100,100,100,30);    
    ButtonGroup bg=new ButtonGroup();    
    bg.add(rb1);bg.add(rb2);    
    b=new JButton("click");    
    b.setBounds(100,150,80,30);    
    b.addActionListener(this);    
    add(rb1);add(rb2);add(b);    
    setSize(300,300);    
    setLayout(null);    
    setVisible(true);    
    }    
    public void actionPerformed(ActionEvent e){  

    if(rb1.isSelected()){ 
        RateorRefund obj=new RateorRefund();
        obj.main(args);
    }  

    if(rb2.isSelected()){ 
        JFrame myFrame = null;    
        myFrame = new JFrame("Thanks Window");    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame.setSize(1650,1080);    
        JEditorPane myPane = new JEditorPane();    
        myPane.setContentType("text/html");    
        myPane.setText("<h1>.......NEEDY....</h1><p>Thanks for using our Program............</p>");    
        myFrame.setContentPane(myPane);    
        myFrame.setVisible(true);  
        
    }
    }
} 

class RadioButtonExample2 extends JFrame implements ActionListener{    
    String paid;
    JRadioButton rb1,rb2,rb3;    
    JButton b;    
    RadioButtonExample2(){      
    rb1=new JRadioButton("G-pay");    
    rb1.setBounds(100,50,100,30);      
    rb2=new JRadioButton("Phone-pe");    
    rb2.setBounds(100,100,100,30);     
    ButtonGroup bg=new ButtonGroup();    
    bg.add(rb1);bg.add(rb2);    
    b=new JButton("ok");    
    b.setBounds(100,150,80,30);    
    b.addActionListener(this);    
    add(rb1);add(rb2);add(b);    
    setSize(500,500);    
    setLayout(null);    
    setVisible(true);    
    }    
    public void actionPerformed(ActionEvent e){   
    JFrame f= new JFrame();
    if(rb1.isSelected()){   
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        }  
      Desktop desk = Desktop.getDesktop();
      try {
        desk.browse(new URI("https://pay.google.com/intl/en_in/about/?gclid=CjwKCAjwz5iMBhAEEiwAMEAwGP7jid2xFH9wNMavgjLlILK-RFwN4oGJn60lB_7CRolDj4HEAmHaORoC3w8QAvD_BwE&gclsrc=aw.ds"));
    } catch (IOException e1) {
        e1.printStackTrace();
    } catch (URISyntaxException e1) {
        e1.printStackTrace();
    }
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
    myPane.setText("<h1>You Paid using G-pay</h1>"+" <p>Once your payment will be confirmed you will get message.............</p>");    
    myFrame.setContentPane(myPane);    
    myFrame.setVisible(true);
    }    
    if(rb2.isSelected()){ 
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        }    
      Desktop desk = Desktop.getDesktop();
      try {
        desk.browse(new URI("https://www.phonepe.com/investments/gold/"));
    } catch (IOException | URISyntaxException e1) {
        
        e1.printStackTrace();
    }
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
    myPane.setText("<h1>You Paid using G-pay</h1>"+" <p>Once your payment will be confirmed you will get message.............</p>");    
    myFrame.setContentPane(myPane);    
    myFrame.setVisible(true);
    }
}
    
}

class customerlogin 
{
    void login() throws Exception
    {
        JFrame f;  
        CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\Senthuran Ravi\\AppData\\CustomerDatabase.csv"));
        String line1[] = {"Name", "E-mail", "password", "Phone-no","Address","Time-Date Stamp"};
        int count=0,cou=0;
        f=new JFrame("Details");    
        String Name=JOptionPane.showInputDialog(f,"Enter Name");
        String Email=JOptionPane.showInputDialog(f,"Enter Your E-mail");
        String l1=JOptionPane.showInputDialog(f,"Enter Your Password");    
        String Address=JOptionPane.showInputDialog(f,"Enter Your Address");
        String phone=JOptionPane.showInputDialog(f,"Enter your phone-no"); 
        JFrame myFrame = null; 
        myFrame = new JFrame("");    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame.setSize(400, 200);    
        JEditorPane myPane = new JEditorPane();    
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);  
        JFrame myFrame12 = null;    
        myFrame12 = new JFrame("Guide Window");    
        myFrame12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame12.setSize(1650,1080);    
        JEditorPane myPane12 = new JEditorPane();    
        myPane12.setContentType("text/html");    
        myPane12.setText("<h1>Please enter the following google forms.........</h1>");    
        myFrame12.setContentPane(myPane12);    
        myFrame12.setVisible(true); 
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        } 
        Desktop desk = Desktop.getDesktop();
	    desk.browse(new URI("https://docs.google.com/forms/d/e/1FAIpQLSdBWiOnYkDbuXQ2klAc394Q1bG4jQ-wexmFkYrNBvfEi6VZmQ/viewform?usp=sf_link"));
        try{
        for(int i=0;i<Email.length();i++)
        {
            if(Email.charAt(i)=='@')
            {
              count+=1;
            }
        }
        if(count!=1)
        { 
              throw new email(1);
        }
    }
    catch(Exception ex)
    {
        JFrame myFrame3 = null; 
        myFrame3= new JFrame("");    
        myFrame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame3.setSize(1650,1080);    
        JEditorPane myPane3 = new JEditorPane();    
        myPane3.setContentType("Error Window");    
        myPane3.setText("................Please enter valid Email.....................");    
        myFrame3.setContentPane(myPane);    
        myFrame3.setVisible(true); 
    }

    try{
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
            throw new phone(1);
        }
    }

    catch(Exception ip)
    {
        JFrame myFrame2 = null; 
        myFrame2 = new JFrame("");    
        myFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame2.setSize(1650,1080);    
        JEditorPane myPane2 = new JEditorPane();    
        myPane2.setContentType("Error Window");    
        myPane2.setText("...............please enter valid mobile number..................");    
        myFrame2.setContentPane(myPane);    
        myFrame2.setVisible(true); 
    }
        
        JFrame Frame = null;    
        Frame = new JFrame("Login Window");    
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        Frame.setSize(1650,1080);    
        JEditorPane Pane = new JEditorPane();    
        Pane.setContentType("text/html");    
        Pane.setText("<h1>Login Successfully...................</h1>");    
        Frame.setContentPane(Pane);    
        Frame.setVisible(true); 

        JFrame myFram = null;    
        myFram = new JFrame("Guide Window");    
        myFram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFram.setSize(1650,1080);    
        JEditorPane myPan = new JEditorPane();    
        myPan.setContentType("text/html");    
        myPan.setText("<h1>Enter your Problem & your need.................</h1>");    
        myFram.setContentPane(myPan);    
        myFram.setVisible(true); 

        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        } 

        String problems=JOptionPane.showInputDialog(f,"Enter Your problem here");
        String need=JOptionPane.showInputDialog(f,"Enter Your need");
        String line2[] = {Name,Email,l1,phone,Address,strDate};
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
        new RadioButtonExample2(); 
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        } 
          JFrame myFra = null; 
          myFra = new JFrame("Invoice");    
          myFra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
          myFra.setSize(1650,1080);    
          JEditorPane myPa = new JEditorPane();    
          myPa.setContentType("INVOICE");    
          myPa.setText("<h1>Successfully get information.........</h1>"+"<p>We will get you soon</p>");    
          myFra.setContentPane(myPa);    
          myFra.setVisible(true); 

        CSVWriter writer2 = new CSVWriter(new FileWriter("C:\\Users\\Senthuran Ravi\\AppData\\AssigningCustomer.csv")); 
        String line11[] = {"Name", "E-mail", "Phone-no","Address","Time-date stamp","Problems","Need"};
        String line21[] = {Name,Email,phone,Address,strDate,problems,need};
        List list1 = new ArrayList();
        list1.add(line11);
        list1.add(line21);
        writer2.writeAll(list1);
        writer2.flush();
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        } 
        new Feedback();

    }
    void signup() throws Exception
    {
        JFrame f=new JFrame("Sign in");   
        String Name=JOptionPane.showInputDialog(f,"Enter Name");
        String Password=JOptionPane.showInputDialog(f,"Enter Password");
        String Email=JOptionPane.showInputDialog(f,"Enter Your Email");  
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);

        JFrame Frame = null;    
        Frame = new JFrame("Login Window");    
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        Frame.setSize(1650,1080);    
        JEditorPane Pane = new JEditorPane();    
        Pane.setContentType("text/html");    
        Pane.setText("<h1>Login Successfully...................</h1>");    
        Frame.setContentPane(Pane);    
        Frame.setVisible(true); 

        JFrame myFram = null;    
        myFram = new JFrame("Guide Window");    
        myFram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFram.setSize(1650,1080);    
        JEditorPane myPan = new JEditorPane();    
        myPan.setContentType("text/html");    
        myPan.setText("<h1>Enter your Problem & your need.................</h1>");    
        myFram.setContentPane(myPan);    
        myFram.setVisible(true);
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        } 
        String problems=JOptionPane.showInputDialog(f,"Enter Your Problem");
        String need=JOptionPane.showInputDialog(f,"Enter Your need");
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        } 
        new RadioButtonExample2(); 
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        } 
          JFrame myFra = null; 
          myFra = new JFrame("Invoice");    
          myFra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
          myFra.setSize(1650,1080);    
          JEditorPane myPa = new JEditorPane();    
          myPa.setContentType("INVOICE");    
          myPa.setText("<h1>Successfully get information.........</h1>"+"<p>We will get you soon</p>");    
          myFra.setContentPane(myPa);    
          myFra.setVisible(true); 
        CSVWriter writer2 = new CSVWriter(new FileWriter("C:\\Users\\Senthuran Ravi\\AppData\\Signupdatabase.csv")); 
        String line11[] = {"Name", "E-mail", "password","Time-date stamp"};
        String line21[] = {Name,Email,Password,strDate};
        List list1 = new ArrayList();
        list1.add(line11);
        list1.add(line21);
        writer2.writeAll(list1);
        writer2.flush();
        CSVWriter writer211 = new CSVWriter(new FileWriter("C:\\Users\\Senthuran Ravi\\AppData\\AssigningCustomer.csv")); 
        String line111[] = {"Name", "E-mail","Time-date stamp","Problems","Need"};
        String line211[] = {Name,Email,strDate,problems,need};
        List list11 = new ArrayList();
        list11.add(line111);
        list11.add(line211);
        writer211.writeAll(list11);
        writer211.flush();
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        } 
        new Feedback();
    }  
}

class RadioButtonExample extends JFrame implements ActionListener{ 

    JRadioButton rb1,rb2;    
    JButton b;    
    RadioButtonExample(){  
    JFrame f=new JFrame("Choose your option");       
    rb1=new JRadioButton("Login");    
    rb1.setBounds(100,50,100,30);      
    rb2=new JRadioButton("Signup");    
    rb2.setBounds(100,100,100,30);    
    ButtonGroup bg=new ButtonGroup();    
    bg.add(rb1);bg.add(rb2);    
    b=new JButton("click");    
    b.setBounds(100,150,80,30);    
    b.addActionListener(this);    
    add(rb1);add(rb2);add(b);    
    setSize(300,300);    
    setLayout(null);    
    setVisible(true);    
    }    

    public void actionPerformed(ActionEvent e){    
    if(rb1.isSelected()){ 
        JFrame myFrame = null;    
        myFrame = new JFrame("Guide Window");    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame.setSize(1650,1080);    
        JEditorPane myPane = new JEditorPane();    
        myPane.setContentType("text/html");    
        myPane.setText("<h1>Enter your details.......</h1>");    
        myFrame.setContentPane(myPane);    
        myFrame.setVisible(true); 
        customerlogin obj1=new customerlogin();   
        try {
            obj1.login();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }    
    if(rb2.isSelected()){ 
        customerlogin obj1=new customerlogin();     
        try {
            obj1.signup();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        
    }
    }
} 

public class Customerblock
{
    public void main(String args[]){   
        JFrame myFrame = null;    
        myFrame = new JFrame("Guide Window");    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame.setSize(1650,1080);    
        JEditorPane myPane = new JEditorPane();    
        myPane.setContentType("text/html");    
        myPane.setText("<h1>.......Welcome..........</h1>");    
        myFrame.setContentPane(myPane);    
        myFrame.setVisible(true);  
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        }  
    new RadioButtonExample();    
    }
}
//Customer Block
//.................
//end.