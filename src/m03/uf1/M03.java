/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M03;

     import java.util.Scanner;


/**
 *
 * @author Dani-Insti
 */
public class M03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

Scanner teclado = new Scanner(System.in);



        int n1;
        int n2;
        int resultado;
        
        System.out.println("Introduce un numero");
        n1 = teclado.nextInt();
        
        System.out.println("Introduce otro numero");
        n2 = teclado.nextInt();
        
        System.out.println("Introduce el resultado de la suma");
        resultado = teclado.nextInt();
        
        if (n1 + n2 == resultado) {
            System.out.println("correcto");
        } else {
            System.out.println("Error");
            
        } 
        
        resultado = n1 + n2;
        
        System.out.println("El resultado es: " + resultado);
        // TODO code application logic here
    }
    
}
