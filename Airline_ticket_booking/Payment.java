import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment extends JFrame {
    private JTextField cardNumberField;
    private JTextField expiryDateField;
    private JTextField cvvField;
    private JTextField billingAddressField;

    public Payment() {
        setTitle("Payment Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        pack();
        setLocationRelativeTo(null);  // Center the frame on the screen
        setVisible(true);
    }

    private void initComponents() {
        Container container = getContentPane();
        container.setLayout(new GridLayout(5, 2, 10, 10));

        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberField = new JTextField();

        JLabel expiryDateLabel = new JLabel("Expiry Date:");
        expiryDateField = new JTextField();

        JLabel cvvLabel = new JLabel("CVV:");
        cvvField = new JTextField();

        JLabel billingAddressLabel = new JLabel("Billing Address:");
        billingAddressField = new JTextField();

        JButton submitButton = new JButton("Submit Payment");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Process the payment here
                // You can add code to validate and process the payment details
                JOptionPane.showMessageDialog(null, "Payment Successful!");
            }
        });

        container.add(cardNumberLabel);
        container.add(cardNumberField);
        container.add(expiryDateLabel);
        container.add(expiryDateField);
        container.add(cvvLabel);
        container.add(cvvField);
        container.add(billingAddressLabel);
        container.add(billingAddressField);
        container.add(new JLabel());  // Placeholder for spacing
        container.add(submitButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Payment());
    }
}
