import java.util.*;
class VolumeOfCylinder{
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give radius and height as input to calculate volume of a cylinder ");

   Float radius=sc.nextFloat();
   Float height=sc.nextFloat();
   
   System.out.println("Volume of Cylinder = " + (Math.PI*radius*radius*height));
}

}