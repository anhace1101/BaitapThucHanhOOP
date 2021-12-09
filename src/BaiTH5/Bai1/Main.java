package BaiTH5.Bai1;

public class Main {
    public static void main(String[] args) {
        Nguoi nguoi1 = new Nguoi();
        Nguoi nguoi2 = new Nguoi();
        NhanSu nhanSu1 = new NhanSu();
        NhanSu nhanSu2 = new NhanSu();
        //set lương cơ bản cho nhân sự
        nhanSu1.setLuongCoBan(1000);
        nhanSu2.setLuongCoBan(1000);

        //nhap thong tin
        System.out.println("Nhập thông tin người 1");
        nguoi1.nhapThongTin();
        System.out.println("Nhập thông tin người 2");
        nguoi2.nhapThongTin();
        System.out.println("Nhập thông tin nhân sự 1");
        nhanSu1.nhapThongTinNhanSu();
        System.out.println("Nhập thông tin nhân sự 2");
        nhanSu2.nhapThongTinNhanSu();

        //in thông tin
        System.out.println("Thông tin người 1");
        nguoi1.inThongTin();
        System.out.println("Thông tin người 2");
        nguoi2.inThongTin();
        System.out.println("Thông tin nhân sự 1");
        nhanSu1.inThongTinNhanSu();
        System.out.println("thông tin nhân sự 2");
        nhanSu2.inThongTinNhanSu();
    }
}
