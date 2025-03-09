package pkg123230236_if.b_tugas1pbo;

import javax.swing.*;
import java.awt.*;

public class PurchaseFrame extends JFrame {
    public PurchaseFrame(String category, int price) {
        setTitle("Halaman Pembelian");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Kategori"));
        add(new JLabel(category));

        add(new JLabel("Harga"));
        add(new JLabel("Rp" + price + " /pcs"));

        add(new JLabel("Jumlah"));
        JTextField quantityField = new JTextField();
        add(quantityField);

        JButton backButton = new JButton("Kembali");
        JButton buyButton = new JButton("Beli");

        add(backButton);
        add(buyButton);

        add(new JLabel("Total Pembelian"));
        JLabel totalLabel = new JLabel("Rp0");
        add(totalLabel);

        add(new JLabel("Jumlah"));
        JLabel quantityLabel = new JLabel("0 pcs");
        add(quantityLabel);

        add(new JLabel("Total Harga"));
        JLabel finalTotalLabel = new JLabel("Rp0");
        add(finalTotalLabel);

        buyButton.addActionListener(e -> {
            try {
                String input = quantityField.getText().trim();

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("Jumlah tidak boleh kosong!");
                }

                int quantity = Integer.parseInt(input);

                if (quantity <= 0) {
                    throw new IllegalArgumentException("Jumlah harus lebih dari 0!");
                }

                int total = quantity * price;
                totalLabel.setText("Rp" + price);
                quantityLabel.setText(quantity + " pcs");
                finalTotalLabel.setText("Rp" + total);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        backButton.addActionListener(e -> dispose());

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
