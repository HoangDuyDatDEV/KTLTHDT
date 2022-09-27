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
public class Bai20_SoFibonacci {
    public static void main(String[] args) {
        long f[]=new long[100];
        f[1]=1;
        f[2]=1;
        for(int i=3;i<=92;i++){
            f[i]=f[i-1]+f[i-2];
        }
        Scanner in = new Scanner(System.in); 
        int t = in.nextInt() ;
        while(t -- > 0){
            int n = in.nextInt() ;
            System.out.println(f[n]);
        }
    }
}
