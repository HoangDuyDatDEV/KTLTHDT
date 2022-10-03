
package OOP.Docfilevanban;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class main {
    public static void main(String[] args) throws  FileNotFoundException{
        Scanner sc=new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            System.out.println(s);
        }
        
    }
}
