import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        String nome;
        Double hrs, valorhr;
        Scanner teclado = new Scanner(System.in);
        System.out.println("nome do funcionário");
        nome= teclado.next();
        System.out.println("valor da hora trabalhada");
        valorhr= Double.parseDouble(teclado.next());
        System.out.println("horas trabalhadas");
        hrs= Double.parseDouble(teclado.next());
        System.out.println("\nFuncionário:"+nome+"\n");
        System.out.print("Valor da hora:"+valorhr+"| Horas trabalhadas:"+hrs);
        System.out.println("\nTotal a receber: R$"+(valorhr*hrs));
        System.out.println("tchau");
        teclado.close();

        
        












    
}}
