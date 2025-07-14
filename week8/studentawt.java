/*import java.awt.*;
class Frame2
{
	Frame2()
	{
	Frame f=new Frame();
	Button b=new Button("click me");
	f.add(b);
	b.setBounds(30,50,80,30);
	f.setSize(100,200);
	f.setVisible(true);
	f.setLayout(null);
	}
	public static void main(String...args)
	{
	Frame2 f=new Frame2();
	}
	}
*/
/*
import java.awt.*;
import java.awt.event.*;
class Frame2 extends Frame implements ActionListener
	{
	TextField tf;
	       Frame2()
               {
                 tf=new TextField();
                 tf.setBounds(30,50,40,80);
                 Button b=new Button("click here");
                 b.setBounds(40,60,70,50);
                 b.addActionListener(this);
                 add(b);
                 add(tf);
                 setSize(300,300);
                 setVisible(true);
                 setLayout(null);
                 }
                 public void actionPerformed(ActionEvent e)
                 {
                 tf.setText("welcome to cse rajinikanth");
                 }
                 public static void main(String...args)
                 {
                 Frame2 f=new Frame2();
                 }
                 }
   */
   import java.awt.*;
   import java.awt.event.*;
   class Frame2 implements ActionListener
   {
  
   public static void main(String...args)
   {
   	Frame f=new Frame();
   	Label l,l1,l2,l3,l4,l5;
   	l=new Label("gender:");
   	l1=new Label("age:");
   	l2=new Label("course:");
   	l3=new Label("sem:");
   	l4=new Label("name:");
   	l5=new Label("");
   	l4.setBounds(600,20,40,40);
   	l.setBounds(600,50,50,20);
   	l1.setBounds(600,70,110,100);
   	l2.setBounds(580,150,60,60);
   	l3.setBounds(600,200,50,70);
   	l5.setBounds(650,120,50,70);
   	CheckboxGroup cbg=new CheckboxGroup();
   	Checkbox checkBox1=new Checkbox("male",cbg,false);
   	Checkbox checkBox2=new Checkbox("female",cbg,true);
        Choice age=new Choice();
        Choice course=new Choice();
        Choice sem=new Choice();
        Button b=new Button("submit");
        Label completed = new Label("Registration completed");
        
        completed.setBounds(650,300,300,30);
        completed.setVisible(false);
        
        b.addActionListener(new ActionListener(){
        	//@Override
        	public void actionPerformed(ActionEvent e)
        	{
        		completed.setVisible(true);
        	}
        
        });
        TextField t=new TextField();
        f.add(t);
       f.add(b);
       f.add(completed);
        f.add(course);
        f.add(age);
        f.add(sem);
        age.add("18");
        age.add("19");
        age.add("20");
       age.add("21");
        sem.add("1");
        sem.add("2");
        course.add("puc-1");
        course.add("puc-2");
        course.add("B.Tech 1st");
        course.add("B.Tech 2nd");
        course.setBounds(650,160,40,40);
        sem.setBounds(650,220,40,40);
        age.setBounds(650,100,40,40); 
       t.setBounds(650,20,80,40);
        b.setBounds(650,350,60,60);
   	checkBox1.setBounds(650,50,50,60);
   	checkBox2.setBounds(720,50,50,60);
   	f.add(checkBox1);
   	f.add(checkBox2);
   	f.setTitle("student Details");
   	f.add(l);
   	f.add(l1);
   	f.add(l2);
   	f.add(l3);
   	f.add(l4);
   	f.add(l5);
   	f.setSize(200,200);
   	f.setVisible(true);
   	f.setLayout(null);
     f.addWindowListener(new WindowAdapter() {
        public void WindowClosing ( WindowEvent we)
        {
          System.exit(0);
        }  
     });
   	}
   	}
   	
   	              
