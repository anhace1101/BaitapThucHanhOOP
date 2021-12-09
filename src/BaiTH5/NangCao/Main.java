package BaiTH5.NangCao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hộ dân: ");
        int soHoDan = Integer.parseInt(scanner.nextLine());

        ArrayList<HoDan> hoDans = new ArrayList<>();

        for (int i = 0; i < soHoDan; i++) {
            System.out.println("Hộ Dân thứ " + (i + 1));
            HoDan hoDan = new HoDan();
            hoDan.nhapThongTin();
            hoDans.add(hoDan);
        }
        System.out.println("=============================\n");
        for (int i = 0; i < hoDans.size(); i++) {
            System.out.println("Thông tin hộ dân thứ " + (i + 1));
            hoDans.get(i).inThongTin();
        }

    }
}
