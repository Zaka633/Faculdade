import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {
        

        
        Scanner teclado = new Scanner(System.in);

        //mudei num1 para num3 para teste, mas não faz diferença alguma!

        System.out.println("digite o primeiro número:");
        int num3 = teclado.nextInt();

        System.out.println("digite o primeiro número:");
        int num2 =teclado.nextInt();
        System.out.println("o maior número é:"+(num3>num2?num3:num2));

        teclado.close();

        System.out.println("00000000");
       


    
}}
