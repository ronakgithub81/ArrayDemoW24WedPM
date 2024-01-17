
package arraydemowin24wedpm;

import java.util.Scanner;

/**
 *
 * @author Ronak
 */
public class ArrayDemoWin24WedPM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter word");
        Scanner input = new Scanner(System.in);
        
        String myWord = input.nextLine();
        
        char[] myLetters = new char[myWord.length()];
        
        for(int i =0;i<myLetters.length;i++){
            myLetters[i]= myWord.charAt(i);
            /*
            Sheridan 
            myLetters[0]=s
            myLetters[1]=h
            myLetters[2]=e
            myLetters[3]=r
            myLetters[4]=i
            myLetters[5]=d
            myLetters[6]=a
            myLetters[7]=n=length -1
            length = 8 
            */
            }
        System.out.println("Printing in reverse");
        for(int i = myLetters.length-1;i>=0 ;i--){
            System.out.print(myLetters[i]);
        }
    }//end of main
    
}//end of class

