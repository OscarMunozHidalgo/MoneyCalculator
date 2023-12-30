package software.moneyCalculator.viewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener{
    private JButton button1;
    private String[] currencies;
    private JTextField result;
    public MainFrame(String[] currencies){
        this.currencies = currencies;
        this.setTitle("Money Calculator");
        this.getContentPane().setBackground(new Color(29,39,49));
        this.setSize(610,400);
        this.setLocationRelativeTo(null);
        //this.setMinimumSize(new Dimension(1220,400));
        this.setLayout(null);
        //this.setLayout(new BorderLayout(10,10)); //Separation in the border panels layout
        displayComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void displayComponents() {
        JComponent panel1 = new Panel(new int[]{10,10,200,50}).getComponent();
        JComponent panel2 = new Panel(new int[]{280,10,200,50}).getComponent();
        JComponent panel3 = new Panel(new int[]{220,10,50,50}).getComponent();
        /*panel1.setBackground(Color.CYAN);
        panel1.setBounds(10,10,200,200);*/
        this.add(panel1);
        this.add(panel2);
        //this.add(panel3);

        //JComponent label1 = new Label(new int[]{10,10,30,30}, "TO:").getComponent();
        JComponent label1 = new Label(new int[]{235,15,50,50}, "→").getComponent();
        label1.setFont(new Font("Consolas", Font.PLAIN,40));
        this.add(label1);

        JButton button = new JButton("Convert");
        button.setBackground(new Color(8,60,93));
        button.setBounds(490,10,100,50);
        button.setMnemonic('a'); //alt+a press the button
        button.setForeground(new Color(255,187,57));
        button.setFont(new Font("Consolas", Font.BOLD,16));
        button.setOpaque(true);
        //button.setEnabled(false);
        button.setFocusPainted(false);
        button.addActionListener(this);
        button1 = button;
        this.add(button);

        JTextField textFieldFrom = new JTextField();
        textFieldFrom.setFont(new Font("Consolas", Font.PLAIN,20));
        textFieldFrom.setBounds(10,10,100,30);
        textFieldFrom.setBackground(new Color(8,60,93));
        textFieldFrom.setForeground(new Color(255,187,57));
        panel1.add(textFieldFrom);

        JTextField textFieldFrom2 = new JTextField("100");
        textFieldFrom2.setFont(new Font("Consolas", Font.PLAIN,20));
        textFieldFrom2.setBounds(10,10,100,30);
        textFieldFrom2.setBackground(new Color(8,60,93));
        textFieldFrom2.setForeground(new Color(255,187,57));
        textFieldFrom2.setEnabled(false);
        result = textFieldFrom2;
        panel2.add(textFieldFrom2);

        JComponent comboBox1 = new ComboBox(new int[]{120,10,70,30}, currencies).getComponent();
        JComponent comboBox2 = new ComboBox(new int[]{120,10,70,30}, currencies).getComponent();
        panel1.add(comboBox1);
        panel2.add(comboBox2);


        /*ImageIcon image = new ImageIcon("ok2.png");
        JLabel imageDisplay = new JLabel();
        //imageDisplay.setBounds(10,70,780,710);
        imageDisplay.setPreferredSize(new Dimension(50,50));
        imageDisplay.setIcon(new ImageIcon(image.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
        panel1.add(imageDisplay);

        JButton button = new JButton("Convert");
        button.setBounds(220,10,100,50);
        button.setMnemonic('a'); //alt+a press the button
        button.setForeground(Color.CYAN);
        //button.setEnabled(false);
        panel1.add(button);

        ImageIcon image2 = new ImageIcon("ok2.png");
        JButton button2 = new JButton();
        this.button1 = button2;
        button2.setBounds(330,10,100,50);
        button2.setMnemonic('a'); //alt+a pulsa el boton
        button2.setIcon(new ImageIcon(image2.getImage().getScaledInstance(100,50,Image.SCALE_SMOOTH)));
        button2.addActionListener(this);

        panel1.add(button2, BorderLayout.SOUTH);*/


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            result.setText("Probando");
            System.out.println("Ok");
        }
    }
}
