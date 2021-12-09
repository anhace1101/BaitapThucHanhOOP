package BaiTH5.Bai2;

public class Main {
    public static void main(String[] args) {
        Nguoi nguoi = new Nguoi();
        SinhVien sinhVien = new SinhVien();
        //nhập thônng tin
        System.out.println("nhập thông tin người");
        nguoi.nhapThongTin();
        System.out.println("Nhập thông tin sinh zien");
        sinhVien.nhapThongTin();

        //in thong tin
        nguoi.inThongTin();
        sinhVien.inThongTin();
    }
}
