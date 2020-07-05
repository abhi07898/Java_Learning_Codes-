import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class AbhiParteek1 extends Applet
{
Label l1,l2;
TextField tf1,tf2,tf3;
Button b1,b2,b3,b4,b5;
public void init()
{
l1=new Label("First No:");
l2=new Label("Second No:");
l3=new Label("This is Calculator program in java Applet");
tf1=new TextField(10);
tf2=new TextField(10);
tf3=new TextField(10);
b1=new Button("Plus");
b2=new Button("Minus");
b3=new Button("Multiplication");
b4=new Button("Divide");
b5=new Button("Submit");
add(l1);
add(tf1);
add(l2);
add(tf2);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
b1.addActionListener(new Abhi());
b2.addActionListener(new Abhi());
b3.addActionListener(new Abhi());
b4.addActionListener(new Abhi());
}
class Abhi implements ActionListener
{
public void actionPerformed(ActionEvent ae)
{

}
}
}