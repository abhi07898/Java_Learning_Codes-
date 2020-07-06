import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/*<Applet code=Myswing1.class height=200 width=300>
</applet>*/
public class Myswing1 extends JApplet implements ActionListener
{
JTextField jtf;
public void init()
{
Container cp=getContentPane();
cp.setLayout(new FlowLayout());
jtf=new JTextField(15);
cp.add(jtf);
cp.setBackground(Color.black);
ImageIcon img=new ImageIcon("abhi.gif");
JButton jb1=new JButton(img);
JButton jb2=new JButton("PressMe");
JButton jb3=new JButton("PressMe ,img");
jb1.setActionCommand("Button 1 is pressed ");
jb2.setActionCommand("Button 2 is pressed ");
jb3.setActionCommand("Button 3 is pressed ");
jb1.addActionListener(this);
jb2.addActionListener(this);
jb3.addActionListener(this);
cp.add(jb1);
cp.add(jb2);
cp.add(jb3);


}
public void actionPerformed(ActionEvent ae)
{
jtf.setText(ae.getActionCommand());
}
}