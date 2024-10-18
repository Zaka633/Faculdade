import java.util.Scanner;

public class verificarsenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        
        if (senha.equals("123456")) {
            System.out.println("Acesso liberado.");
        } else {
            System.out.println("Acesso negado.");
        }
        
        scanner.close();
    }
}
