
/*package whatever //do not write package name here */
 
import java.io.*;
 
class shortCircuiting {
    public static void main (String[] args) {
     
        int a=10,b=20,c=15;
 
        // displaying b
        System.out.println("Value of b : "+b);
 
        
        if((a>c) && (++b>c)){
            System.out.println("Inside if block");
        }
 
     
        System.out.println("Value of b : "+b);
       
       
    }
}