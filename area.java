import java.util.Scanner;
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int opc=0;
        float result, a, b, h;
        String resp;
        while(opc!=4){
            do{
                printMenu();
                opc = scanner.nextInt(); 
                if(opc<=0||opc>4)
                    System.out.print("Error debe ser mayor a cero y menor a 4\n");
            }while (opc<=0||opc>4);
            
            switch(opc){
                case 1: 
                    System.out.println("Calcular el área del cuadrado\n");
                    System.out.print("Ingrese el lado: ");
                    a = scanner.nextFloat(); 
                    result=a*a;
                    System.out.print("resultado: "+result+"\n");
                    break;
                case 2: 
                    System.out.println("Calcular el área del triángulo");
                    System.out.print("Ingrese la base:: ");
                    b= scanner.nextFloat(); 
                    scanner.nextLine(); 
                    System.out.print("Ingrese la altura: ");
                    h= scanner.nextFloat(); 
                    result=(b*h)/2;
                    System.out.print("resultado: "+result+"\n");
                    break;
                case 3: 
                    System.out.println("Calcular el área del rectángulo");
                    System.out.print("Ingrese la base: ");
                    b = scanner.nextFloat(); 
                    System.out.print("Ingrese la altura: ");
                    scanner.nextLine(); 
                    h=scanner.nextFloat(); 
                    result=b*h;
                    System.out.print("resultado: "+result+"\n");
                    break;
                case 4:
                    System.out.print("Saliendo del sistema\n");
                    break;
            }
            scanner.nextLine(); 
            if(opc!=4){
                System.out.print("Desea continuar (s|N): ");
                resp = scanner.nextLine(); 
                if( resp=="N"){
                    opc=4;
                    System.out.print("Saliendo del sistema\n");
                }
            }
        }
     }
     public static void printMenu(){
         System.out.print("Área de la figuras\n");
         System.out.print("1. Cuadrado\n");
         System.out.print("2. Triángulo\n");
         System.out.print("3. Rectángulo\n");
         System.out.print("4. Salir\n");
         System.out.print("Seleccione una opción: ");
        }
}