package exercicios1;
import java.util.Scanner;

public class imc{
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Digite seu peso em kg: ");
    double peso = teclado.nextDouble();
    System.out.print("Digite sua altura em metros: ");
    double altura = teclado.nextDouble();


    double imc = peso / (altura * altura);

    String situacao;
    if (imc < 18.5) {
        situacao = "Magro";
    } else if (imc < 25.0) {
        situacao = "Normal";
    } else if (imc < 30.0) {
        situacao = "Sobrepeso";
    } else if (imc < 35.0) {
        situacao = "Obeso";
    } else {
        situacao = "Obesidade mórbida";
    }

    System.out.printf("O seu IMC é: %.2f - Situação: %s%n", imc, situacao);

    
        teclado.close();
}
}







