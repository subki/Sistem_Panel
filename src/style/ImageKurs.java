/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package style;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author TOSHIBA
 */
public class ImageKurs  extends JPanel{
 
    protected  void paintComponent(Graphics g){
        Graphics2D graphics = (Graphics2D )g.create(); 

        Image img = new ImageIcon(getClass().getResource("/image/kurs.png")).getImage();

        graphics.drawImage(img, 0, 0, getWidth(),getHeight(), null);

        graphics.dispose();
    }
   
}
