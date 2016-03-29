/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Praktikum
 */
import java.util.Scanner;
public class Fibonacci
{
 public static void main(String[]args)
 {
  int a=0,b=1,hasil=0,c, jumalah ;
   Scanner input = new Scanner (System.in);
   System.out.print ("Masukan Deret Fibonacci  : ");
        c = input.nextInt ();
        for(int i=1; i<=c; i++){           
    a=b;
    b=hasil;
    System.out.print(hasil+" ");
    hasil=a+b;
    jumlah=hasil+hasil;
    }
    } 
}
