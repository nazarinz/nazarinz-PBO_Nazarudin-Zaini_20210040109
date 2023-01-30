
import javax.swing.*;
import java.awt.*;

public class Kalkulator extends JFrame {

    JTextField txt = new JTextField(50);

    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btn0 = new JButton("0");
    JButton btnEqual = new JButton("=");
    JButton btnPlus = new JButton("+");
    JButton btnMinus = new JButton("-");
    JButton btnMultiply = new JButton("*");
    JButton btnDivide = new JButton("/");
    JButton btnPercent = new JButton("%");
    JButton btnModulo = new JButton("Mod");
    JButton btnExit = new JButton("Exit");

    Kalkulator(int sizex, int sizey) {
        super("Kalkulator");
        setSize(sizex, sizey);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.GREEN);
        setLocationRelativeTo(null);

        FlowLayout fl = new FlowLayout();
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(fl);
        inputPanel.add(txt);
        add(inputPanel, BorderLayout.NORTH);

        GridLayout gl = new GridLayout(3, 5);
        JPanel btnPannel = new JPanel();
        btnPannel.setLayout(gl);

        btnPannel.add(btn1);
        btnPannel.add(btn2);
        btnPannel.add(btn3);
        btnPannel.add(btn4);
        btnPannel.add(btn5);
        btnPannel.add(btn6);
        btnPannel.add(btn7);
        btnPannel.add(btn8);
        btnPannel.add(btn9);
        btnPannel.add(btn0);
        btnPannel.add(btnEqual);
        btnPannel.add(btnPlus);
        btnPannel.add(btnMinus);
        btnPannel.add(btnMultiply);
        btnPannel.add(btnDivide);
        btnPannel.add(btnPercent);
        btnPannel.add(btnModulo);
        btnPannel.add(btnExit);

        add(btnPannel, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        Kalkulator kal = new Kalkulator(350, 250);
    }
}
