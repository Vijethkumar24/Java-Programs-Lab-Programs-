import javax.swing.*;
import java.awt.event.*;

    

    

public class jva  {

    JButton jbtnAlpha;

    JButton jbtnBeta;

    JLabel jlab;

    public void init() {

        try {

            SwingUtilities.invokeAndWait(new Runnable() {

                public void run() {

                    makeGUI();
                }
            });

        } catch (Exception exc) {

            System.out.println("Can't create because of " + exc);
        }
    }

    private void makeGUI() {
        jbtnAlpha = new JButton("Alpha");
        jbtnBeta = new JButton("Beta");

        jbtnAlpha.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent le) {

                jlab.setText("alpa was pressed.");
            }
        });
        jbtnBeta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {

                jlab.setText("beta was pressed.");
            }
        });
      

       
    }
}
 