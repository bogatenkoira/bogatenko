/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leng;

import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;
//import java.until.InputMismatchException;
/**
 *
 * @author дом
 */
public class Leng {
       
    /**
     * @param args the command line arguments
     */
       public class Main {
               
           /**
            *
            * @param args
            * @throws IOException
            */
           public static void main(String[] args) 
        throws
        IOException {
        // TODO code application logic here
       int n = 0;
       while (true)
       {
           System.out.print ("Введите число строк");
           Scanner sc1 = new Scanner (System. in);
           try
           {
               n = sc1.nextInt ();
               break;
           }
            catch (InputMismatchException fg)
            {
                System.out.print ("Вы ввели не число.");
                
            }
                   }
       String [] str = new String [n];
       Scanner sc2 = new Scanner (System.in);
       for (int i = 0; i<n; i++)
       {
           System.out.println ("Введите строку №" +(i+1));
           str [i] = sc2.nextLine();
       }
       for (int i =0; i <str.length -1; i++)
       {
           for (int j = i+1; j < str. length; j++)
               
       
        if (str[i].length()<str[j].length())
        {
         String temp = str[i];
         str [i] = str [j];
         str [j] = temp;
         
        }
       }
           }
           int maxlength = str[0].length();
           System.out.println ("Строки в порядке убывания длины:");
           for (int i = 0; i <str.length; i++)
           {
               System.out.print (str[i]);
               for (int j = 0; j <maxlength - str[i].length(); j++)
                   System.out.print (" ");
               System.out.println ("ее длина =" + str[i].length());
           }
       }
}
//mistakes
       