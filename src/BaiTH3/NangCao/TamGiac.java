package BaiTH3.NangCao;

import java.util.Scanner;

public class TamGiac extends DaGiac {

    public TamGiac() {
        this.kichThuocCanh = new float[3];
        this.soCanh = 3;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước các cạnh: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Cạnh " + (i + 1) + ": ");
            kichThuocCanh[i] = Float.parseFloat(scanner.nextLine());
        }
    }

    @Override
    public void in() {
        System.out.println("Giá trị cạnh của tam giác: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Cạnh " + (i + 1) + ": " + kichThuocCanh[i]);
        }
    }

    @Override
    public float tinhChuVi() {
        float chuVi = 0f;
        for (int i = 0; i < 3; i++) {
            chuVi += kichThuocCanh[i];
        }
        return chuVi;
    }

    public boolean kiemTraTamGiac() {
        float canh1 = kichThuocCanh[0];
        float canh2 = kichThuocCanh[1];
        float canh3 = kichThuocCanh[2];

        if (canh1 + canh2 > canh3 && canh1 + canh3 > canh2 && canh2 + canh3 > canh1)
            return true;
        return false;
    }

    public double tinhDienTich() {
        float A = this.kichThuocCanh[0];
        float B = this.kichThuocCanh[1];
        float C = this.kichThuocCanh[2];
        float P = (A + B + C) / 2;
        return (double) Math.sqrt(P * (P - A) * (P - B) * (P - C));
    }
}
