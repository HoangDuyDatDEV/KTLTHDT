
package OOP.tinhcong;


public class nhanvien {
    private String ma;
    private String ten;
    private int luong;
    private int songaycong;
    private String chucvu;
    private int phucap,thuong,thunhap;
    private int tong;

    public nhanvien(int id, String ten, int luong, int songaycong, String chucvu) {
        this.ma ="NV" +String.format("%02d",id);
        this.ten = ten;
        this.luong = luong;
        this.songaycong = songaycong;
        this.chucvu = chucvu;
        if(songaycong>=25){
            this.thuong= (int) (0.2*this.luong*this.songaycong);
        }
        else if(songaycong>=22 && songaycong<25){
             thuong=(int) (0.1*this.luong*this.songaycong);
        }
        else if( songaycong<22){
             this.thuong=0;
        }
        this.tong=this.luong*this.songaycong;
        this.phucap = check(this.chucvu) ;
        this.thunhap= this.luong*this.songaycong+this.phucap+this.thuong;
    }
    private int check(String abc){
         int x = 0 ;
        switch(abc){
            case "GD": x = 250000;
            break;
            case "PGD": x= 200000;
             break ;
            case "TP": x = 180000;
             break ;
            case "NV":x =150000;
             break ;
            default: x= 0;
            break ;
           
        }
         return x;
        }
    @Override
    public String toString() {
        
       
        return ma+" "+ten+" "+tong+" "+thuong+" "+phucap+" "+thunhap ;
    }
    
    
}
