import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana1 extends JFrame {
    private JPanel pnlBase;
    private JButton btnnn;
    private JDialog comu;
    private String info;

    public void metodo() {
    }

    public String getInfo() {
        return info;
    }

    public Ventana1() {
        btnnn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comu=new Ventana2(Ventana1.this);
                comu.setTitle("Ventana");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana1");
        frame.setContentPane(new Ventana1().pnlBase);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
