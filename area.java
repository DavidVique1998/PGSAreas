import java.util.Scanner;
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcular el área");
        System.out.print("Ingrese la base: ");
        float b = scanner.nextFloat(); 
        System.out.print("Ingrese la altura: ");
        scanner.nextLine(); 
        float h=scanner.nextFloat(); 
        float result=b*h;
        System.out.print("resultado:"+result);
     }
}