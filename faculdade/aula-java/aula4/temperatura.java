import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        String grausf;
        Double grauf, grausc;
        Scanner teclado = new Scanner(System.in);



        System.out.println("Graus fahrenheit?");
        grausf= teclado.next();
        grauf= Double.parseDouble(grausf);

        grausc = (((grauf-32)/9)*5);

       

        System.out.println("Grau fahrenheit:"+grauf+" Graus Celsius:"+grausc);
        
        teclado.close();

    }}