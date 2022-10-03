
package OOP.khaibaolopsinvien;

import java.text.ParseException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {
    Scanner sc= new Scanner(System.in);
    sinhvien sv=new sinhvien( sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextFloat());
        System.out.println(sv);   
    }
     
}
