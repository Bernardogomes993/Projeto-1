import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinorPentatonicWindow  extends JFrame implements ActionListener {
    JButton myButton;
    public MinorPentatonicWindow(){
        initialize();
        retrieveButton();
        minorPentatonicImage();

    }
    private void initialize(){
        setSize(465 , 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);


    }
    private void minorPentatonicImage(){
        ImageIcon icon = new ImageIcon("src/Imagem/Pentatonic Shapes.gif");
        JLabel label = new JLabel();
        label.setBounds( 10 , 0 , 450 , 330);
        label.setIcon(icon);
        add(label);



    }

    private void retrieveButton(){
        myButton = new JButton("<");
        myButton.setBounds(0 , 150 , 50 , 50);
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
