package BaiTH3.Bai3;

import java.util.Scanner;

public class KhachHang {
    private String hoTen;
    private String soNha;
    private String maSo;

    public KhachHang() {

    }

    public KhachHang(String hoTen, String soNha, String maSo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getSoNha() {
        return soNha;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên KH: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập số nhà KH: ");
        soNha = scanner.nextLine();
        System.out.print("Nhập mã số KH: ");
        maSo = scanner.nextLine();
    }

    public void hienThongTin() {
        System.out.println("Khách hàng");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Số nhà: " + soNha);
        System.out.println("Mã số: " + maSo);
    }
}
