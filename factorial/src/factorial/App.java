package factorial;

import java.util.*; 
import java.io.*;

class App {  
  public static int FirstFactorial(int num) { 
        
    int sum = 0 ;    
    
    for (int i = num ; i > 0; i --){
        if (i == num){
            num = i * (num -1) ;
            i --;

        } else {
            num = num * i;

        }
    }
    return num;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextInt())); 
  }   
  
}








  