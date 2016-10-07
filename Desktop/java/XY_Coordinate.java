// finding x and y coordinates in window through mouseListner 

import java.applet.*;    
import java.awt.*;
import java.awt.event.*;

public class XY_Coordinate extends Applet implements MouseListener{  
public void init()
 {
   System.out.println("init called");   //applet initialize 
addMouseListener(this);
 }

public void mouseClicked(MouseEvent e){      //when ever we clicked the mouse on applet window it will show the x and y coordinates

System.out.println(e.getX()+","+e.getY());    //getting the x and y coordinate

}


public void mousePressed(MouseEvent e){

}


public void mouseEntered(MouseEvent e){

}


public void mouseReleased(MouseEvent e){

}


public void mouseExited(MouseEvent e){

}
public void start()
  {
    System.out.println("start");
  }
public void paint(Graphics g)

     {
             
     }
public void display()
   {
     System.out.println("destroy called");
   }

/*<applet code="XY_Coordinate.class"  width=300 height=300></applet> */
}
