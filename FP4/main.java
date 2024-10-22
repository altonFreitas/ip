 package FP4;
 import java.util.Scanner;
 public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int [] numero = new int[5];
        int soma = 0;
        double media = 0;
        System.out.print("Inserir 5 numeros inteiros : ");
        for(int i = 0; i < numero.length; i++){
            System.out.print("Numero " + (i+1) + " : ");
            numero[i] = scanner.nextInt();
            soma += numero[i];
        }
        media = (double) soma / numero.length;
        System.out.println("Soma dos numeros: " + soma);
        System.out.println("Media dos numeros: " + media);
    }
 
    
 }