import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

    Main(){
        JLabel label = new JLabel("Tally Counter");
        label.setBounds(120,50,100,25);
        JTextField textField = new JTextField();
        textField.setBounds(100,100,100,25);
        textField.setText("0");
        JButton reset = new JButton("Reset");
        reset.setBounds(50,150,100,25);
        ActionListener resetListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
            }
        };
        reset.addActionListener(resetListener);
        JButton increment = new JButton("Increment");
        increment.setBounds(150,150,100,25);
        ActionListener incrementListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(textField.getText());
                textField.setText(String.valueOf(++num));
            }
        };
        increment.addActionListener(incrementListener);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                System.exit(0);
            }
        });
        add(label);
        add(textField);
        add(reset);
        add(increment);
        setLayout(null);
        setTitle("Tally Counter");
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();

    }

}

