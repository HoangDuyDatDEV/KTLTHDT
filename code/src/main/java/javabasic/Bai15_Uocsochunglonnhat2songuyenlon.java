/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasic;

/**
 *
 * @author keuuu
 */
/*
Cho số nguyên dương N. Hãy đưa ra ước số nguyên tố lớn nhất của N.

Input:

Dòng đầu tiên đưa vào số lượng bộ test T.
Những dòng kế tiếp đưa vào T bộ test. Mỗi bộ test ghi số nguyên dương N.
T, N thỏa mãn ràng buộc: 1≤T≤100; 2≤N≤1010.
Output:

Đưa ra kết quả mỗi test theo từng dòng.
      Ví dụ:

 

Input:

Output:

2

315

31

7

31
*/
import java.math.BigInteger;
import java.util.Scanner;

public class Bai15_Uocsochunglonnhat2songuyenlon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
     int t = in.nextInt() ;
     while(t -- > 0){    
       
        BigInteger a = in.nextBigInteger();
        BigInteger b= in.nextBigInteger() ;
        BigInteger gcd = b.gcd(a) ;
        
         System.out.println(gcd);
       
     }
}
}