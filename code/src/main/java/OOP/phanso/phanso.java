
package OOP.phanso;
import java.util.*;
public class phanso {
private long tuso;
private long mauso;

    public void phanso() {
        long x=gcd(tuso,mauso);
        tuso/=x;
        mauso/=x;
    }

    @Override
    public String toString() {
        return tuso+"/"+mauso;
    }
    
    public phanso(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    private long gcd(long a, long b) {
      long t;
      while(b>0){
          t=a%b;
          a=b;b=t;
          
      }
      return a;
    }
  
}
