package gui.niecoOmne;
/*Vytvorte grafickú aplikáciu prostredníctvom Swing, kde sa predstavíte. Aplikácia, resp. okno bude obsahovať Vašu fotografiu (ak chcete) alebo miesto, kde žijete + odkaz na Váš LinkedIn, príp. Facebook, Instagram, príp. hypertextové odkazy na obľúbené stránky + text o Vás (kde pracujete, odkiaľ pochádzate, skúsenosti s programovaním, koníčky, atď.). V okne bude iba jedno jediné tlačidlo Ok, ktoré zatvorí aplikáciu a vypíše obsah celého textu do konzoly.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {

// okno sme si vytvorili, nastavili velkost, nastavili zatvorenie, vycentrovali
    JFrame frame = new JFrame("Niečo o Radovane Vyšňanovej.");
    frame.setMinimumSize(new Dimension(600, 400));
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);// týmto zakažeme zvačšovať a zmenšovať okienko


        JPanel panel = new JPanel();
        panel.setLayout(null); // ked je tento set Layout prazdny, čiže null, musíme použít tie setBound komponenty, ktoré naplnime
        panel.setBackground(Color.cyan);
        frame.setContentPane(panel); // my dany panel pridame do frame


 // Vytvoříte JLabel pre obrázok
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\radov\\Downloads\\20230812_063747.jpg"); // Změňte cestu na skutečnou cestu k fotce
// Prisposobenie obrazku na požadované rozmery
        Image image = imageIcon.getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);

        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(20, 50, 150, 200); // x, y, šířka, výška
        panel.add(imageLabel);
// todo vložiť osobitne odkaz na instagram, a aby po kliknuti len na ten odkaz sa stranka otvorila, taktiež zmenit kurzor na sipku

// Vytvoříte JLabel s HTML značkami pro zalomení textu použíte z GPT
        JLabel labelText = new JLabel("<html>Meno Priezvisko: Radovana Vyšňanová<br>Miesto narodenia: Liptovský Mikuláš,<br>vek: 32<br>Aktuálne žijem v Banskej Štiavnici,<br>Pracujem v štátnej správe,<br>Deti: 12r, 4r,<br> Skúsenosti s programovaním doposiaľ nemám. <br>Tento kurz som si vybrala, aby som nadobudla nové<br>skúsenosti/poznatky a nahliadla do IT sveta. <br> Koníčky: všeobecne športy zimné/letné, turistika, cestovanie, knihy. <br ><br>Instagram: <a href='https://www.instagram.com/baklazan_bordovy/'>Odkaz na Instagram</a> </html>");
        labelText.setBounds(200, 0, 500, 300); // x, y, šířka, výška
        panel.add(labelText);


// Tlačidlo OK
        JButton btnOk = new JButton("OK");
        btnOk.setBounds(450, 300, 80, 20);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING)); // tento prikaz korektne zatvori celu aplikaciu
            }
        });
        panel.add(btnOk);

        labelText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.instagram.com/baklazan_bordovy/"));
                } catch (IOException | URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        });



// bez tohto sa nam okno ani neotvori
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
