package Project;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVWriter;
import com.opencsv.CSVReader;  
import java.awt.Desktop;
import java.io.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  
import javax.swing.*;  
import java.awt.event.*;  
class employeeWork
{
    void login() throws Exception
    {
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        }
        JFrame f=new JFrame("Employee Login");   
        String Name=JOptionPane.showInputDialog(f,"Enter Name");
        String Email=JOptionPane.showInputDialog(f,"Enter Your Email");  
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);
        CSVWriter writer2 = new CSVWriter(new FileWriter("C:\\Users\\Senthuran Ravi\\AppData\\EmployeeLogin.csv")); 
        String line11[] = {"Name", "E-mail", "password","Time-date stamp"};
        String line21[] = {Name,Email,strDate};
        List list1 = new ArrayList();
        list1.add(line11);
        list1.add(line21);
        writer2.writeAll(list1);
        writer2.flush();
        JFrame myFrame = null;    
        myFrame = new JFrame("Success Window");    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame.setSize(1650,1080);    
        JEditorPane myPane = new JEditorPane();    
        myPane.setContentType("text/html");    
        myPane.setText("<h1>Successfully login........</h1>");    
        myFrame.setContentPane(myPane);    
        myFrame.setVisible(true);  
    }
    void work() throws Exception
    {
        String line = "";  
        String splitBy = ",";  
        try   
        {  

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Senthuran Ravi\\AppData\\AssigningCustomer.csv"));  
        while((line = br.readLine()) != null)     
        {  
            String[] employee = line.split(splitBy); 
            JFrame myFrame = null;    
            myFrame = new JFrame("Work Window");    
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
            myFrame.setSize(1650,1080);    
            JEditorPane myPane = new JEditorPane();    
            myPane.setContentType("text/html");    
            myPane.setText(employee[0]  + employee[1] + employee[2] +  employee[3] +  employee[4] + employee[5] +employee[6]);    
            myFrame.setContentPane(myPane);    
            myFrame.setVisible(true);  
          try { 
                Thread.sleep(3000);
            } catch(InterruptedException ex){ 
             
                System.exit(0); 
            }
            JFrame myFrame1 = null;    
            myFrame1 = new JFrame("Work Window");    
            myFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
            myFrame1.setSize(1650,1080);    
            JEditorPane myPane1 = new JEditorPane();    
            myPane1.setContentType("text/html");    
            myPane1.setText("<h1>Done......If you have any doubt call this no :6384057966</h1>");    
            myFrame1.setContentPane(myPane1);    
            myFrame1.setVisible(true); 

        }
        if((line = br.readLine()) == null)
        {
            JFrame myFrame1 = null;    
            myFrame1 = new JFrame("Work Window");    
            myFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
            myFrame1.setSize(1650,1080);    
            JEditorPane myPane1 = new JEditorPane();    
            myPane1.setContentType("text/html");    
            myPane1.setText("<h1>No Work soon you will get work</h1>");    
            myFrame1.setContentPane(myPane1);    
            myFrame1.setVisible(true); 
        }  
        }   
        catch (IOException e)   
        {  
        e.printStackTrace();  
        }  
        }  
}

class RadioButton extends JFrame implements ActionListener{    
    JRadioButton rb1,rb2;    
    JButton b;
    private String[] args;    
    RadioButton(){      
    rb1=new JRadioButton("Admin");    
    rb1.setBounds(100,50,100,30);      
    rb2=new JRadioButton("Employee");    
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
        Admin obj2=new Admin();
        obj2.main(args); 
    }    
    if(rb2.isSelected()){  
        JFrame myFrame = null;    
        myFrame = new JFrame("Guide Window");    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame.setSize(1650,1080);    
        JEditorPane myPane = new JEditorPane();    
        myPane.setContentType("text/html");    
        myPane.setText("<h1>.......NEEDY....</h1><p>Please follow the below steps........</p>"+"<p>1)First login with name and email</p>"+"<p>2)After Login you get your Today work</p>"+"<p>3)Follow the covid safety rules "
        +"<p>4)Maintain Social Distance </p>"+"<p>5)Use hand Sanitizer frequently"+"<h1>Attenion.....</h1>"+"<p>If we get any complaint from customer then you will be fired from our network</p>"
        +"<p>Enter your employee password to login</p>");    
        myFrame.setContentPane(myPane);    
        myFrame.setVisible(true); 
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        }
        JFrame f;  
        f=new JFrame("Password");    
        String Password=JOptionPane.showInputDialog(f,"Enter PASSWORD");
        String OriginalPassword="MAY01tillend";
        if(Password.equals(OriginalPassword))
        {
            employeeWork obj3=new employeeWork();
            try {
                obj3.login();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            try { 
                Thread.sleep(3000);
            } catch(InterruptedException ex){ 
             
                System.exit(0); 
            }
            try {
                obj3.work();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else{
            try { 
                Thread.sleep(3000);
            } catch(InterruptedException ex){ 
             
                System.exit(0); 
            } 
        JFrame myFrame1= null;    
        myFrame1 = new JFrame("Guide Window");    
        myFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame1.setSize(1650,1080);    
        JEditorPane myPane1= new JEditorPane();    
        myPane1.setContentType("text/html");    
        myPane1.setText("<h1>.......!!!!!!ERROR!!!!....</h1>");    
        myFrame1.setContentPane(myPane1);    
        myFrame1.setVisible(true);  
        }
    }    
    }    
}
    
public class EmployeeLogin {
    public static void main(String[] args)
    {
        new RadioButton();        
    }
}
//end...