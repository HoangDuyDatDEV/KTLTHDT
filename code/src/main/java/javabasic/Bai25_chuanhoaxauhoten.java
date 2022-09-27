/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasic;

/**
 *
 * @author keuuu
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai25_chuanhoaxauhoten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){          
            String name = sc.nextLine();  
            StringTokenizer st = new StringTokenizer(name);
          
            while(st.hasMoreTokens()){
                String temp = st.nextToken();
                String first = temp.substring(0,1);
                String last = temp.substring(1, temp.length());
                name = first.toUpperCase()+ last.toLowerCase();
                System.out.print(name+" ");

            }
              System.out.println();
        }
        
    }
    
}