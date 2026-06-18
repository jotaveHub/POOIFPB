package org.example.view;

import org.example.dao.UsuarioDaoJdbc;

import javax.swing.*;

public class TelaLogin extends JFrame {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel label1;
    private UsuarioDaoJdbc usuarioDao;

    public TelaLogin() {
        usuarioDao = new UsuarioDaoJdbc();
        setContentPane(contentPane);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        TelaLogin dialog = new TelaLogin();
        dialog.pack();
        dialog.setVisible(true);
    }



    private void createUIComponents() {
        // TODO: place custom component creation code here
         label1 = new JLabel();
        ImageIcon icone = new ImageIcon("src/main/java/org/example/img/Login_37128.png");
        label1.setIcon(icone);
    }
}