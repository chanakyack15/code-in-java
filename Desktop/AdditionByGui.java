//import java.util.*;
import java.awt.*;
import java.awt.event.*;
class MyWindow implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2;
  public void show()
   {
Frame f=new Frame();
f.setSize(300,300);
f.setVisible(true);
//f.setBackgroundcolor(red);
FlowLayout t=new FlowLayout();
f.setLayout(t);
Label l1=new Label("First no");
f.add(l1);
 t1=new TextField(10);
f.add(t1);
Label l2=new Label("SECOND NO");
f.add(l2);
 t2=new TextField(10);
f.add(t2);
Label l3=new Label("result");
f.add(l3);
 t3=new TextField(10);
f.add(t3);

b1=new Button("add");
f.add(b1);
b1.addActionListener(this);
b2=new Button("sub");
f.add(b2);
b2.addActionListener(this);

    }

public void actionPerformed(ActionEvent e)
{
int c=0;
String S1=t1.getText();
int a = Integer.parseInt(S1);
String S2=t2.getText();
int b = Integer.parseInt(S2);
if (e.getSource()==b1)
  {
c=a+b;
  }


if (e.getSource()==b2)
{
c=a-b;
}
t3.setText(String.valueOf(c));
}
}
public class AdditionByGui
{
public static void main(String ar[])
 {
MyWindow t= new MyWindow();
t.show();
 }
}
