import java.util.Scanner;

public class trapezio {
    public static void main(String[] args) {
        String bsmaior, bsmenor, altur ;
        Double bzmaior, bzmenor, result, altura;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Base maior?");
        bsmaior= teclado.next();
        bzmaior= Double.parseDouble(bsmaior);
        

        System.out.println("Base menor?");
        bsmenor= teclado.next();
        bzmenor= Double.parseDouble(bsmenor);

        System.out.println("Altura?");
        altur= teclado.next();
        altura= Double.parseDouble(altur);



        result= (((bzmaior+bzmenor)/2)*altura);


        System.out.println("Área do trapézio ="+result);
        teclado.close();
       



    
}}
