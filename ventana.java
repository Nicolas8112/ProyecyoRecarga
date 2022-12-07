package Paquete;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana extends JFrame {


    private JPanel Panel1;
    private JTextField tffUsuario;
    private JButton btnSiguiente;
    private JButton btnSalir;
    private JLabel lbRecarga;
    private JPasswordField tffPassword;
    private JButton tffAceptar;
    private JButton tffSaldo;

    private JMenuBar menuBar;
    private JMenu archivo;
    private JMenuItem salir;

    public ventana() {
        setContentPane(Panel1);
        setTitle("Paquete.Recarga");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        menuBar = new JMenuBar();
        archivo = new JMenu("Archivo");
        salir = new JMenuItem("Salir");

        menuBar.add(archivo);
        archivo.add(salir);

        setJMenuBar(menuBar);


        btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Usuario = tffUsuario.getText();
                String Password = tffPassword.getText();
                lbRecarga.setText("Ingreso Exitoso!");
                String vRecarga = "";
                int numeroIden = 0;

                RecargaOne recarga = new RecargaOne();


                vRecarga =(JOptionPane.showInputDialog(null, "VALOR DE LA RECARGA "));


                numeroIden = Integer.parseInt(JOptionPane.showInputDialog(null, "NUMERO DE IDENTIFICACION"));

                JOptionPane.showMessageDialog(null, " NUMERO DE CEDULA " + numeroIden + "\n VALOR DE RECARGA " + vRecarga);

                JOptionPane.showMessageDialog(null, "PRESIONE ACEPTAR PARA CONFIRMAR ");

            }
        });
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);

            }
        });

        tffAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "RECARGA EXITOSA!");

            }
        });
        tffSaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int vRecarga = 0;
                String text = "";
                JOptionPane.showMessageDialog(null,text + vRecarga);



            }
        });
    }
}



