/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alejandro.Rodriguez;

import Multi.Multiplicar;
import Prom.Promedio;
import javax.swing.JOptionPane;
import suma.Suma;

/**
 *
 * @author 204
 */
public class Principal {
    
    public static void main  (String[] args) {
        
       int Va_principal;
       
       JOptionPane.showMessageDialog(null, "Te damos la bienvenida a la penita");
       
       Va_principal = Integer.parseInt(JOptionPane.showInputDialog("Seleciona lo que deseas realizar"));
       
       Suma suma = new Suma ();
       Multiplicar multiplicar = new Multiplicar ();
       Promedio promedio = new Promedio();
       
       switch (Va_principal){
           
              case 1 :
           
              Suma.sumaobjetos();
              break;
              
              case 2 : 
                  Multiplicar.Multi();
              break; 
              
              case 3 : 
                  Promedio.Opr();
              break; 
              
       }     
       
       
       
       
       
       
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
}
       
       
       
       
       
       
        
        
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    

