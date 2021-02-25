import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JanelaApp extends JFrame  {
    private  JLabel temp;
    public JanelaApp(String nome){
        setTitle(nome);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(1, 0, 0, 0));
        this.setBackground(Color.YELLOW);
      temp=new JLabel();
        contentPane.add(temp);

        Geladeira.getInstance().getRefrigerador().addListener(new ListenerRefri(temp));
    }
}
