import java.util.Scanner;

public class jogodefutebol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de gols do Nacional de Patos: ");
        int golsNacional = scanner.nextInt();
        
        System.out.print("Digite o número de gols do Treze: ");
        int golsTreze = scanner.nextInt();
        
        if (golsNacional > golsTreze) {
            System.out.println("Time vencedor: Nacional de Patos");
        } else if (golsTreze > golsNacional) {
            System.out.println("Time vencedor: Treze");
        } else {
            System.out.println("EMPATE");
        }
        scanner.close();
    }
}
