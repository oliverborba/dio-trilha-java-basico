package exercicio_2.loops;

import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
 * EX.: 5!= 120 (5 X 4 X 3 X 2 X 1) 
 */
public class EX6_Fatoral {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;
        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }

}
