import java.awt.*;
import java.awt.event.*;
public class simplecal extends Frame implements ActionListener  
{
    Frame f= new Frame("simple calci");
    Label l1,l2,l3;
    TextField i1,i2,o;
    Button b1,b2,b3,b4;

    public simplecal() 
    {
       
        l1=new Label("number1 :"); 
        l2=new Label("number2 :"); 
        l3=new Label("result :");
        i1=new TextField(10); 
        i2=new TextField(10); 
        o=new TextField(10);
        o.setEditable(false);
        f.setVisible(true);

        b1 =new Button("+");
        b2 =new Button("-");
        b3 =new Button("X");
        b4 =new Button("/");
        b1.addActionListener(this);
        b2.addActionListener(this); 
        b3.addActionListener(this); 
        b4.addActionListener(this);
        f.setLayout(new FlowLayout());
        f.add(l1);
        f.add(i1);
        f.add(l2);
        f.add(i2);
        f.add(l3);
        f.add(o);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setTitle("Simple Calcuator");
        f.setSize(1920,1080);
        f.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae) 
    {
        try
        {
            double a=Double.parseDouble(i1.getText());
            double b=Double.parseDouble(i2.getText());
            double c=0;
            if(ae.getSource()==b1)
            {
                c=a+b;
            }
            else if(ae.getSource()==b2)
            {
                c=a-b;
            }
            else if(ae.getSource()==b3)
            {
                c=a*b;
            }
            else if(ae.getSource()==b4)
            {
                c=a/b;
            }
            o.setText(String.valueOf(c));
            c=a/0;
        }
        
        catch (NumberFormatException e)
        {
            o.setText("Invalid input");
        }
        catch (ArithmeticException e)
        {
            o.setText("Error");
        }
    }
    public static void main(String args[])
    {
        new simplecal();
    }
}    