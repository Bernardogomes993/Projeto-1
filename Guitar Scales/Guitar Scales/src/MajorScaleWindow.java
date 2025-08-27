import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MajorScaleWindow  extends JFrame implements ActionListener {
    JButton myButton;
    public MajorScaleWindow(){
        initialize();
        retrieveButton();
        majorScaleImage();

    }
    private void initialize(){
        setSize(750 , 820);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);

    }

    private void majorScaleImage(){
        ImageIcon icon = new ImageIcon("src/Imagem/Major-Scale-5-Shapes.jpg");
        JLabel label = new JLabel();
        label.setBounds( 0 , 0 , 750 , 820);
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
