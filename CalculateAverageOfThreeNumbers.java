import java.util.*;
class CalculateAverageOfThreeNumbers{
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give three numbers as input to calculate average ");

   float a=sc.nextFloat();
   float b=sc.nextFloat();
   float c=sc.nextFloat();
     
   
   System.out.println("Average = " + (a+b+c)/3);
}

}