 package LogicIf;

import java.util.Scanner;

public class Exercicio1 {
     
     

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int senha;
       
         System.out.println("Digite a senha? ");
         senha = sc.nextInt();
         int senhaCriada = 970892;
          if (senha == senhaCriada) {
               System.out.println("Acesso Permitido");
          } else {
               System.out.println("Senha errada!");
          } 
      }
    
 }