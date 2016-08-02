
package textreverzinator;

import java.util.Scanner;
import static textreverzinator.start.start;


/**
 *Ebben az osztályban az app indulását állítjuk be egy kérdés-válasszal
 * @author bodnart
 */
public class quest {
        public static void quest() {
            
    Scanner user_input = new Scanner(System.in);
     
    System.out.println("Megfordítsak valamit? (i)");
              
    char V;
    
         V = user_input.next().charAt(0);
         
         if ('i' == V){
             
            start() ; //Ha a válasz 'i', akkor indítja a megfordítót.
         }
         
         else{
             
          System.out.println("Talán majd legközelebb!");  //Ha a válasz nem 'i', akkor kilép.
          
        System.exit(0);
        
        }
                   
       }
    
}
