// DRAWING SMILING FACE THROUGH APPLET

import java.applet.*;    
import java.awt.*;
import java.awt.event.*;

public class MyApplet extends Applet
{
 public void init()   //initializing the applet
  {
  
  }
 public void start()  //starting of the applet
 
  {
    System.out.println("start");
  }
  
 public void paint(Graphics g)    //for drawing lines,oval,circle etc 

  {
   //FOR DRAWING OVAL
   //drawOval(int x1,int y1, int width, int height)
    g.drawOval(100,100,100,100);   // for the face
    g.drawOval(130,130,10,10);    //left eye
    g.drawOval(160,130,10,10);     //right eye
 
   // FOR DRAWING LINE 
   //drawLine(int x1,int y1, int x2, int y2)
    g.drawLine(147,147,147,170);    //nose
    g.drawLine(131,177,166,177);    // smile

   //FOR DRAWING ARC
   // drawArc(int x1,int y1, int width, int height,int startAngle, int arcAngle)
    g.drawArc(128,159,37,32,0,-180); 
               
  
             
   }
 public void display()
   {
     System.out.println("destroy called");   //applet end 
   }

/*<applet code="MyApplet.class"  width=300 height=300></applet> */
}
