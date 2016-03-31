/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.alee.laf.WebLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author ika
 */
public class SSM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(WebLookAndFeel.class.getCanonicalName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SSM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SSM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SSM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SSM.class.getName()).log(Level.SEVERE, null, ex);
        }
        new login().setVisible(true);
    }
}
