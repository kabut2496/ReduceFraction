/*
 * Karl Butler
 * 3/25/2020
 * ReduceFraction
 * This program is used to reduce a fraction that the user chooses 
 */
package reducefraction;
import javax.swing.JOptionPane;
/**
 *
 * @author Karl Butler
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//declaring variables the string gNum is used because JOptionPanes only resives information as a string

        int n1,n2,answer,fN1,fN2;
        String gNum;

//Retriving user input
        
         gNum = JOptionPane.showInputDialog("Enter the numerator");
         n1=Integer.parseInt(gNum);
         
         gNum = JOptionPane.showInputDialog("Enter the Denominator");
         n2=Integer.parseInt(gNum);

//getting the gcd then dividing by that number to find the lowes numbers for the fraction
         
        answer = gcd(n1,n2);
        fN1=n1/answer;
        fN2=n2/answer;

//outputs       
        
        if(fN2==1){
            System.out.println("The fraction equals "+ fN1);
        }else if (fN2==0){
            System.out.println("This fraction is divided by 0 so it is not posible to do anything with");
        }else{
        System.out.println("The lowest term is " + fN1 + "/" + fN2);
        } 

        
        
    }
//the gcd methoud is used to find the gcd 
    static public int gcd(int a, int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
}
