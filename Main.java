//EXEMPLO TELA DE LOGIN

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lbLogin = new JLabel();
        lbLogin.setText("Login");

        JTextField tfLogin = new JTextField("", 20);

        JPanel pnLogin = new JPanel(new FlowLayout(FlowLayout.LEFT, 5,5));

        pnLogin.add(lbLogin);
        pnLogin.add(tfLogin);

        JLabel lbPassword = new JLabel();
        lbPassword.setText("Senha");

        JPasswordField tfPass = new JPasswordField("", 20);
        tfPass.setEchoChar('*');

        JPanel pnPass = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        pnPass.add(lbPassword);
        pnPass.add(tfPass);

        JButton btEnter = new JButton("Entrar");
        btEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!tfLogin.getText().equals("Zago"))
                {
                    JOptionPane.showMessageDialog(null, "Usuário incorreto!");
                    return;
                }

                String correctPass = "dom123";
                String userPass = new String(tfPass.getPassword());

                if (!userPass.equals(correctPass)) {
                    JOptionPane.showMessageDialog(null, "Você não VAI comer banan nunca na sua vida");
                    return;
                }

                JOptionPane.showMessageDialog(null, "COMAS BANANA COMA IMEDIATAMENTE");

                frame.setVisible(false);

                JFrame mainFrame = new JFrame();
                mainFrame.setVisible(true);
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(pnLogin);
        mainPanel.add(pnPass);
        mainPanel.add(btEnter);
             
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
