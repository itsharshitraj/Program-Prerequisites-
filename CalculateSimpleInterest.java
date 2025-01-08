import java.util.*;
class CalculateSimpleInterest{
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give principal amount, rate of interest and time in years as input to calculate Simple Interest ");

   Float Principal=sc.nextFloat();
   Float Rate=sc.nextFloat();
   Float Time=sc.nextFloat();
   
   
   
   System.out.println("Simple Interest = " + ((Principal * Rate * Time) / 100));
}

}