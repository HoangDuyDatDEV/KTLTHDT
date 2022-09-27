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
Cho hai số a và b trong đó a≤1012, b≤10250. Nhiệm vụ của bạn là tìm ước số chung lớn nhất của hai số a, b.

Input:

Dòng đầu tiên đưa vào T là số lượng bộ test.
T dòng tiếp đưa các bộ test. Mỗi bộ test gồm hai dòng: dòng đầu tiên đưa vào số a; dòng tiếp theo đưa vào số b.
Các số T, a, b thỏa mãn ràng buộc: 1≤T≤100; 1≤a≤1012; 1≤b≤10250;
Output:

Đưa ra kết quả mỗi test theo từng dòng.
     Ví dụ:

 

Input

Output

1

1221

1234567891011121314151617181920212223242526272829

3

 
*/
import java.math.*;
import java.util.*;
public class Bai22_UocSonguyentolonnhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while (t -- > 0) {           
            long n;
            n=in.nextLong();
            while(n%2==0){
                n/=2;
            }
            for(long i=3;i<Math.sqrt(n);i+=2){
               while( n/i==0)
               {
                   n/=i;
               }
               if(n==1) System.out.println(i);
            }
            if(n>3) System.out.println(n);
            
        }
        
    } 
}
