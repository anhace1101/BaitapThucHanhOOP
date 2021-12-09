package BaiTH5.Bai2;


import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected String diaChi;
    protected int namSinh;

    public Nguoi() {
        super();
    }

    public Nguoi(String ht, String dc, int namSinh) {
        hoTen = ht;
        diaChi = dc;
        this.namSinh = namSinh;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhập năm sinh:");
        namSinh = Integer.parseInt(scanner.nextLine());
    }

    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Năm sinh: " + namSinh);
    }
}
