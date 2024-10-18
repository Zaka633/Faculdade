package aula6;
public class pegarnome {
    public static void main(String[] args){

       String nome= "Ryan Rodrigues Guedes"; 
       String primeiro = nome.substring(0, nome.indexOf(" "));
       String ultimo = nome.substring(nome.lastIndexOf(" ")+1);

       System.out.println("Nome completo:"+ nome);
       System.out.println("Primeiro nome:"+ primeiro);
       System.out.println("ultimo nome:"+ ultimo);

       
    }
}
