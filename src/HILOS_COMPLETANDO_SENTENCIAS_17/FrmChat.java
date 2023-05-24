package HILOS_COMPLETANDO_SENTENCIAS_17;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FrmChat extends JFrame implements Runnable {
    private JTextField txtEscrito;
    private JLabel imagen;
    public FrmChat(){
        initComponents();
    }

    private void initComponents(){
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 800);
        setLocationRelativeTo(null);
        imagen = new JLabel(new ImageIcon("D:/DESCARG/FAMILIA2.png"));
        imagen.setPreferredSize(new Dimension(500, 1100));
        add(imagen);
        txtEscrito = new JTextField(20);
        add(txtEscrito);


        Thread guardarTexto = new Thread(this::run);
        guardarTexto.start();


    }

    @Override
    public void run() {
        while (true) {
            // El hilo se duerme
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // El hilo despierta
            try {
                // Recuperar archivo de texto y guardar texto escrito
                FileWriter fw = new FileWriter("textoEscritoHilos.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(txtEscrito.getText());
                bw.newLine();
                bw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        FrmChat frmconversacion = new FrmChat();
        frmconversacion.setVisible(true);
    }
}
