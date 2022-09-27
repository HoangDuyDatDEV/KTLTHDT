/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasic;

/**
 *
 * @author keuuu
 */
import java.math.*;
import java.util.Scanner;
public class chiahet {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        while (t -- > 0) {           
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
             BigInteger res1 = a.mod(b);
            BigInteger res2 = b.mod(a);
            if(res1.toString().equalsIgnoreCase("0")||res2.toString().equalsIgnoreCase("0"))
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}