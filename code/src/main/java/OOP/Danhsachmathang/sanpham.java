
package OOP.Danhsachmathang;

public class sanpham implements Comparable<sanpham>{
    private String id;
    private String ten;
    private String donvi;
    private int giamua;
    private int giaban;
    private int loinhuan;

    public sanpham(int id, String ten, String donvi, int giamua, int giaban) {
        this.id = "MH"+String.format("%03d",id);
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = giaban-giamua;
    }

    @Override
    public String toString() {
        return id+" "+ten+" "+donvi+" "+giamua+" "+giaban+" "+loinhuan;
    }
    
    
    @Override
    public int compareTo(sanpham o) {
       if(this.loinhuan >o.loinhuan){
           return -1;
       }else{
           return this.id.compareTo(o.id);
       }
    }
    
}
