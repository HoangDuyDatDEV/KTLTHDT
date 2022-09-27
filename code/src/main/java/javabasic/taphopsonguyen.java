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
public class taphopsonguyen {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int a[]= new int[1000];
        int b[]= new int[1000];
        int n =in.nextInt();
        int m =in.nextInt();
        
        for (int i = 0; i < n; i++) {
            a[in.nextInt()] =1;
        }
        
        for (int i = 0; i < m; i++) {
            b[in.nextInt()] =1;
        }
        
        for (int i = 0; i < 1000; i++) {
            if (a[i] == 1 && b[i] == 1) {
                System.out.print(i +" ");
            }
        }
        System.out.println();
        
        for (int i = 0; i < 1000; i++) {
            if (a[i] == 1 && b[i] == 0) {
                System.out.print(i +" ");
            }
        }
        System.out.println();
        for (int i = 0; i < 1000; i++) {
            if (a[i] == 0 && b[i] == 1) {
                System.out.print(i +" ");
            }
        }
        
        
    }
}
