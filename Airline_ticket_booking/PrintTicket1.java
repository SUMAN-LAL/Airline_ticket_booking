import javax.swing.*;
import java.awt.*;

public class PrintTicket1 extends JFrame {
    public PrintTicket1(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, Integer iPrice, String sTime) {
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(14, 1));

        JLabel title = new JLabel("<html><b><font color=\"#C71585\",size=\"7\">AirLine Ticket</font></b></html>");
        JLabel from = new JLabel("<html><b><font color=\"#000000\">From: </font></b><font color=\"#778899\">" + sFrom + "</font></html>");
        JLabel to = new JLabel("<html><font color=\"#000000\">To: </font><font color=\"#778899\">" + sTo + "</font></html>");
        JLabel flightClass = new JLabel("<html><font color=\"#000000\">Class: </font><font color=\"#778899\">" + sClass + "</font></html>");
        // Add other labels similarly...

        panel.add(title);
        panel.add(from);
        panel.add(to);
        panel.add(flightClass);
        // Add other labels similarly...

        panel.setBackground(Color.white);
        c.add(panel, BorderLayout.CENTER);

        setSize(700, 650);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PrintTicket1("From", "To", "Economy", 2, 1, 0, "2022-01-18", 500, "12:00 PM"));
    }
}
