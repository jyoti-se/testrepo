import java.util.Scanner;
 
class NumberFunction
{
   public static void main(String args[])
   {
      int n;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Input a number to check if it is an Armstrong number");      
      n = in.nextInt();
 
      boolean valid=armstrongValid(n) ;
     
      
      if (valid)
         System.out.println(n + " is an Armstrong number.");
      else
         System.out.println(n + " isn't an Armstrong number.");      
      
      in.close();
   }
  
      static boolean armstrongValid(int num)
   {
     
      int sum = 0, temp, remainder, digits = 0;
      temp = num;
     
      // Count number of digits
     
      while (temp != 0) {
         digits++;
         temp = temp/10;
      }
 
      temp = num;
 
      while (temp != 0) {
         remainder = temp%10;
         sum = sum + power(remainder, digits);
         temp = temp/10;
      }
 
      if (num == sum)
         return true;
      else
         return false;        
   }

	static int power(int n, int r) {
      int c, p = 1;
 
      for (c = 1; c <= r; c++)
         p = p*n;
 
      return p;  
   }
}