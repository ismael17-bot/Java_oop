
import javax.swing.*;

import java.awt.*;

public class Main
{
   public static void main(String[] args) {

       JanelaApp j1 = new JanelaApp("ismael");
       j1.setVisible(true);

       Geladeira geladeira=Geladeira.getInstance();
       geladeira.selecionarTemperatura(1);

   }

}
