import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {
        

        
        Scanner teclado = new Scanner(System.in);



        System.out.println("digite o primeiro número:");
        int num1 = teclado.nextInt();

        System.out.println("digite o primeiro número:");
        int num2 =teclado.nextInt();
        System.out.println("o maior número é:"+(num1>num2?num1:num2));

        teclado.close();

        System.out.println("00000000");
       


    
}}
