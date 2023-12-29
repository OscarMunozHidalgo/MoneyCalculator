package software.moneyCalculator.viewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener{
    private JButton buttonDisp;
    public MainFrame(){
        this.setTitle("Money Calculator");
        this.setSize(800,800);
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(200,200));
        displayComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void displayComponents() {
        JPanel moneyBox = new JPanel();
        //moneyBox.setBounds(10,10,200,200);
        //moneyBox.setBackground(Color.GREEN);
        moneyBox.setLayout(null);
        this.getContentPane().add(moneyBox);

        JLabel text1 = new JLabel("Cumbia", SwingConstants.CENTER);
        text1.setBounds(10,10,200,50);
        text1.setOpaque(true);
        text1.setBackground(Color.CYAN);
        text1.setFont(new Font("Arial", Font.PLAIN,20));//Font(x, y, z) y==1 negrita, y==2 cursiva
        moneyBox.add(text1);

        ImageIcon image = new ImageIcon("ok2.png");
        JLabel imageDisplay = new JLabel();
        imageDisplay.setBounds(10,70,780,710);
        imageDisplay.setIcon(new ImageIcon(image.getImage().getScaledInstance(780,710,Image.SCALE_SMOOTH)));
        moneyBox.add(imageDisplay);

        JButton button = new JButton("Ok");
        button.setBounds(220,10,100,50);
        button.setMnemonic('a'); //alt+a pulsa el boton
        button.setForeground(Color.CYAN);
        //button.setEnabled(false);
        moneyBox.add(button);

        ImageIcon image2 = new ImageIcon("ok2.png");
        JButton button2 = new JButton();
        this.buttonDisp = button2;
        button2.setBounds(330,10,100,50);
        button2.setMnemonic('a'); //alt+a pulsa el boton
        button2.setIcon(new ImageIcon(image2.getImage().getScaledInstance(100,50,Image.SCALE_SMOOTH)));
        button2.addActionListener(this);

        moneyBox.add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonDisp){
            System.out.println("Ok");
        }
    }
}
