package exercicios1;
import java.util.Scanner;

public class divisaosenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Cadastre uma senha: ");
        String senhaCadastrada = scanner.nextLine();

        
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        
        System.out.print("Digite a senha para continuar: ");
        String senhaInformada = scanner.next();

        
        if (senhaInformada.equals(senhaCadastrada)) {
           
            if (numero2 != 0) {
                double resultado = (double) numero1 / numero2;
                System.out.printf("Resultado da divisão: %.2f%n", resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        } else {
            System.out.println("Senha incorreta. Encerrando o aplicativo.");
            System.exit(0);
        }

        scanner.close();
    }
}
