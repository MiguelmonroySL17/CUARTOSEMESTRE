package HILOS_COMPLETANDO_SENTENCIAS_17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;

public class FrmSentenciaHilo extends JFrame {
    String instruccion = "Look at the picture and answer the   following questions:";
    String pregunta1 = "1. Anne is Paul's";
    String pregunta2 = "2. Jason and Emily are their";
    String pregunta3 = "3. Paul is Anne's";
    String pregunta4 = "4. Jason is Anne's";
    String pregunta5 = "5. Emily is Paul's";
    String pregunta6 = "6. Jason is Emily's";
    String pregunta7 = "7. Emily is Jason's";
    String pregunta8 = "8. Paul and Anne are Jason's";

    String respuesta1, respuesta2, respuesta3, respuesta4, respuesta5, respuesta6, respuesta7, respuesta8;

    private JLabel imagen;
    private JTextArea txtEscrito;
    private JTextField[] txtRespuestas;
    private JButton btnEnviar;

    public FrmSentenciaHilo(){
        initComponents();
    }

    public void initComponents() {
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 900);
        setLocationRelativeTo(null);

        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new BorderLayout());

        // imagen agregada
        imagen = new JLabel(new ImageIcon("D:/DESCARG/FAMILIA.png"));
        imagen.setPreferredSize(new Dimension(400, 600));
        panelSuperior.add(imagen, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new BorderLayout());

        // en esta parte se van escribiendo las preguntas
        txtEscrito = new JTextArea(50, 20);
        txtEscrito.setLineWrap(true);
        panelInferior.add(txtEscrito, BorderLayout.WEST);
        txtEscrito.setBackground(Color.yellow);

        // panel agregado para que el usuario ingrese la respuesta a la pregunta
        JPanel panelDerecho = new JPanel(new GridLayout(8, 1));
        txtRespuestas = new JTextField[8];
        for (int i = 0; i < 8; i++) {
            txtRespuestas[i] = new JTextField();
            panelDerecho.add(txtRespuestas[i]);
        }
        panelInferior.add(panelDerecho);

        // Botón para verificar si la respuesta es correcta
        btnEnviar = new JButton("Enviar Respuestas");
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviarRespuestas();
            }
        });
        panelInferior.add(btnEnviar, BorderLayout.SOUTH);

        add(panelSuperior, BorderLayout.NORTH);
        add(panelInferior, BorderLayout.CENTER);
        // Codigo para mostrar salida en un jframe
        PrintStream out = new PrintStream(new TextAreaOutputStream(txtEscrito));
        System.setOut(out);
    }

    public void enviarRespuestas() {
        respuesta1 = txtRespuestas[0].getText();
        respuesta2 = txtRespuestas[1].getText();
        respuesta3 = txtRespuestas[2].getText();
        respuesta4 = txtRespuestas[3].getText();
        respuesta5 = txtRespuestas[4].getText();
        respuesta6 = txtRespuestas[5].getText();
        respuesta7 = txtRespuestas[6].getText();
        respuesta8 = txtRespuestas[7].getText();
        // 1
        if (respuesta1.equals("wife")){
            txtRespuestas[0].setText("✔");
        }
        else {
            txtRespuestas[0].setText("The correct answer is: wife");
        }
        // 2
        if (respuesta2.equals("children")){
            txtRespuestas[1].setText("✔");
        }
        else {
            txtRespuestas[1].setText("The correct answer is: children");
        }
        // 3
        if (respuesta3.equals("wife")){
            txtRespuestas[2].setText("✔");
        }
        else {
            txtRespuestas[2].setText("The correct answer is: wife");
        }
        // 4
        if (respuesta4.equals("son")){
            txtRespuestas[3].setText("✔");
        }
        else {
            txtRespuestas[3].setText("The correct answer is: son");
        }
        // 5
        if (respuesta5.equals("daughter")){
            txtRespuestas[4].setText("✔");
        }
        else {
            txtRespuestas[4].setText("The correct answer is: daughter");
        }
        // 6
        if (respuesta6.equals("brother")){
            txtRespuestas[5].setText("✔");
        }
        else {
            txtRespuestas[5].setText("The correct answer is: brother");
        }
        // 7
        if (respuesta7.equals("sister")){
            txtRespuestas[6].setText("✔");
        }
        else {
            txtRespuestas[6].setText("The correct answer is: sister");
        }
        // 8
        if (respuesta8.equals("parents")){
            txtRespuestas[7].setText("✔");
        }
        else {
            txtRespuestas[7].setText("The correct answer is: parents");
        }
    }


    public void preguntas() {
        // MENSAJE
        System.out.println();
        Runner.escribir(instruccion, 10);
        try{
            Thread.sleep(2000); // Duerme durante 6 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 1
        System.out.println();
        Runner.escribir(pregunta1, 10);
        try{
            Thread.sleep(6000); // Duerme durante 6 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 2
        System.out.println();
        Runner.escribir(pregunta2, 10);
        try{
            Thread.sleep(6000); // Duerme durante 6 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 3
        System.out.println();
        Runner.escribir(pregunta3, 10);
        try{
            Thread.sleep(6000); // Duerme durante 6 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 4
        System.out.println();
        Runner.escribir(pregunta4, 10);
        try{
            Thread.sleep(6000); // Duerme durante 6 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 5
        System.out.println();
        Runner.escribir(pregunta5, 10);
        try{
            Thread.sleep(6000); // Duerme durante 6 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 6
        System.out.println();
        Runner.escribir(pregunta6, 10);
        try{
            Thread.sleep(6000); // Duerme durante 6 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 7
        System.out.println();
        Runner.escribir(pregunta7, 10);
        try{
            Thread.sleep(6000); // Duerme durante 6 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 8
        System.out.println();
        Runner.escribir(pregunta8, 10);
        try{
            Thread.sleep(6000); // Duerme durante 6 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FrmSentenciaHilo mostrar = new FrmSentenciaHilo();
        mostrar.setVisible(true);

        // Hilo creado para que el formulario se muestre primero
        Thread preguntasThread = new Thread(() -> {
            try {
                Thread.sleep(2000);
                mostrar.preguntas();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        preguntasThread.start();
    }
}
