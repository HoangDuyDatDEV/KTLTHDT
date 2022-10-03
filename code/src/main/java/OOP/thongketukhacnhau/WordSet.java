
package OOP.thongketukhacnhau;

import java.util.Scanner;
import java.util.TreeSet;

class WordSet {
      private TreeSet<String> set=new TreeSet<>();
    public WordSet(Scanner input){
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
