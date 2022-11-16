
package Prom;

import javax.swing.JOptionPane;
import static suma.Suma.galletas;
import static suma.Suma.gaseosa;
import static suma.Suma.gomitas;
import static suma.Suma.helado;
import static suma.Suma.pastel;


public class Promedio {
    public static void Opr(){
        int galletitas = (int) galletas;
        int heladospa = (int) helado;
        int total = ( galletitas * heladospa * gomitas * pastel * gaseosa)/5;
        JOptionPane.showMessageDialog(null,"El promedio de los productos son:" + total);
    }
}
