package BaiTH3.Bai1;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String diaChi;
    private int namSinh;

    public Nguoi() {

    }

    public Nguoi(String hoTen, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public void nhapTT() {
        //Nhap thong tin cho nguoi
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.println("Nhập năm sinh");
        namSinh = Integer.parseInt(scanner.nextLine());
    }

    public void inTT() {
        // in thong tin
        System.out.println("Họ tên: " + hoTen + "\nNăm sinh: " + namSinh);
        System.out.println("Địa chỉ: " + diaChi);
    }

}
