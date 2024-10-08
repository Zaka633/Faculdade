package exercicios1;
import java.util.Scanner;

public class compare { public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        // Leitura dos nomes
        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 3; i++) {
            nomes[i] = scanner.nextLine();
        }

        // Encontrar o menor nome
        String menorNome = nomes[0];

        for (int i = 1; i < nomes.length; i++) {
            if (nomes[i].compareTo(menorNome) < 0) {
                menorNome = nomes[i];
            }
        }

        // Exibir o menor nome
        System.out.println("O menor nome é: " + menorNome);
        scanner.close();
 
}
}

