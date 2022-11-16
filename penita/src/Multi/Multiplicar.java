
package Multi;

import javax.swing.JOptionPane;
import static suma.Suma.galletas;
import static suma.Suma.gaseosa;
import static suma.Suma.gomitas;
import static suma.Suma.helado;
import static suma.Suma.pastel;


public class Multiplicar {
    
    public static void Multi(){
     
        int galletitas = (int) galletas;
        int heladospa = (int) helado;
        int total = galletitas * heladospa * gomitas * pastel * gaseosa;
        JOptionPane.showMessageDialog(null,"La multiplicacion es:"+total );}
   
        
}
