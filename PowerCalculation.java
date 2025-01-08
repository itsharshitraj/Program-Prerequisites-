import java.util.*;
class PowerCalculation{
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give two numbers as input: a base and an exponent ");

   double base=sc.nextDouble();
   double exponent=sc.nextDouble();
     
   
   System.out.println("Power = " +  Math.pow(base,exponent));
}

}