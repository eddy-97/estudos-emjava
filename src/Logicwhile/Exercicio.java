package Logicwhile;

import java.util.Scanner;

public class Exercicio {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int maxDePedido = 99;
         int numDePedidos;
         System.out.println("Mostre o numero de Pedidos para o Transporte: ");
          numDePedidos = sc.nextInt();
         while (numDePedidos != maxDePedido) {
            if (numDePedidos <= 80) {
               System.out.println("Truck");
               break;  
            }
            if (numDePedidos <= 70) {
               System.out.println("Truck-50");
              break;
            }
            if (numDePedidos <= 65) {
               System.out.println("Micro-Truck");
               break;
            }
            if (numDePedidos <= 99) {
                System.out.println("Cross-Truck");
                break;
            }
         }
        System.out.println("Excedeu o numero de pedidos!");
        } 
        
    }