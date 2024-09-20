import java.util.Random;

public class Gerarnumeroaleatório {
public static void main(String[] args) {
    
    Random random= new Random();

    int Naleatorio = random.nextInt(100);
    System.out.println("Número aleatório :"+ Naleatorio);
    int Naleatorio2 = random.nextInt(100);
    System.out.println("Número aleatório :"+ Naleatorio2);
    int Naleatorio3 = random.nextInt(100);
    System.out.println("Número aleatório :"+ Naleatorio3);

    System.out.println((Naleatorio + Naleatorio2 + Naleatorio3) / 3 );







}
}
