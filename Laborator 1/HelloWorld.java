import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hello World!");
        int valoareDeLaTastatura = sc.nextInt();
        
        
        System.out.println("Valoarea citita de la tastatura: " + valoareDeLaTastatura);
        sc.close();
    }

}
