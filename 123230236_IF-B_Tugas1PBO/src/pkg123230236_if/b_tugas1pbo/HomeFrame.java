package pkg123230236_if.b_tugas1pbo;

import javax.swing.*;
import java.awt.*;

public class HomeFrame extends JFrame {
    public HomeFrame(String username) {
        setTitle("Halaman Utama");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Selamat Datang, " + username, SwingConstants.CENTER);
        add(welcomeLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        JButton anakButton = new JButton("Majalah Anak");
        JButton remajaButton = new JButton("Majalah Remaja");
        JButton dewasaButton = new JButton("Majalah Dewasa");

        anakButton.addActionListener(e -> new PurchaseFrame("Majalah Anak", 10800));
        remajaButton.addActionListener(e -> new PurchaseFrame("Majalah Remaja", 15200));
        dewasaButton.addActionListener(e -> new PurchaseFrame("Majalah Dewasa", 25400));

        buttonPanel.add(anakButton);
        buttonPanel.add(remajaButton);
        buttonPanel.add(dewasaButton);

        add(buttonPanel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
