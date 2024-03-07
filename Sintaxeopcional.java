
package com.mycompany.sintaxeopcional;

import java.util.Locale;
import java.util.Scanner;


public class Sintaxeopcional {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner (System.in);
        
        /*int minutos = teclado.nextInt();
        double conta = 50.0;
        
        if(minutos > 100){
            conta = conta + (minutos - 100) * 2.0;
        }
        System.out.println("valor da conta = R$" + conta);
        teclado.close();*/
        
        int num1;
        num1 =teclado.nextInt();
        
        num1 +=5;
        System.out.println("seu numero é " + num1);
        
        num1 =teclado.nextInt();
        
        num1 *=2;
        System.out.println("seu numero é " + num1);
        
        
        
        
        
 
      
        }
    }

