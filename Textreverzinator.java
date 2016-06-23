/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textreverzinator;
import java.util.Scanner;
/**
 *
 * @author bodnart
 */
public class Textreverzinator {


    /**
     * @param args the command line arguments
     *
     */
    
   
    public static void main(String[] args) {
     quest();
    }
           /*itt kérdezünk
      *     
      *
      */  
     
    public static void quest() {
            
    Scanner user_input = new Scanner(System.in);
     
    System.out.println("Megfordítsak valamit? (i)");
              
    char V;
         V = user_input.next().charAt(0);
         if ('i' == V){
            start() ;
         }
         else{
          System.out.println("Talán majd legközelebb!");
        System.exit(0);
        }
                   
       }

    /**
     *Itt indul a fordítás, ha igent választott
     */
    public static void start() {
        
    Scanner user_input2 = new Scanner(System.in);
        
    System.out.println ("Írd be a szöveget: ");
    
    String origName;
            origName= user_input2.nextLine(); //A név beírva
    
    char[] charName ;
        charName = origName.toCharArray(); //A string átváltva char sorrá
                  
    int x ;
        x = charName.length; //A char sor hossza   
             
    int varied ;
        varied = (x - 1); // A változó értéke a karakterek helyének megváltoztatásához// A változó értéke a karakterek helyének megváltoztatásához
        
    while( varied >= 0){
     
        System.out.print(charName[varied]);
        
         varied = varied - 1;
       }
    
    if (varied < 0){
        
      System.out.println(", Jó mi?") ;
      
      again();
      }
    }
    public static void again(){
        
      quest();
        
    }
} 



   

