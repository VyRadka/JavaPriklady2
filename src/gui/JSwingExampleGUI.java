package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;


public class JSwingExampleGUI {


    public static void main(String[] args) {

// tento prikaz slúži na vytvorenie okna čistého bez tlačidiel // hellou world text sa zobrazi na cele okna ako nazov
        JFrame frame = new JFrame("Hello World Swing"); // vytvorime okno
        frame.setMinimumSize(new Dimension(400, 200)); // tymto nastavime veľkosť okna
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ked kliknem na X na okne (cize vo frame) tak sa zatvori standardne- funguje to aj bez toho, ale aplikacia nebude korektne zatvorena
        frame.setLocationRelativeTo(null); // vycentrovanie okna na stred


// JFrame by mal obsahovat panel, teda container JPanel čiže do okna musime vytvoriť novy panel, do framu môžeme vložiť aj viac panelov a taktiež ho ani nemusíme používať
        JPanel panel = new JPanel();
        panel.setLayout(null); // layout pre panel bude null, cize prazdny


        frame.setContentPane(panel); // my dany panel pridame do frame


 // JText
        JTextField textField = new JTextField();
        textField.setBounds(95, 20, 200, 30); // x, y, sirka, vyska
        textField.setHorizontalAlignment(JTextField.RIGHT); // nastavenie kurzora do pravej časti *J*TextFieldu
        panel.add(textField);




        JLabel labelText = new JLabel("Hello World Swing!"); // popisok
        labelText.setBounds(140,50,150,20); // x, y, sirka, vyska
        panel.add(labelText);




        JButton btnOk = new JButton("Vypiš!"); // tlacidlo
        btnOk.setBounds(100, 100, 80, 20); // x, y, sirka, vyska


        btnOk.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
         // aplikačná logika po stlačení na tlačídlo
               /* System.out.println(textField.getText()); //tietp dva riadky vypisu, co sme napisali do okna
                labelText.setText( textField.getText() );*/
                System.out.println("Toto mi vypise po stlačení tlačidla");
                System.out.println(textField.getText()); // toto vypise obsah Textfieldu, mame to aj aj o dvariadky vyssie zakomentovane
               // labelText.setText("čau čo chceš"); // toto vypise po stlačení vypis pod labeltext
                labelText.setText(textField.getText());
            }
        });
        panel.add(btnOk);


        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(210, 100, 80, 20);


        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING)); // tento prikaz korektne zatvori celu aplikaciu
            }
        });
        panel.add(btnCancel);


        // display it
        frame.pack();
        frame.setVisible(true); // bez tohto sa to okno nezobrazi
    }
}

