import java.applet.Applet;
import java.awt.*;
class App extends Applet implements ActionListener
{
  Label l1;
TextField tf1;
Label l2;
TextField tf2;
Label l3;
Button b;
Label l4;
public void init()
{
l1=new Label("Enter Your Name pls");
tf1=new TextField();
l2=new Label("Enter your Addres pls");
tf2=new TextField();
l3=new Label();
l4=new Label();
b=new Button("Submit");
add(l1);
add(tf1);
add(l2);
add(tf2);
add(b);
add(l3);
add(l4);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
l3.setText(tf1.getText());
l4.setText(tf2.getText());
}
}
/*<Applet code="App.class" height="300" width="300">
</Applet>*/