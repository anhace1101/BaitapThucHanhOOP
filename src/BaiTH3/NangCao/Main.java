package BaiTH3.NangCao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TamGiac> arrTamGiac = new ArrayList<>();
        System.out.println("Nhập số lượng tam giác: ");
        int soTamGiac = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < soTamGiac; i++) {
            System.out.println("Nhập tam giác thứ " + (i + 1));
            TamGiac tamGiac = new TamGiac();
            tamGiac.nhap();
            arrTamGiac.add(tamGiac);
        }

        for (int i = 0; i < arrTamGiac.size(); i++) {
            if (arrTamGiac.get(i).kiemTraTamGiac()) {
                System.out.println("Chu vi của tam giác " + (i + 1) + ": " + arrTamGiac.get(i).tinhChuVi());
                System.out.println("Diện tích của tam giác " + (i + 1) + ": " + arrTamGiac.get(i).tinhDienTich());
            } else
                System.out.println("Tam giác " + (i + 1) + " không phải là tam giác");
        }
    }
}
