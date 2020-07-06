import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/*<applet code=MyTooltip.class height=300 width=200>
</applet>*/
public class MyTooltip extends JApplet
{
JTextField jtf1,jtf2,jtf3;
String st;
public void init()
{
Container cp=getContentPane();
cp.setLayout(new FlowLayout());
cp.setBackground(Color.yellow);
jtf1=new JTextField(15);
jtf2=new JTextField(15);
jtf3=new JTextField(15);

JButton but1=new JButton("Submit");
JButton but2=new JButton("Exit");
jtf1.setToolTipText("Eneter the name" );
jtf2.setToolTipText("Enter the Salary ");
jtf3.setToolTipText("Eneter teh Designation ");
but1.setToolTipText("Submit your Form ");
but2.setToolTipText("Exit from form");
cp.add(jtf1);
cp.add(jtf2);
cp.add(jtf3);
cp.add(but1);
cp.add(but2);

}
}