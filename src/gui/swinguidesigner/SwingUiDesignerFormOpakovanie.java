package gui.swinguidesigner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingUiDesignerFormOpakovanie {
    private JTextField textField1;
    private JTextField textField2;
    private JButton OKButton;
    private JPanel mainPanel;

 public SwingUiDesignerFormOpakovanie() {
        OKButton.addActionListener(new ActionListener() {
        @Override
        public void  actionPerformed(ActionEvent e){
            //todo vypíš do konzoly meno a priezvisko
            System.out.println("Stlačil si OK");
            System.out.println("Meno: " + textField1.getText()); // vypise do konzoly meno
            System.out.println("Priezvisko: " + textField2.getText()); // vypise do konzoly priezvisko
            System.exit(0);
        }
     });
 }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingUiDesignerFormOpakovanie");
        frame.setMinimumSize(new Dimension(400, 300));
        frame.setContentPane(new SwingUiDesignerFormOpakovanie().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ked klikeme na x na okne tak sa zatvori standardne
        frame.setLocationRelativeTo(null); // vycentrovanie okna
        frame.pack(); // nech rozbali tie prvky
        frame.setVisible(true);
    }
}
