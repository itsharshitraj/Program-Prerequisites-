import java.util.*;
class PerimeterOfRectangle{
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give Length and Width as input to calculate Perimeter of Rectangle ");

   Float length=sc.nextFloat();
   Float width=sc.nextFloat();
     
   
   System.out.println("Perimeter of Rectangle = " +  (2 * (length + width)));
}

}