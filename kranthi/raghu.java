import java.awt.*;
import java.awt.event.*;
public class raghu extends Frame implements ActionListener
{
    Frame f=new Frame("raghu calculator:");
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
   public raghu()
    {
      l1=new Label("number1");
      l2=new Label("number2");
      l3=new Label("result");
      t1=new TextField(10);
      t2=new TextField(10);
      t3=new TextField(10);
      b1=new Button("+");
      b2=new Button("-");
      b3=new Button("*");
      b4=new Button("/");
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      f.setLayout(new FlowLayout());
      f.add(l1);
      f.add(t1);
      f.add(l2);
      f.add(t2);
      f.add(l3);
      f.add(t3);
      f.add(b1);
      f.add(b2);
      f.add(b3);
      f.add(b4);
      t3.setEditable(false);
      f.setVisible(true);
      f.setTitle("raghu man");
      f.setSize(1300,200);
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
    double a=Double.parseDouble(t1.getText());
    double b=Double.parseDouble(t2.getText());
    double c=0;
    try
    {
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
        t3.setText(c);
    }
        catch(NumberFormatException e)
        {
            t3.setText("invalid input");
        }
        catch(ArithmeticException e)
        {
            t3.setText("error");
        }
    }
  
  public static void main(String args[])
  {
    new raghu();
  }
}