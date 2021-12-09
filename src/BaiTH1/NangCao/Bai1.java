package BaiTH1.NangCao;

import java.util.Scanner;

// chương trình nhập số cạnh của đa giác + tính chu vi đa giác đó
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cạnh của đa giác: ");
        int soCanh = scanner.nextInt();
        float chuVi = 0f;
        for (int i = 0; i < soCanh; i++) {
            System.out.print("Nhập cạnh " + (i + 1) + " của đa giác: ");
            float canh = scanner.nextFloat();
            chuVi += canh;
        }
        System.out.println("Chu vi của đa giác: " + chuVi);
    }
}
