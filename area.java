import java.util.Scanner;
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcular el área");
        System.out.print("Ingrese la base");
        float b= scanner.nextFloat(); 
        System.out.print("Ingrese la altura");
        float a= scanner.nextFloat(); 
        String unids = scanner.nextLine(); 
        float result=(b*a)/2;
        System.out.print("resultado:"+result);
     }
}
