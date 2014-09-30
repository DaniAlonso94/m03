/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1;

/**
 *
 * @author Dani-Insti
 */
public class TiposDatosPrimitivos {
     public static void main(String[] args) {
         boolean s1, s2, s3, luz1, luz2;
         
         int n;
         
         double d;
         
         char car;
         
         String cadena;
         
         n = 3 * 3 - 20 / 5 + 8;
         
         d = 3.0;
         
         s1 = true;
         s2 = false;
         s3 = true;
         
         luz1 = ((8 * 5) != 4 ) && !(50<6.5);
         /* luz1 = (((3 + 4) == 7 )&&!(12.3 > 2.11)||('a' == 'b')); */
         luz2 = s2 == s3 || s1;
         
         car = 'c';
         
         cadena = "ñaskdfjasñdklfj";
         
         System.out.println(luz1);
         
         /*
         
         boolean a = false;
         boolean b = true;
         boolean c = false;
         
         a b c luz1 luz 2
         0 0 0  0    1
         0 0 1  1    1
         
         */ 
     }
    
}
