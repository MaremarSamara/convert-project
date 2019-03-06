
package convert;
import java.util.Scanner;
public class Convert {
  
   public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the number to convert");
      int un=in.nextInt();
      System.out.println("Enter the power of number ");
      int t= in.nextInt();
      if(un>0 && un<=Math.pow(2,t)-1 && t>=0){
          if (un<=127)
              System.out.println("the number after convert " + (un));
          else
              System.out.println("the number after convert " + (un-Math.pow(2,t)));
      }
      else 
       System.out.println("Please Enter the positve number");   
    }
    
}
