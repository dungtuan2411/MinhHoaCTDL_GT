package com.dunglt2004110051.kiemtragiuaky;

import java.util.Scanner;

public class Apple {
    int id;
    float khoiLuong;
    String color;

    Apple(int maID, float w, String c) {
        id = maID;
        khoiLuong = w;
        color = c;
    }

    static Apple nhapThongTin(Scanner scanner) {
        System.out.println("Nhập thông tin táo: ");
        System.out.print("Mã id: ");
        int id = scanner.nextInt();

        System.out.print("Khối lượng: ");
        float weight = scanner.nextFloat();

        scanner.nextLine();
        System.out.print("Màu: ");
        String color = scanner.nextLine();

        return new Apple(id, weight, color);
    }

    void inThongTin() {
        System.out.println("\nMã id: " + id);
        System.out.println("Khối lượng: " + khoiLuong);
        System.out.println("Màu: " + color);
    }
}
