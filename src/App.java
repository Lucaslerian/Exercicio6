import java.util.Scanner;

public class App {
    public static void main (String [] args){
        // Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.    
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque o raio do círculo");
        double raio = sc.nextDouble();
        sc.close();
    
        // Calcular a área do círculo
        // PI () * Potência (x,2)
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo de raio " + raio + " é igual a " + area);
        }
    }