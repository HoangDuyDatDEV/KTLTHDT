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
public class Bai13_hop2dayso {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int m=in.nextInt();
        int a[]=new int[1000];
        int b[]=new int[1000];
        int res1[]=new int[1000];
        int res2[]=new int[1000];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
            res1[a[i]]++;
          System.out.println(res1[a[i]]);  
        }
        
         for(int j=0;j<m;j++){
            b[j]=in.nextInt();
            res2[b[j]]++;
            System.out.println(res2[b[j]]);  
        }
         for(int i=0;i<1000;i++){
             if(res1[i]>0 || res2[i]>0)
             {
                 System.out.print(i+" ");
             }
         }
    }
}
