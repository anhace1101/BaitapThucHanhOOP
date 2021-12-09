package BaiTH3.Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hộ gia đình: ");
        int soKhachHang = Integer.parseInt(scanner.nextLine());
        BienLai bienLai;
        ArrayList<BienLai> arrBienLai = new ArrayList<>();

        for (int i = 0; i < soKhachHang; i++) {
            bienLai = new BienLai();
            System.out.println("Nhập thông tin của hộ gia đình thứ " + (i + 1));
            bienLai.nhapThongTin();
            arrBienLai.add(bienLai);
        }

        System.out.println("====== Thông tin biên lai của các hộ ======");
        for (int i = 0; i < arrBienLai.size(); i++) {
            System.out.println("Thông tin biên lai của hộ " + (i + 1));
            arrBienLai.get(i).hienThiBienLai();
        }
    }
}
