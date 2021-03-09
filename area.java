import java.util.Scanner;
import java.util.*;

public class HelloWorld{

     public static void main(String []args){

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcular el área");
        System.out.print("Ingrese el lado: ");
        float a = scanner.nextFloat(); 
        System.out.print("Ingrese las unidades: ");
        scanner.nextLine(); 
        String unids = scanner.nextLine(); 
        float result=a*a;
        System.out.print("resultado:"+result);
     }
}