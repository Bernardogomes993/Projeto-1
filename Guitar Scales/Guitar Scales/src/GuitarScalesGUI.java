import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuitarScalesGUI extends JFrame  implements ActionListener {
    JButton pentatonicButton , majorButton , minorButton;


    public GuitarScalesGUI(){
        initialize();
        buttons();

    }
    private void initialize(){
        setTitle("Guitar Scales");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600 , 600);
        setLayout(null);
        setVisible(true);


    }

    private void buttons(){
        //Pentatonic Button

        pentatonicButton = new JButton();
        pentatonicButton.addActionListener(this);
        pentatonicButton.setText("Pentatonic Scale");
        pentatonicButton.setBounds(0 , 0 , 250 , 100);
        add(pentatonicButton);

        //Major Button
        majorButton = new JButton();
        majorButton.addActionListener(this);
        majorButton.setText("Major Scale");
        majorButton.setBounds(0 , 200 , 250 , 100);
        add(majorButton);


        //Minor Button
        minorButton = new JButton();
        minorButton.addActionListener(this);
        minorButton.setText("Minor Scale");
        minorButton.setBounds(0 , 400 , 250 , 100);
        add(minorButton);



    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pentatonicButton){
            dispose();
            MinorPentatonicWindow minorPentatonicWindow = new MinorPentatonicWindow();
        }


        if(e.getSource() == majorButton){
            dispose();
          MajorScaleWindow majorScaleWindow = new MajorScaleWindow();
        }

        if(e.getSource() == minorButton){
            dispose();
            MinorScaleWindow minorScaleWindow = new MinorScaleWindow();
        }




    }
}
