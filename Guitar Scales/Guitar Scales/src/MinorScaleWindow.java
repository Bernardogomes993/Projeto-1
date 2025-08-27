import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinorScaleWindow  extends JFrame implements ActionListener {
    JButton myButton;
    public MinorScaleWindow(){
        initialize();
        retrieveButton();
        minorScaleImage();
    }
    private void initialize(){
        setSize(800 , 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    private void minorScaleImage(){
        ImageIcon icon = new ImageIcon("src/Imagem/Minor Scale.jpg");
        JLabel label = new JLabel();
        label.setBounds( 10 , 0 , 800 , 750);
        label.setIcon(icon);
        add(label);


    }

    private void retrieveButton(){
        myButton = new JButton("<");
        myButton.setBounds(0 , 400 , 50 , 50);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        add(myButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == myButton){
            dispose();
            GuitarScalesGUI guitarScalesGUI = new GuitarScalesGUI();
        }

    }
}
