import java.util.Scanner;
public class notas { 
    public static void main(String[] args) {

        double nota1, nota2, nota3, media;
        Scanner entrada = new Scanner(System.in);

        System.out.println("1 nota:");
        nota1 = Double.parseDouble(entrada.nextLine());
         
        System.out.println("2 nota:");
        nota2 = Double.parseDouble(entrada.nextLine());

        System.out.println("3 nota:");
        nota3 = Double.parseDouble(entrada.nextLine());

        media= (nota1+ nota2+ nota3) / 3;
        System.out.println("a Média é:"+ media );
        entrada.close();


    }


    
}