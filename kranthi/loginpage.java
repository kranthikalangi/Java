import java.awt.*;
import java.awt.event.*;
public class loginpage extends Frame implements ActionListener
{
    Frame f=new Frame("log in page");
    TextField u,p;
    Button b1;
    
    loginpage()
    {
        Label l1=new Label("Username");
        Label l2=new Label("Password");
        Button b1=new Button("Log in");
        b1.addActionListener(this);
        u=new TextField(20);
        p=new TextField(15);

        f.add(l1);
        f.add(u);
        f.add(l2);
        f.add(p);
        f.add(b1);

        f.setSize(200,200);
        f.setVisible(true);
        
        f.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        public void actionPerformed(ActionEvent ae)
        {
            try
            {
               
                String username = u.getText();
                String password = p.getText();
                if(ae.getSource()==b1)
                {
                    f.add(new Label("You Are Successfully Logined."));
                }
            }
            catch (NumberFormatException e)
            {
                o.setText("Invalid input");
            }
            

        }


    }
}
