import java.util.Scanner;
public class valorprod {
    public static void main(String[] args) {
        String valueprod, clientpag ;
        Double valorprod, clientepag, valortroco;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Qual o valor do produto?");
        valueprod= teclado.next();
        valorprod= Double.parseDouble(valueprod);
        

        System.out.println("Quanto o cliente pagou?");
        clientpag= teclado.next();
        clientepag= Double.parseDouble(clientpag);

        valortroco= (clientepag- valorprod);


        System.out.println("Preço do produto: R$"+valorprod+"| Valor recebido: R$"+clientepag );
        System.out.println("\nTroco para o cliente: R$"+valortroco);
        teclado.close();

        

        





    


    
}}
