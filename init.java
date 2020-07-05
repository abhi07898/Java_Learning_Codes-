import java.applet.Applet;
import java.awt.*;
public class init extends Applet
{
public void paint(Graphics s)
{
for(int i=0;i<=10;i++)
{
s.drawString(" "+i,10,100);
}
}
}
/*<Applet code="init.class" height="300" width="200">
</Applte>*/