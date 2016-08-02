
package textreverzinator;

import java.util.Scanner;
import static textreverzinator.quest.quest;

/** Ebben az oszt�lyban a be�rt sz�veget egy be�ll�t�val be�ll�tjuk,
 *  majd egy kiolvas�val kiolvassuk a priv�t written oszt�ly written tagf�ggv�ny�b?l.
 * A kiolvasott stringet char sorr� alak�tjuk
 * majd ki�rjuk
 *
 * @author bodnart
 */
public class start {
        public static void start() {
            
            written ir = new written(); // L�trehozunk egy �j written objektumot
            
        
    Scanner input = new Scanner(System.in);
        
    System.out.println ("�rd be a sz�veget: ");
    
    String user_input;
    
           user_input = input.nextLine(); //A n�v be�rva
            
            ir.setIrat(user_input); //A be�ll�t�val beall�tjuk az ir objektumra a be�rt srtinget
            
            String irat = ir.getIrat(); //A kiolvas�val kiolvassuk a priv�t stringet.
    
    char[] iratArray ;
            iratArray = irat.toCharArray(); //A string �tv�ltva char t�mbb�
                  
    int l ;
        l = iratArray.length; //A char t�mb hossza   
             
    int varied ;
        varied = (l - 1); // A v�ltoz� �rt�ke a karakterek hely�nek megv�ltoztat�s�hoz
        
    while( varied >= 0){
     
        System.out.print(iratArray[varied]); // A tagf�ggv�nyben megv�ltoztatjuk a karakterek hely�t.
        
         varied = varied - 1;
       }
    
    if (varied < 0){
        
      System.out.println(", Jó mi?") ;// Ki�rjuk az eredm�nyt, majd �jraind�tjuk a k�rd�st.
      
      quest();
      }
    }
    
}
