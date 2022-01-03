package Project;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVWriter;
import java.io.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  
import javax.swing.*;  
import java.awt.event.*; 
class worstandgood
{
    void worst()throws Exception
    {
        JFrame f=new JFrame("feedback......"); 
        String Name=JOptionPane.showInputDialog(f,"Enter Name");
        String problems=JOptionPane.showInputDialog(f,"Enter Your feedback");
        JFrame myFrame = null;    
        myFrame = new JFrame("Thanks Window");    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame.setSize(1650,1080);    
        JEditorPane myPane = new JEditorPane();    
        myPane.setContentType("text/html");    
        myPane.setText("<h1>.......Thanks....</h1><p>Thanks for your golden feedback we will improved our service and update you sir...............</p>");    
        myFrame.setContentPane(myPane);    
        myFrame.setVisible(true); 
        String rate="Worst";
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);
        CSVWriter writer211 = new CSVWriter(new FileWriter("C:\\Users\\Senthuran Ravi\\AppData\\feedbackWORST.csv")); 
        String line111[] = {"Name","Feedback","Rate"};
        String line211[] = {Name,problems,rate,strDate};
        List list11 = new ArrayList();
        list11.add(line111);
        list11.add(line211);
        writer211.writeAll(list11);
        writer211.flush();
    }
    void good() throws Exception
    {
        JFrame f=new JFrame("Feedback......"); 
        String Name=JOptionPane.showInputDialog(f,"Enter Name");
        String problems=JOptionPane.showInputDialog(f,"Enter Your feedback");
        JFrame myFrame = null;    
        myFrame = new JFrame("Thanks Window");    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame.setSize(1650,1080);    
        JEditorPane myPane = new JEditorPane();    
        myPane.setContentType("text/html");    
        myPane.setText("<h1>.......Thanks....</h1><p>Thanks for your golden feedback.your feedback give energy to us thank you very much.........</p>");    
        myFrame.setContentPane(myPane);    
        myFrame.setVisible(true); 
        String rate="Good";
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);
        CSVWriter writer211 = new CSVWriter(new FileWriter("C:\\Users\\Senthuran Ravi\\AppData\\feedbackGOOD.csv")); 
        String line111[] = {"Name","Feedback","Rate","time-date Stamp"};
        String line211[] = {Name,problems,rate,strDate};
        List list11 = new ArrayList();
        list11.add(line111);
        list11.add(line211);
        writer211.writeAll(list11);
        writer211.flush();
    }

}
class rates extends JFrame implements ActionListener{    
    JRadioButton rb1,rb2;    
    JButton b;
    private String[] args;    
    rates(){      
    rb1=new JRadioButton("Worst");    
    rb1.setBounds(100,50,100,30);      
    rb2=new JRadioButton("Good");    
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
        worstandgood obj =new worstandgood();
        try {
            obj.worst();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }    
    if(rb2.isSelected()){  
        worstandgood obj =new worstandgood();
        try {
            obj.good();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }    
}    
}
class rate
{
    void rateourproject()
    {
        new rates(); 
    }
}
class Refund
{
    void refun() throws Exception
    {
        JFrame f=new JFrame("Refund......");   
        String Name=JOptionPane.showInputDialog(f,"Enter Name");
        String Password=JOptionPane.showInputDialog(f,"Enter Password");
        String Email=JOptionPane.showInputDialog(f,"Enter Your Email");  
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);
        String problems=JOptionPane.showInputDialog(f,"Enter Your Problem with our worker");
        String need=JOptionPane.showInputDialog(f,"why do You need your money back");
        CSVWriter writer211 = new CSVWriter(new FileWriter("C:\\Users\\Senthuran Ravi\\AppData\\Refund.csv")); 
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
        JFrame myFrame = null;    
        myFrame = new JFrame("Refund Window");    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame.setSize(1650,1080);    
        JEditorPane myPane = new JEditorPane();    
        myPane.setContentType("text/html");    
        myPane.setText("<h1>.......Refund....</h1><p>Sorry for that inconvience we discuss your problem and let you know if it is valuable reason then money will get you back within 2 days ok sir......bye and Thanks for using our program</p>"
        +"<p> or If you cancel your appointment then your money will give you back within 3 days thank you sir......</p>"+"<p>For more information call our admin they will solve your problem</p>"+"<p>6384057966</p>");    
        myFrame.setContentPane(myPane);    
        myFrame.setVisible(true);  
    }
}
class RadioButton11 extends JFrame implements ActionListener{    
    JRadioButton rb1,rb2;    
    JButton b;
    private String[] args;    
    RadioButton11(){      
    rb1=new JRadioButton("Rate");    
    rb1.setBounds(100,50,100,30);      
    rb2=new JRadioButton("Refund");    
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
        rate obj1=new rate();
        obj1.rateourproject();
    }    
    if(rb2.isSelected()){  
        Refund obj2=new Refund();
        try {
            obj2.refun();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }    
}    
}
public class RateorRefund {
    public static void main(String[] args)
    {
        JFrame myFrame = null;    
        myFrame = new JFrame("Guide Window");    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame.setSize(1650,1080);    
        JEditorPane myPane = new JEditorPane();    
        myPane.setContentType("text/html");    
        myPane.setText("<h1>.......NEEDY....</h1><p>1)If you want to rate our service then choose rate option </p>"+"<p>2)If you have any problem then and you need refund then choose refund option "
        +"<p>3)Enter the reason if your reason is valid then within 3 days you will get your money</p> "+"<p>Thank you sir..........</p>");    
        myFrame.setContentPane(myPane);    
        myFrame.setVisible(true);  
        try { 
            Thread.sleep(3000);
        } catch(InterruptedException ex){ 
         
            System.exit(0); 
        } 
        new RadioButton11(); 
    }
}
//end