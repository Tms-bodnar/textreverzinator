
package textreverzinator;

import java.util.Scanner;
import static textreverzinator.start.start;


/**
 *Ebben az oszt�lyban az app indul�s�t �ll�tjuk be egy k�rd�s-v�lasszal
 * @author bodnart
 */
public class quest {
        public static void quest() {
            
    Scanner user_input = new Scanner(System.in);
     
    System.out.println("Megford�tsak valamit? (i)");
              
    char V;
    
         V = user_input.next().charAt(0);
         
         if ('i' == V){
             
            start() ; //Ha a v�lasz 'i', akkor ind�tja a megford�t�t.
         }
         
         else{
             
          System.out.println("Tal�n majd legk�zelebb!");  //Ha a v�lasz nem 'i', akkor kil�p.
          
        System.exit(0);
        
        }
                   
       }
    
}
