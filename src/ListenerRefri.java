import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerRefri implements ActionListener {
    private JLabel txt;

    public ListenerRefri(JLabel txt){
        this.txt=txt;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    }

    public void atualizaTemp (float temp){
        this.txt.setText("Temperatura atual : "+ temp);
    }
}
