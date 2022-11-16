package suma;

import Alejandro.Rodriguez.Principal;
import javax.swing.JOptionPane;


public class Suma {
     
   public static double galletas = 1000;
     public static double helado = 800;
       public static int gomitas = 500;
         public static int pastel = 1400;
          public static int gaseosa = 250;
           public static int raciones;
            public static int total;
              
public static void Galletas(){
    JOptionPane.showMessageDialog(null,"El valor de las galletas son" +galletas );
    
    raciones=Integer.parseInt(JOptionPane.showInputDialog("Cuales son las unidades que desea"));
 
   int galletitas = (int) galletas;
    
   total= galletitas * raciones;
   
   JOptionPane.showMessageDialog(null,"El valor es:" + total);
    
}   
   
public static void Helado(){
    JOptionPane.showMessageDialog(null,"El valor del  helado es" +helado );
    
    raciones=Integer.parseInt(JOptionPane.showInputDialog("Cuales son las unidades que desea"));
 
   int heladospa = (int) helado;
    
   total= heladospa * raciones;
   
   JOptionPane.showMessageDialog(null,"El valor es:" + total);
    
}   
       
public static void Gomitas(){
    JOptionPane.showMessageDialog(null,"El valor de las gomitas son" +gomitas );
    
    raciones=Integer.parseInt(JOptionPane.showInputDialog("Cuales son las unidades que desea"));
 
   total= gomitas * raciones;
   
   JOptionPane.showMessageDialog(null,"El valor es:" + total);
    
}   
            
public static void Pastel(){
    JOptionPane.showMessageDialog(null,"El valor del pastel es" +pastel );
    
    raciones=Integer.parseInt(JOptionPane.showInputDialog("Cuales son las unidades que desea"));
 
   total= pastel * raciones;
   
   JOptionPane.showMessageDialog(null,"El valor es:" + total);
    
}               
            
            
public static void Gaseosa(){
    JOptionPane.showMessageDialog(null,"El valor de la gaseosa es" +gaseosa );
    
    raciones=Integer.parseInt(JOptionPane.showInputDialog("Cuales son las unidades que desea"));
 
   total= gaseosa * raciones;
   
   JOptionPane.showMessageDialog(null,"El valor es:" + total);
    
}               
            
            
            
            
            
            
                   
            
public static void sumaobjetos(){
                
                char Va_principal;
                
                Principal principal = new Principal();
                
                Va_principal= JOptionPane.showInputDialog("¿Cuales son los objetos que quiere sumar? \n "
                        + "Escoje la opcion\n"
                        + "\n(A)Galletas"
                        + "\n(B)helado"
                        + "\n(C)gomitas"
                        + "\n(D)pastel"
                        + "\n(E)gaseosa").charAt(0);
                
                if (Va_principal == 'A'){
                    
                     Galletas(); 
                
                }
                else if (Va_principal== 'B' ){
                    
                     Helado(); 
                
                }
                else if (Va_principal== 'C'){
                    
                     Gomitas(); 
                
                }
                else if (Va_principal== 'D'){
                    
                     Pastel(); 
                
                }
                else if (Va_principal== 'E'){
                    
                     Gaseosa(); 
                
                }
                else{ JOptionPane.showMessageDialog(null,"Opcion errada");
                   sumaobjetos();}
                
            }
   
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    public static void Sumatorioa() {
       
        
        
    
    
     }    

    
    
    
    
    
}
