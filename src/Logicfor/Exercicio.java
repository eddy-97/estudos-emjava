package Logicfor;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = 5;
        int[]  vetor =  new int[codigo];
        
        for (int i = 0; i < codigo; i++) {
            vetor[i] = sc.nextInt();
            System.out.println("O cód dos Trucks: " + i);
        }
    }
}
