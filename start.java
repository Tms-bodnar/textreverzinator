
package textreverzinator;

import java.util.Scanner;
import static textreverzinator.quest.quest;

/** Ebben az osztályban a beírt szöveget egy beállítóval beállítjuk,
 *  majd egy kiolvasóval kiolvassuk a privát written osztály written tagfüggvényéb?l.
 * A kiolvasott stringet char sorrá alakítjuk
 * majd kiírjuk
 *
 * @author bodnart
 */
public class start {
        public static void start() {
            
            written ir = new written(); // Létrehozunk egy új written objektumot
            
        
    Scanner input = new Scanner(System.in);
        
    System.out.println ("Írd be a szöveget: ");
    
    String user_input;
    
           user_input = input.nextLine(); //A név beírva
            
            ir.setIrat(user_input); //A beállítóval beallítjuk az ir objektumra a beírt srtinget
            
            String irat = ir.getIrat(); //A kiolvasóval kiolvassuk a privát stringet.
    
    char[] iratArray ;
            iratArray = irat.toCharArray(); //A string átváltva char tömbbé
                  
    int l ;
        l = iratArray.length; //A char tömb hossza   
             
    int varied ;
        varied = (l - 1); // A változó értéke a karakterek helyének megváltoztatásához
        
    while( varied >= 0){
     
        System.out.print(iratArray[varied]); // A tagfüggvényben megváltoztatjuk a karakterek helyét.
        
         varied = varied - 1;
       }
    
    if (varied < 0){
        
      System.out.println(", JÃ³ mi?") ;// Kiírjuk az eredményt, majd újraindítjuk a kérdést.
      
      quest();
      }
    }
    
}
