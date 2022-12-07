package Paquete;

import javax.swing.*;

public class main {

    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame frame = new ventana();
                frame.setSize(300,300);
                frame.setVisible(true);

            }
        });


    }
}
