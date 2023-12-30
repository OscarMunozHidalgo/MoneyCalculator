package software.moneyCalculator.viewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MockFrame extends JFrame implements ActionListener {
    JButton button1;
    JTextField textField;
    public MockFrame() throws HeadlessException {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button1 = new JButton("֎");
        button1.addActionListener(this);
        button1.setPreferredSize(new Dimension(60,40));
        button1.setFont(new Font("Consolas", Font.PLAIN,35));

        textField = new JTextField("Quantity");
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.PLAIN,35));

        JLabel label1 = new JLabel("");

        String[] x = {"Dog", "Cat", "Person"};
        JComboBox xd = new JComboBox(x);
        xd.setFont(new Font("Consolas", Font.PLAIN,20));

        this.add(button1);
        this.add(textField);
        this.add(xd);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            System.out.println(textField.getText() );
        }
    }
}
