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
public class Bai16_hieu2songuyenlon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
             
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            BigInteger c=a.subtract(b);
            System.out.println(c);
        
    } 
}
