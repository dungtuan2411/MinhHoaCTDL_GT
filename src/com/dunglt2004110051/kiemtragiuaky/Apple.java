package com.dunglt2004110051.kiemtragiuaky;

import java.util.Scanner;

public class Apple {
    int id;
    double khoiLuong;
    String color;

    public Apple() {
    }

    public Apple(int maID, double w, String c) {
        id = maID;
        khoiLuong = w;
        color = c;
    }

    public void nhapThongTin(Scanner scanner) {
        System.out.println("Nhập thông tin táo: ");
        System.out.print("Mã id: ");
        id = scanner.nextInt();

        System.out.print("Khối lượng: ");
        khoiLuong = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("Màu: ");
        color = scanner.nextLine();
    }

    public void inThongTin() {
        System.out.print("\n");
        System.out.println("Mã id: " + id);
        System.out.println("Khối lượng: " + khoiLuong);
        System.out.println("Màu: " + color);
    }
}
