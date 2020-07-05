import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class AbhiPrateek extends Applet
{
Label l1,l2,l3,l4,l5;
TextField tf1,tf2,tf3;
List li1;
Button b1,b2;
public void init()
{
l1=new Label("Name");
l2=new Label("Address");
l3=new Label("Contact");
l4=new Label("Age");
l5=new Label();
tf1=new TextField(20);
tf2=new TextField(40);
tf3=new TextField(13);
li1=new List();
li1.add("18");
li1.add("19");
li1.add("20");
li1.add("21");
b1=new Button("Submit");
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(tf1);
add(tf2);
add(tf3);
add(li1);
add(b1);
setLayout(null);
l1.setBounds(30,50,50,26);
l2.setBounds(30,100,50,26);
l3.setBounds(30,150,50,26);
l4.setBounds(30,200,50,26);
tf1.setBounds(90,50,90,26);
tf2.setBounds(90,100,90,26);
tf3.setBounds(90,150,90,26);
li1.setBounds(90,200,90,26);
b1.setBounds(150,250,80,30);
b1.addActionListener(new Abhi());
l5.setBounds(50,300,250,26);
}
class Abhi implements ActionListener
{
public void actionPerformed(ActionEvent ae)
{
l5.setText(tf1.getText()+" "+ tf2.getText()+" "+tf3.getText()+" "+li1.getSelectedItem());
}
}
}
/*<Applet code="AbhiPrateek.class" height="300" width="400">
</Applet>*/