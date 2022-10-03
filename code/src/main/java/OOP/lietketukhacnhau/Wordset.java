
package OOP.lietketukhacnhau;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author keuuu
 */
public class Wordset {
       private TreeSet<String> set=new TreeSet<>();
    public Wordset(Scanner input){
        while(input.hasNext()){
            set.add(input.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        String kq="";
        for(String s:set) kq=kq+s+"\n";
        return kq;
    }
}
