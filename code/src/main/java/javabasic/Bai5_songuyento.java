/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasic;

/**
 *
 * @author keuuu
 */
import java.util.*;
public class Bai5_songuyento {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t --> 0){
         int n=in.nextInt();
         if (songuyento(n)) {
           System.out.println("YES");
        } else {
           System.out.println("NO");
        }
        }
        
    }
    private static boolean songuyento(int n){
        if(n<2){
             return false;
         }
         for(int i=2;i<=Math.sqrt(n);i++)
         {
             if(n%i==0){
              return false;
             }
             
         }
         return true;
    }
}
